/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.Scanner;

public class Programacion {
    
    
  private Sala[] salas;
int contador;

    public Programacion() {
        
        this.contador=0;
        this.salas=new Sala[2];
        salas[0]=new Sala("Cinema");
       salas[1]=new Sala("Concierto");
         
    }



    
    
    
    public void crearprogramacion(String nombre){
        
        int a=1;
       
        
        for (int i=0; i<2;i++){
            Scanner plop=new Scanner(System.in);
            
            if(nombre.equals(salas[i].getNombredelasala()) ){
            
                 System.out.println("\n");
            System.out.println("                                    Bienvenido a la sala de "+salas[i].getNombredelasala()+"\n");
           
             salas[i].asignarsemana();
              
             
              while(a==1){
             
             salas[i].asignardiasparasemana();
            
            System.out.print("\n"+"Si Desea asignar una funcion para otro dia de la misma semana oprima  1 o de lo contrario presione 0: ");
            a=plop.nextInt();
            plop.nextLine();
              }
              
              
              
              
              
              
              
              
              
               while(a==1){
             
             salas[i].asignardiasparasemana();
            
            System.out.print("\n"+"Si Desea asignar una funcion para otro dia de la misma semana oprima  1 o de lo contrario presione 0: ");
            a=plop.nextInt();
            plop.nextLine();
              }
              
        }
        
        

    }
    
    
}
    
   public void verprogramacion(){
   
         
   for (int i=0;i<2;i++){
   
       System.out.println("                         En la sala "+salas[i].getNombredelasala());
       salas[i].versemana();
       System.out.print("\n");
       
      
   }
   
 
   
   
   
   } 
   
   
   
    
}