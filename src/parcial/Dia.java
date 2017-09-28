/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author CRIS
 */
public class Dia {
    
   private String fecha;
    private String nombre;
    private Horario[] horarios;

    public Dia(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.horarios=new Horario[2];
                this.horarios[0]=new Horario("vacio","vacio");
                this.horarios[1]=new Horario("vacio","vacio");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void asignarhorarios(String horainicio, String horafin){
       
        
        String vacio="vacio";
        for (int i=0;i<2;i++){
        
        if(vacio.equals(horarios[i].getInicio())){
            
            horarios[i].setInicio(horainicio);
                        horarios[i].setFin(horafin);

            
        i=2;
        
        }
        
        }
       
     
    }
    
    
    public void verhorarios(){
     String vacio="vacio";
          for (int i=0;i<2;i++){
              if(vacio.equals(horarios[i].getInicio())){}else{System.out.println("  de " + horarios[i].getInicio()+" a "
                      +horarios[i].getFin());}
           
          
          } 
         
         
     
     }
    
}
