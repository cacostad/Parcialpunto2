/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

public class Sala {
    
    
   private String nombredelasala;
    private Semana[] semanas;
    private int contador;
    private int contador2;
    private int contador3;
    
   Scanner plop=new Scanner(System.in);

    public Sala(String nombredelasala) {
        this.nombredelasala = nombredelasala;
        this.semanas = new Semana[2];
      semanas[0]=new Semana(0);
         semanas[1]=new Semana(0);
        this.contador=0;
        this.contador2=0;
        this.contador3=0;
    }

    public String getNombredelasala() {
        return nombredelasala;
    }

    public void setNombredelasala(String nombredelasala) {
        this.nombredelasala = nombredelasala;
    }
    
    public void asignarsemana(){
        
        
        
        for(int i =0;i<2;i++){
             
           if(semanas[i].getNumero()!=0){
               
               this.contador++;
       
           }
        
         
           
        }
        
        System.out.println("Es hora de asignar un nuevo evento, le recuedo que para este caso solo contamos con dos semanas de disponibilidad" ) ; 
         System.out.println("                                           -Eventos programados: "+this.contador);
        if (this.contador<=2&&this.contador2<2){
             System.out.println("\n"+"Ingrese el numero de la semana del evento: ") ;
             int u=plop.nextInt();
            semanas[this.contador2].setNumero(u);
        
        this.contador2++;
        
        }else{System.out.println("No hay espacio para más funciones :C ");}
        
        }
        
   public void versemana(){
   
for (int i=0;i<2;i++){
    
    if(semanas[i].getNumero()!=0){

    System.out.println("Hay funciones para la semana "+semanas[i].getNumero());
    semanas[i].verdias();
    
    }

}
   
   
   
   
   }
   
   public void asignardiasparasemana(){
        System.out.println("-Porfavor reingrese el numero de la semana: ");
          int b=plop.nextInt();
       plop.nextLine();
      for (int i=0;i<2;i++){
           
         
          
          if( b== semanas[i].getNumero()){
            System.out.println("-Ingrese el dia de la semana en el cual va a haber una funcion");
            String c=plop.nextLine();
                System.out.println("-Ingrese La fecha de la actividad, para este denotelo de la siguiente forma 18:06:17");
                String d=plop.nextLine();
           semanas[i].asignardias(c,d); 
           
           i=2;
          }else{System.out.println("Usted aun no ha asigando una funcion para esa semana");}
      
      }
       }
       
       
       }
   
   
   
   
    
    

