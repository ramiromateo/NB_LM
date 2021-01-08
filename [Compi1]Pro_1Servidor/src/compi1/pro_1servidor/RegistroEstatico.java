package compi1.pro_1servidor;

import Analizadores.parserSer;
import Analizadores.scannerSer;
import Objetos.Producto;
import Objetos.Tienda;
import Objetos.Usuario;
import java.io.BufferedReader;
import java.io.StringReader;

public class  RegistroEstatico {
    public static String id="";
    public static String pass="";
    
    public static void CrearUser(String str){
        parserSer parser = new parserSer(new scannerSer(new BufferedReader( new StringReader(str))));
        try {
            parser.parse();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for(Usuario use:ConsoleServer.usuarios)
            System.out.println(use.getId()+use.getName()+use.getApellido()+use.getPassword()+use.getTelefono()+use.getCorreo()+use.getDireccion());
        System.out.println("");
    
    }
    
    public static void comprobarLogin(){
        String existe="fail";
        for(Usuario use:ConsoleServer.usuarios){
            try{
                if(use.getId().equals(Integer.parseInt(id))){
                    existe="falso";
                    if(use.getPassword().equals(pass)){
                        existe="true";
                    }
                }
            }catch(Exception e){}
        }
        ConsoleServer.RespuestaCliente="$reply$\n" +
"	$Usuario$\n" +
"		$id$ "+id+" $id-$\n" +
"		$access$ "+existe+" $access-$ \n" +
"	$Usuario-$\n" +
"$reply-$";
    }
    
    public static void comprobarExisteciaUser(){
        String existe="True";
        try{
            Integer ultimo;
            String nombreultimo="";
            try{
                ultimo=ConsoleServer.usuarios.getLast().getId();
            }catch (Exception e){
                ultimo=-1;
            }
            for(int i=0;i<ConsoleServer.usuarios.size()-1;i++){
                
                if(ConsoleServer.usuarios.get(i).getId().equals(ultimo))
                {
                    existe="False";
                    ConsoleServer.usuarios.removeLast();
                    nombreultimo=ConsoleServer.usuarios.get(i).getName();
                }
            }
            ConsoleServer.RespuestaCliente="$reply$\n" +
"	$Usuario$\n" +
"		$registro id = "+ultimo+"$ "+existe+" $registro-$\n" +
"	$Usuario-$\n" +
"$reply-$";
            //parte de servidor
        if(existe.equalsIgnoreCase("true"))
            ConsoleServer.Enconsola+=">>Se creo el usuario \""+ConsoleServer.usuarios.getLast().getName() +"\" con Exito con id \""+ultimo +"\"\n";
        else ConsoleServer.Enconsola+=">>No Se creo el usuario \""+nombreultimo +" Porque el id ya esta en uso\n" ;
        }catch(Exception e){}
                
    }
    
    public static void CrearModificarTienda(String st){
        //se crea la nueva tienda
        String seregistro="false";
        if(st.equalsIgnoreCase("crear")&&checkExistenciaTienda()){
            ConsoleServer.tiendas.add(new Tienda(Integer.parseInt(ConsoleServer.arr[0]),Integer.parseInt(ConsoleServer.arr[1]),ConsoleServer.arr[2],ConsoleServer.arr[3],Integer.parseInt(ConsoleServer.arr[4]),ConsoleServer.arr[5]));
            seregistro="True";
        }
        ConsoleServer.RespuestaCliente="$reply$\n" +
"	$tienda$\n" +
"		$registro id = "+ConsoleServer.arr[0]+"$ "+seregistro+" $registro-$\n" +
"	$tienda-$\n" +
"$reply-$";
        if(seregistro.equalsIgnoreCase("true")&&st.equalsIgnoreCase("crear"))
            ConsoleServer.Enconsola+=">>Se creo La tienda \""+ ConsoleServer.arr[2]+"\" con Exito con id \""+ConsoleServer.arr[0]+"\"\n";
        else if(st.equalsIgnoreCase("crear"))ConsoleServer.Enconsola+=">>No Se creo la tienda \""+ConsoleServer.arr[2] +"\" Porque el id ya esta en uso\n" ;
        
        //se modifica la tienda que se envia
        if(st.equalsIgnoreCase("modificacion")){
            ConsoleServer.RespuestaCliente="";
            
            String encontrado="false";
            for(Tienda tie:ConsoleServer.tiendas){
                if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arr[0]))&&tie.getPropietario().equals(Integer.parseInt(ConsoleServer.arr[1]))){
                    if(!ConsoleServer.arr[2].equals(""))
                        tie.setName(ConsoleServer.arr[2]);
                    if(!ConsoleServer.arr[3].equals(""))
                        tie.setDireccion(ConsoleServer.arr[3]);
                    if(!ConsoleServer.arr[4].equals(""))
                        tie.setTelefono(Integer.parseInt(ConsoleServer.arr[4]));
                    encontrado="true";
                }
            }
            ConsoleServer.RespuestaClienteaux+="$reply$\n" +
"	$tienda$\n" +
"		$modificar id = "+ConsoleServer.arr[0]+"$ "+encontrado+" $modificar-$\n" +
"	$tienda-$\n" +
"$reply-$\n";
            ConsoleServer.RespuestaCliente=ConsoleServer.RespuestaClienteaux;
            
