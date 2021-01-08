package c1.practica1;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.util.Collections;
import java.util.LinkedList;

public class Reporte {
    private PdfPCell carne;
    private PdfPCell nombre;
    private PdfPCell apellido;
    private PdfPCell tarea;
    private PdfPCell ht;
    private PdfPCell ec;
    private PdfPCell practicas;
    private PdfPCell proyectos;
    private PdfPCell efinal;
    private PdfPCell notaFinal;
    
    
    private PdfPTable tablarp;
    private LinkedList<PdfPTable> listReportes;
    
    Reporte(){
        listReportes=new LinkedList<>();
        listReportes.add(new PdfPTable(10));
        listReportes.add(new PdfPTable(10));
        listReportes.add(new PdfPTable(10));
        for(PdfPTable ta:this.listReportes)
            ta.setWidthPercentage(100);
    }
    public void AgregarEncabezado(){
        carne=new PdfPCell(new Paragraph("Carne",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));carne.setBackgroundColor(BaseColor.GREEN);
        nombre=new PdfPCell(new Paragraph("Nombres",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));nombre.setBackgroundColor(BaseColor.GREEN);
        apellido=new PdfPCell(new Paragraph("Apellidos",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));apellido.setBackgroundColor(BaseColor.GREEN);
        
        tarea=new PdfPCell(new Paragraph("Tarea "+Inicio.Tareas+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));tarea.setBackgroundColor(BaseColor.GREEN);
        ht=new PdfPCell(new Paragraph("HT "+Inicio.Hojas+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));ht.setBackgroundColor(BaseColor.GREEN);
        ec=new PdfPCell(new Paragraph("EC "+Inicio.ExamenCorto+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));ec.setBackgroundColor(BaseColor.GREEN);
        practicas=new PdfPCell(new Paragraph("Practicas "+Inicio.Practicas+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));practicas.setBackgroundColor(BaseColor.GREEN);
        proyectos=new PdfPCell(new Paragraph("Proyectos "+Inicio.Proyectos+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));proyectos.setBackgroundColor(BaseColor.GREEN);
        efinal=new PdfPCell(new Paragraph("EF "+Inicio.Final+"%",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));efinal.setBackgroundColor(BaseColor.GREEN);
        notaFinal=new PdfPCell(new Paragraph("NotaFinal 100",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));notaFinal.setBackgroundColor(BaseColor.GREEN);
        for(PdfPTable tan:this.listReportes){
            tan.addCell(carne);
            tan.addCell(nombre);
            tan.addCell(apellido);
            tan.addCell(tarea);
            tan.addCell(ht);
            tan.addCell(ec);
            tan.addCell(practicas);
            tan.addCell(proyectos);
            tan.addCell(efinal);
            tan.addCell(notaFinal);   
        }
            
        
    }

