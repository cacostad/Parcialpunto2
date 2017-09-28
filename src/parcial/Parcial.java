
package parcial;
import java.util.Scanner;

public class Parcial {

    
    public static void main(String[] args) {
     
        Scanner plop=new Scanner(System.in);
        Sala[] salas= new Sala[2];
         salas[0]=new Sala("Cinema");
       salas[1]=new Sala("Concierto");
        Semana[] semanas=new Semana[2];
        Programacion programar=new Programacion(); 
        int a =0;
        
        while (a==0){
        System.out.println("                                    Bienvenido organizador de funciones");
        
        System.out.println("Que desea hacer: ");
         System.out.println("1. Agregar programacion para alguna de las salas.");
          System.out.println("2. Ver la programacion de las salas.");
                      
          int c=plop.nextInt();
           plop.nextLine();
          switch (c){
          
              case 1:{
                  
                  System.out.println("\n");
                                    

        System.out.println("Actualmente tenemos las dos siguientes salas: Cinema, Concierto ");
        
        System.out.println("- Por favor ingrese el nombre de la sala a la cual desea añadir una funcion.");
         System.out.print("       -Nombre:");
        String nombre=plop.nextLine();
        programar.crearprogramacion(nombre);
        
        break;
              }
        
              case 2:{
        
        
        System.out.print("\n");
        
                
programar.verprogramacion();

System.out.print("Esta es un espacio de pausa.... presione 1 para continuar :3");
int pausa=plop.nextInt();
plop.nextLine();

break;
              }
          }
        }
        
        
        
    }
    
}