            ////consola de administrador
            if(encontrado.equalsIgnoreCase("true"))
            ConsoleServer.Enconsola+=">>Se Modifico La tienda con Exito con id \""+ConsoleServer.arr[0]+"\"\n";
            else ConsoleServer.Enconsola+=">>No Se pudo modificar la tienda co id \""+ConsoleServer.arr[0] +"\" Puede que el usuario no sea el propietario\n" ;
            
        }
        //eliminamos la tienda si es eliminar
        if(st.equalsIgnoreCase("eliminar")){
            String eliminado="falso";
            ConsoleServer.RespuestaCliente="";
            System.out.println(st+"**/*/*/*/*/*/*/*/*");
            for(Tienda tie:ConsoleServer.tiendas){
                if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arr[0]))&&tie.getPropietario().equals(Integer.parseInt(ConsoleServer.arr[1]))){
                    ConsoleServer.tiendas.remove(tie);
                    eliminado="true";
                    break;
                }
            }
            ConsoleServer.RespuestaClienteaux+="$reply$\n" +
"	$tienda$\n" +
"		$eliminar id = "+ConsoleServer.arr[0]+"$ "+eliminado+" $eliminar-$\n" +
"	$tienda-$\n" +
"$reply-$\n";
            ConsoleServer.RespuestaCliente=ConsoleServer.RespuestaClienteaux;
            
            if(eliminado.equalsIgnoreCase("true"))
            ConsoleServer.Enconsola+=">>Se elimino La tienda con Exito con id \""+ConsoleServer.arr[0]+"\"\n";
            else ConsoleServer.Enconsola+=">>No Se pudo elimino la tienda co id \""+ConsoleServer.arr[0] +"\" Puede que el usuario no sea el propietario\n" ;
            
        }
        
        
        
        
        for(Tienda tie:ConsoleServer.tiendas)
            System.out.println(tie.getCodigo()+"  "+tie.getPropietario());
        
        for(int i=0; i<ConsoleServer.arr.length;i++)
            ConsoleServer.arr[i]="";
                
    }
    
    public static void CrearModificarProducto(String st){
        String seregistro="false";
        if(st.equalsIgnoreCase("crear") && checkExistenciaProducto()){
            ConsoleServer.productos.add(new Producto(Integer.parseInt(ConsoleServer.arrP[0]),ConsoleServer.arrP[1],Float.parseFloat(ConsoleServer.arrP[2]),ConsoleServer.arrP[3],ConsoleServer.arrP[4],Float.parseFloat(ConsoleServer.arrP[5]),ConsoleServer.arrP[6],Integer.parseInt(ConsoleServer.arrP[7]),Float.parseFloat(ConsoleServer.arrP[8])));
            seregistro="True";
            
        }
        ConsoleServer.RespuestaCliente="$reply$\n" +
"	$producto$\n" +
"		$registro id = "+ConsoleServer.arrP[0]+ " sucursal="+ConsoleServer.arrP[7]+" $ "+seregistro+" $registro-$\n" +
"	$producto-$\n" +
"$reply-$";
        
        //respuesta de consola de server
        
        if(seregistro.equalsIgnoreCase("true")&&st.equalsIgnoreCase("crear"))
            ConsoleServer.Enconsola+=">>Se creo el Producto \""+ ConsoleServer.arrP[1]+"\" con Exito con id \""+ConsoleServer.arrP[0]+"\"\n";
        else if(st.equalsIgnoreCase("crear"))ConsoleServer.Enconsola+=">>No Se creo el Producto \""+ConsoleServer.arrP[1] +"\" Porque el id ya esta en uso\n" ;
        
        
        
        
        
        ////modificar
        if(st.equalsIgnoreCase("modificar")){
            ConsoleServer.RespuestaCliente="";
            
            String encontrado="false";
            for(Producto tie:ConsoleServer.productos){
                if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arrP[0]))&&tie.getSucursal().equals(Integer.parseInt(ConsoleServer.arrP[7]))){
                    if(!ConsoleServer.arrP[1].equals(""))
                        tie.setName(ConsoleServer.arrP[1]);
                    if(!ConsoleServer.arrP[2].equals(""))
                        tie.setCantidad(Float.parseFloat(ConsoleServer.arrP[2]));
                    if(!ConsoleServer.arrP[3].equals(""))
                        tie.setMarca(ConsoleServer.arrP[3]);
                    if(!ConsoleServer.arrP[4].equals(""))
                        tie.setColor(ConsoleServer.arrP[4]);
                    if(!ConsoleServer.arrP[5].equals(""))
                        tie.setTamano(Float.parseFloat(ConsoleServer.arrP[5]));
                    if(!ConsoleServer.arrP[8].equals(""))
                        tie.setPrecio(Float.parseFloat(ConsoleServer.arrP[8]));
                    
                    encontrado="true";
                }
            }
            ConsoleServer.RespuestaClienteaux+="$reply$\n" +
