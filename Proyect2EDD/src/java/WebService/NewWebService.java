/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author José
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @WebMethod(operationName = "comprobar")
    public boolean comprobar(@WebParam(name = "identifica") int ide,@WebParam(name = "name2") String contra) {
        return CargaMasiva.ar.verificar(ide, contra);    
    }
    
    @WebMethod(operationName = "crearEstudiante")
    public boolean crearEstudiante(@WebParam(name = "carne") int carne,@WebParam(name = "nombre") String nombre,@WebParam(name = "apellido") String apellido,@WebParam(name = "semestre") int semestre) {
        return CargaMasiva.listaEstudiantes.insertarLDC(new Estudiante(carne,nombre,apellido, semestre));
    }
    
    @WebMethod(operationName = "crearLibrera")
    public void crearLibrera(@WebParam(name = "idLibrera") int idLibrera,@WebParam(name = "genero") String genero) {
        CargaMasiva.estantes.insertar(new Librera(idLibrera,genero));
    }
    
    @WebMethod(operationName = "crearLibro")
    public void crearLibro(@WebParam(name = "idLibro") int idLibro,@WebParam(name = "titulo") String titulo,@WebParam(name = "autor") String autor,@WebParam(name = "nuPaginas") int nuPaginas,@WebParam(name = "ejemplares") int ejemplares,@WebParam(name = "idGenero") int idGenero) {
        CargaMasiva.estantes.insertarLibro(new Libro(idLibro,titulo,autor,nuPaginas,ejemplares,idGenero));
    }
    @WebMethod(operationName = "obtenerLibrosjson")
    public String obtenerLibrosjson() {
        return CargaMasiva.estantes.obtenerJSONLibrera();
    }
    @WebMethod(operationName = "eliminarLibrera")
    public void eliminarLibrera(@WebParam(name = "idlibrera") int idlibrera) {
        CargaMasiva.estantes.eliminarLibrera(idlibrera);
    }
    @WebMethod(operationName = "obtenerJsonEstudiantes")
    public String obtenerJsonEstudiantes() {
        return CargaMasiva.listaEstudiantes.obtenerJsonEstudiantes();
    }
    @WebMethod(operationName = "obtenerJsonLibros")
    public String obtenerJsonLibros() {
        return CargaMasiva.estantes.obtenerJSONLibros();
    }
}