    public PdfPTable getRA() {
        for(Estudiante estudia:Inicio.lisEstudiante){
            float Ttarea=(float)(estudia.getSumaTareas()*Inicio.Tareas)/(Estudiante.cantidaTareas*100);
            
            float Thoja=(float)(estudia.getSumaHt()*Inicio.Hojas)/(Estudiante.cantidaHojas*100);
            
            float Tec=(float)(estudia.getSumaEc()*Inicio.ExamenCorto)/(Estudiante.cantidaExamenes*100);
            
            float Tpra=(float)(estudia.getSumaPra()*Inicio.Practicas)/(Estudiante.cantidaPracticas*100);
            
            float Tpro=(float)(estudia.getSumaPro()*Inicio.Proyectos)/(Estudiante.cantidaProyectos*100);
            
            float Total=(float)(Ttarea+Thoja+Tec+Tpra+Tpro+(float)Inicio.Final*estudia.getFina()/100);
            if(Total>61){
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+estudia.getCarne(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+estudia.getNombre(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+estudia.getApellido(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Ttarea,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Thoja,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Tec,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Tpra,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Tpro,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Inicio.Final*estudia.getFina()/100,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(0).addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
            }else{
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+estudia.getCarne(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+estudia.getNombre(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+estudia.getApellido(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Ttarea,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Thoja,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Tec,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Tpra,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Tpro,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Inicio.Final*estudia.getFina()/100,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(1).addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
            }
        }
        return this.listReportes.get(0);
    }
    public PdfPTable getRR() {
        return this.listReportes.get(1);
    }
    public PdfPTable getRP() {
        tablarp=new PdfPTable(10+Estudiante.cantidaExamenes+Estudiante.cantidaHojas+Estudiante.cantidaPracticas+Estudiante.cantidaProyectos+Estudiante.cantidaTareas);
        tablarp.setWidthPercentage(100);
        
            tablarp.addCell(carne);
            tablarp.addCell(nombre);
            tablarp.addCell(apellido);
            for(int i=1;i<=Estudiante.cantidaTareas;i++)
                tablarp.addCell(new PdfPCell(new Paragraph("Tarea "+i,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
            tablarp.addCell(tarea);
            for(int i=1;i<=Estudiante.cantidaHojas;i++)
                tablarp.addCell(new PdfPCell(new Paragraph("HT "+i,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
            tablarp.addCell(ht);
            for(int i=1;i<=Estudiante.cantidaExamenes;i++)
                tablarp.addCell(new PdfPCell(new Paragraph("Corto "+i,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
            tablarp.addCell(ec);
            for(int i=1;i<=Estudiante.cantidaPracticas;i++)
                tablarp.addCell(new PdfPCell(new Paragraph("Practica "+i,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
            tablarp.addCell(practicas);
            for(int i=1;i<=Estudiante.cantidaProyectos;i++)
                tablarp.addCell(new PdfPCell(new Paragraph("Proyecto "+i,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
            tablarp.addCell(proyectos);
            tablarp.addCell(efinal);
            tablarp.addCell(notaFinal);   
        
        for(Estudiante estudia:Inicio.lisEstudiante){
            float Ttarea=(float)(estudia.getSumaTareas()*Inicio.Tareas)/(Estudiante.cantidaTareas*100);
            
            float Thoja=(float)(estudia.getSumaHt()*Inicio.Hojas)/(Estudiante.cantidaHojas*100);
            
            float Tec=(float)(estudia.getSumaEc()*Inicio.ExamenCorto)/(Estudiante.cantidaExamenes*100);
            
            float Tpra=(float)(estudia.getSumaPra()*Inicio.Practicas)/(Estudiante.cantidaPracticas*100);
            
            float Tpro=(float)(estudia.getSumaPro()*Inicio.Proyectos)/(Estudiante.cantidaProyectos*100);
            
            float Total=(float)(Ttarea+Thoja+Tec+Tpra+Tpro+(float)Inicio.Final*estudia.getFina()/100);
            
                tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getCarne(),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getNombre(),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getApellido(),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                for(int i=0;i<Estudiante.cantidaTareas;i++){
                    if(estudia.getListatarea().size()>i)
                        tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getListatarea().get(i),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                    else tablarp.addCell(new PdfPCell(new Paragraph("0",FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));;
                }
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Ttarea,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                for(int i=0;i<Estudiante.cantidaHojas;i++){
                    if(estudia.getLisht().size()>i)
                        tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getLisht().get(i),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                    else tablarp.addCell(new PdfPCell(new Paragraph("0",FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));;
                }
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Thoja,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                for(int i=0;i<Estudiante.cantidaExamenes;i++){
                    if(estudia.getLisec().size()>i)
                        tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getLisec().get(i),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                    else tablarp.addCell(new PdfPCell(new Paragraph("0",FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));;
                }
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Tec,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                for(int i=0;i<Estudiante.cantidaPracticas;i++){
                    if(estudia.getListpra().size()>i)
                        tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getListpra().get(i),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                    else tablarp.addCell(new PdfPCell(new Paragraph("0",FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));;
                }
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Tpra,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                for(int i=0;i<Estudiante.cantidaProyectos;i++){
                    if(estudia.getListpro().size()>i)
                        tablarp.addCell(new PdfPCell(new Paragraph(""+estudia.getListpro().get(i),FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                    else tablarp.addCell(new PdfPCell(new Paragraph("0",FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));;
                }
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Tpro,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Inicio.Final*estudia.getFina()/100,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
                if(Total>61 && Inicio.aprobado)
                    tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.GREEN))));
                else if(Inicio.reprobado) tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.RED))));
                else tablarp.addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 5, Font.BOLD, BaseColor.BLACK))));
        }
        
        
        return tablarp;
    }
    public PdfPTable getRE() {
        Collections.sort(Inicio.lisEstudiante);
        int contador=0;
        for(Estudiante estudia:Inicio.lisEstudiante)if(contador<10){
            float Ttarea=(float)(estudia.getSumaTareas()*Inicio.Tareas)/(Estudiante.cantidaTareas*100);
            
            float Thoja=(float)(estudia.getSumaHt()*Inicio.Hojas)/(Estudiante.cantidaHojas*100);
            
            float Tec=(float)(estudia.getSumaEc()*Inicio.ExamenCorto)/(Estudiante.cantidaExamenes*100);
            
            float Tpra=(float)(estudia.getSumaPra()*Inicio.Practicas)/(Estudiante.cantidaPracticas*100);
            
            float Tpro=(float)(estudia.getSumaPro()*Inicio.Proyectos)/(Estudiante.cantidaProyectos*100);
            
            float Total=(float)(Ttarea+Thoja+Tec+Tpra+Tpro+(float)Inicio.Final*estudia.getFina()/100);
            
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+estudia.getCarne(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+estudia.getNombre(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+estudia.getApellido(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Ttarea,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Thoja,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Tec,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Tpra,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Tpro,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Inicio.Final*estudia.getFina()/100,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
                this.listReportes.get(2).addCell(new PdfPCell(new Paragraph(""+(float)Total,FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
            contador++;
        }
        
        return this.listReportes.get(2);
    }
}