"	$producto$\n" +
"		$modificar id = "+ConsoleServer.arrP[0]+"$ "+encontrado+" $modificar-$\n" +
"	$producto-$\n" +
"$reply-$\n";
            ConsoleServer.RespuestaCliente=ConsoleServer.RespuestaClienteaux;
            
            //consola de admin
            if(encontrado.equalsIgnoreCase("true"))
            ConsoleServer.Enconsola+=">>Se Modifico el producto con Exito con id \""+ConsoleServer.arrP[0]+"\"\n";
            else ConsoleServer.Enconsola+=">>No Se pudo modificar el producto con id \""+ConsoleServer.arrP[0] +"\" Puede que el usuario no sea el propietario o no pertenezca a la sucursal\n" ;
        }
        ////eliminar producto
        if(st.equalsIgnoreCase("eliminar")){
            String eliminado="falso";
            ConsoleServer.RespuestaCliente="";
            
            for(Producto tie:ConsoleServer.productos){
                if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arrP[0]))&&tie.getSucursal().equals(Integer.parseInt(ConsoleServer.arrP[7]))){
                    ConsoleServer.productos.remove(tie);
                    eliminado="true";
                    break;
                }
            }
            ConsoleServer.RespuestaClienteaux+="$reply$\n" +
"	$producto$\n" +
"		$eliminar id = "+ConsoleServer.arrP[0]+"$ "+eliminado+" $eliminar-$\n" +
"	$producto-$\n" +
"$reply-$\n";
            ConsoleServer.RespuestaCliente=ConsoleServer.RespuestaClienteaux;
            
            //en consola admin
            if(eliminado.equalsIgnoreCase("true"))
            ConsoleServer.Enconsola+=">>Se elimino el producto con Exito con id \""+ConsoleServer.arrP[0]+"\" \n";
            else ConsoleServer.Enconsola+=">>No Se pudo elimino el producto co id \""+ConsoleServer.arrP[0] +"\" Puede que el usuario no sea el propietario o no pertenezca a la sucursal indicada\n" ;
            
        }
        
        
        for(int i=0; i<ConsoleServer.arrP.length;i++)
            if(i!=7)
            ConsoleServer.arrP[i]="";
        
        
    }
    
    public  static boolean checkExistenciaTienda(){
        for(Tienda tie:ConsoleServer.tiendas)
            if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arr[0])))
                return false;
        return true;
        
    }
    
    public  static boolean checkExistenciaProducto(){
        for(Producto tie:ConsoleServer.productos)
            if(tie.getCodigo().equals(Integer.parseInt(ConsoleServer.arrP[0])) && tie.getSucursal().equals(Integer.parseInt(ConsoleServer.arrP[7])))
                return false;
        return true;
        
    }
    
    public static void MandarTiendas(String idpropietario){
        ConsoleServer.RespuestaCliente="$reply$\n" +
"	$lista$\n";
        for(Tienda tie:ConsoleServer.tiendas){
            if(tie.getPropietario().equals(Integer.parseInt(idpropietario))){
                ConsoleServer.RespuestaCliente+="		$tienda$\n" +
"			$codigo$ "+tie.getCodigo()+" $codigo-$\n" +
"			$propietario$ "+idpropietario+" $propietario-$\n" +
"			$nombre$ \""+tie.getName()+"\" $nombre-$\n" +
"			$direccion$ \""+tie.getDireccion()+"\" $direccion-$\n" +
"			$telefono$ "+tie.getTelefono()+" $telefono-$\n" +
"		$tienda -$\n";
            }
        }
        if(!ConsoleServer.RespuestaCliente.contains("tienda"))
            ConsoleServer.RespuestaCliente+="\"vacio\"";
        ConsoleServer.RespuestaCliente+="	$lista -$\n" +
"$reply-$";
    }
    
    public static void MandarProductos(String idpropietario){
        ConsoleServer.RespuestaCliente="$reply$\n" +
"	$lista$\n";
        
        for(Producto tie:ConsoleServer.productos){
            if(tie.getSucursal().equals(Integer.parseInt(idpropietario))){
                ConsoleServer.RespuestaCliente+="		$producto$\n" +
                        
"			$codigo$ "+tie.getCodigo()+" $codigo-$\n" +
"			$nombre$ \""+tie.getName()+"\" $nombre-$\n" +
"			$cantidad$ "+tie.getCantidad()+" $cantidad-$\n" +
"			$marca$ \""+tie.getMarca()+"\" $marca-$\n" +
"			$color$ \""+tie.getColor()+"\" $color-$\n" +
"			$tamaño$ "+tie.getTamano()+" $tamaño-$\n" +
"			$sucursal$ "+tie.getSucursal()+" $sucursal-$\n" +
"			$precio$ "+tie.getPrecio()+" $precio-$\n" +                        
                        
"		$producto -$\n";
            }
        }
        
        if(!ConsoleServer.RespuestaCliente.contains("producto"))
            ConsoleServer.RespuestaCliente+="\"vaciop\"";
        ConsoleServer.RespuestaCliente+="	$lista -$\n" +
"$reply-$";
    }
}
