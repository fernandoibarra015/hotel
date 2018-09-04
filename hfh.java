/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class hfh {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion=0,opcionmenu=0, opcionhabitacion=0, ocupado=0, c1=0, c2=0, c3=0;
        String Hotel[][]=new String[6][6];
         System.out.println("\nFachada de nuestro \\ Gran Hotel Plaza \\");
         for(int y=0;y<6;y++){
             System.out.print("  ");
             System.out.print("  ~ ");
             
         }
         System.out.print("\n");
        for(int f=0;f<5;f++){
            for(int c=0;c<6;c++){
                Hotel[f][c]="[ ]";
            }
        }
        Hotel[5][0]=" L ";Hotel[5][1]=" O ";Hotel[5][2]=" B ";Hotel[5][3]=" B ";Hotel[5][4]=" Y ";Hotel[5][5]=" $ ";
        
      
            
        for(int f=0;f<6;f++){
            if(f == 5)
                System.out.print("        ");
            else
                System.out.print("Nivel " +(5-f)+" ");
            
            for(int c=0;c<6;c++){
                System.out.print(Hotel[f][c]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
         do{
        System.out.println("\t~~ M E N U  ~~");
        System.out.println("1. ---Reservar Habitacion---");
        System.out.println("2. ---Retirar Habitacion---");
        System.out.println("3. ---Imprimir Habitaciones---");
        System.out.println("4. ---Reportes---");
        System.out.println("5. ---Salir---");
        System.out.print("Seleccione una opcion del menu principal: ");
        opcionmenu = leer.nextInt();
        
        switch(opcionmenu){
            case 1:
         System.out.println("~~ Reservar Habitacion ~~\n");
          
        System.out.println("\n ~ Nuestras opciones de habitacion ~");
        System.out.println(" ---Nivel 1 y 2: Habitaciones Sencillas co un costo de 1,200");
        System.out.println(" ---Nivel 3 y 4: Habitaciones Dobles co un costo de 3,400");
         System.out.println(" ---Nivel 5: Suites con un costo de 5,000\n");
                System.out.println("1. ---Sencilla---");
                System.out.println("2. ---Doble---");
                System.out.println("3. ---Suites---");
                System.out.print("Seleccione su habitacion: ");
                opcionhabitacion = leer.nextInt();
                
                switch(opcionhabitacion){
                    case 1:
                        for(int f=4;f>2;f--){
                            for(int c=0;c<6;c++){
                                if(Hotel[f][c].equalsIgnoreCase("[ ]")){
                                    Hotel[f][c]="[x]";
                                    c1+=1200;
                                    ocupado=1;
                                    break;
                                }else{
                                    ocupado=0;
                                }
                                
                            }
                            if(ocupado==1){
                                break;
                                }
                        } 
                    break;
                    
                    case 2:
                        for(int f=2;f>0;f--){
                            for(int c=0;c<6;c++){
                                if(Hotel[f][c].equalsIgnoreCase("[ ]")){
                                    Hotel[f][c]="[x]";
                                    ocupado=1;
                                    c2+=3400;
                                    break;
                                }else{
                                    ocupado=0;
                                } 
                            }
                            if(ocupado==1){
                                break;
                                }
                        } 
                    break;
                    
                    case 3:
                        for(int f=0;f==0;f=0){
                            for(int c=0;c<6;c++){
                                if(Hotel[f][c].equalsIgnoreCase("[ ]")){
                                    Hotel[f][c]="[x]";
                                    ocupado=1;
                                    c3+=5000;
                                    break;
                                }else{
                                    ocupado=0;
                                } 
                            }
                            if(ocupado==1){
                                break;
                                }
                        } 
                    break;
                    
                    default:
                        System.out.println("Hubo un error!!");    
                    break;
                }
                
            break;
            
            case 2:
                System.out.print("Piso en el que se hospeda: ");
                int t = 0;
                int p = leer.nextInt();
                System.out.print("Cuarto en que se hospeda: ");
                int h = leer.nextInt();
                if(p==1){
                    t=4;
                    c1-=1200;
                }                    
                if(p==2){
                    t=3;
                    c1-=1200;
                }
                if(p==3){
                    t=2;
                    c2-=3400;
                }
                if(p==4){
                    t=1;
                    c2-=3400;
                }
                if(p==5){
                    t=0;
                    c2-=5000;
                }
                if(Hotel[t][h-1].equalsIgnoreCase("[x]"))
                    Hotel[t][h-1]="[ ]";                    
                else
                    System.out.println("La habitacion no esta disponible");
            break;
            
            case 3:
                for(int f=0;f<6;f++){
                    if(f == 5)
                        System.out.print("        ");
                    else
                        System.out.print("Piso " +(5-f)+" ");
            
                    for(int c=0;c<6;c++){
                        System.out.print(Hotel[f][c]+" ");
                    }
                System.out.println("");
                }
                System.out.println("");
            break;
            
            case 4:
                int total=0;
                total=c1+c2+c3;
                System.out.println("Si quiere ver las habitaciones ocupadas seleccione la opcion \\ 3 \\ del menu principal!!");
                System.out.println("Total neto de las habitaciones: "+total);        
            break;
            
        }
        
         }while(opcionmenu!=5);
    }
    
}

