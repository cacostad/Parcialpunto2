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
import java.util.Scanner;
public class Semana {
    
    private int numero;
    private Sala[] salas;
    private Dia[] dias;
       private int contador;
    
    

    public Semana(int numero) {
        this.numero = 0;
        this.salas = new Sala[2];
        this.dias=new Dia[5];
        dias[0]=new Dia("vacio","vacio");
        dias[1]=new Dia("vacio","vacio");
        dias[2]=new Dia("vacio","vacio");
        dias[3]=new Dia("vacio","vacio");
        dias[4]=new Dia("vacio","vacio");
        
           this.contador=0;
           
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void asignardias(String nombredia, String fechadia){
        
        Scanner plop= new Scanner(System.in);
        
        String vacio="vacio";
        for (int i=0;i<5;i++){
        
        if(vacio.equals(dias[i].getNombre())){
            
            dias[i].setNombre(nombredia);
            dias[i].setFecha(fechadia);
            
            System.out.println("-Ingrese la hora de inicio de la funcion: ");
            String h=plop.nextLine();
            System.out.println("-Ingrese la hora de finalizacion de la funcion: ");
            String s=plop.nextLine();
            dias[i].asignarhorarios(h, s);
            
        i=5;
        
        }
        
        
        
        }
       
     
    }
    
    
    
     public void verdias(){
     String vacio="vacio";
          for (int i=0;i<5;i++){
              if(vacio.equals(dias[i].getNombre())){}else{System.out.println("  -El dia: " + dias[i].getNombre()+" "+dias[i].getFecha());}
           dias[i].verhorarios();
          
           
          } 
         
         
     
     }
}
