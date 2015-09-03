/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksoft;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class BookSoft {
   
    
    public void menu(){
        System.out.println("*****************Menu***********************");
        System.out.println("1. Ingreser Nuevo Libro");
        System.out.println("2. Actualizar datos de un libro");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Buscar libro");
        System.out.println("5. Prestar libro");
        System.out.println("6. Devolver libro");
        System.out.println("7. libros prestados");
        System.out.println("8. salir");
        System.out.println("****************************************");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BookData libro= new BookData();        
        BookSoft libreria= new BookSoft();
        Scanner teclado = new Scanner(System.in);
        int size=2,i,k,contBook=0;
        String[] librosprestados= new String[1000];
        BookLibrary [] libros  = new BookLibrary[size];
        for(i=0;i<size;i++){
           
           libros[i]=new BookLibrary();
           libros[i].BorrarLibro();
           for(k=0;k<libros[i].getCedula().length;i++){
               libros[i].getCedula()[k]="";
           }
       }
        for(i=0;i<librosprestados.length;i++){
           
           
           librosprestados[i]="";
       }
        int menu;
        do{
            libreria.menu();
            menu=teclado.nextInt();
            
             switch(menu){
                    case 1://ingresar libro
                        menu=0;
                        
                        System.out.println("cuantos libros desea ingresar?");
                        int j=teclado.nextInt();
                        if(j>size){
                            System.out.println("Te pasaste del limite de libros");
                            break;
                        }
                        int flag1=0;
                        for(i=0;i<size||j>0;i++){
                            if(libros[i].getNombre().compareTo("")==0){
                            libros[i].LoadBook();
                            j--;
                            flag1=0;
                            
                            }
                            else flag1=1;
                        }
                        if(flag1==1) System.out.println("No hay espacio para mas libros");

                        break;
                    case 2://Actualizar libro
                        menu=0;
                        System.out.println("Ingrese Nombre del libro que desea actualizar");
                        teclado.nextLine();
                        String aux2=teclado.nextLine();
                        int flag2=0;
                        for(i=0;i<size;i++){
                            if(libros[i].getNombre().compareTo(aux2)==0){
                                System.out.println("Los datos actuales del libro son:");
                                libros[i].ShowBook();
                                System.out.println("Por favor ingrese todos los datos nuevamente:");
                                libros[i].LoadBook();
                                System.out.println("libro actualizado con exito");
                                flag2=0;
                                break;
                            }
                            else{
                                flag2=1;
                            }                              
                            
                        }
                        if(flag2==1){
                            System.out.println("No se encontro un libro con ese nombre");

                        }
                       break;
                    case 3://Eliminar libro
                        menu=0;
                        System.out.println("Ingrese Nombre del libro que desea borrar");
                        teclado.nextLine();
                        String aux3=teclado.nextLine();
                        int flag3=0;
                        for(i=0;i<size;i++){
                            if(libros[i].getNombre().compareTo(aux3)==0){
                                libros[i].BorrarLibro();
                                System.out.println("libro borrado con exito");
                                flag3=0;
                                break;
                            }
                            else{
                                flag3=1;
                                
                            }
                        }
                        if(flag3==1){
                            System.out.println("No se encontro un libro con ese nombre");
                        }
                        break;
                    case 4://buscar libro
                        menu=0;
                            
                            System.out.println("Ingrese Nombre del libro");
                            teclado.nextLine();
                            String aux4=teclado.nextLine();
                            int flag4=0;
                            for(i=0;i<size;i++){
                                if(libros[i].getNombre().compareTo(aux4)==0){
                                    libros[i].ShowBook();
                                    flag4=0;
                                    break;
                                }
                                else flag4=1;
                            }
                            if(flag4==1){
                                    System.out.println("No se encontro libro con ese nombre");
                                    }
                        break;
                    case 5://prestar libro
                        menu=0;
                        System.out.println("Ingrese Nombre de libro para prestar");
                        teclado.nextLine();
                         String aux5=teclado.nextLine();
                         int flag5=0;
                        for(i=0;i<size;i++){
                            if(libros[i].getNombre().compareTo(aux5)==0){
                                if(libros[i].PrestarLibro()){
                                    
                                 for(j=0;j<librosprestados.length;j++){
                                     if(librosprestados[j].compareTo("")==0||librosprestados[j].compareTo(null)==0){
                                         librosprestados[j]=libros[i].getNombre();
                                         break;
                                     }
                                 }
                                 
                                } 
                                
                                flag5=0;
                                break;
                            }
                            else{
                                flag5=1;
                                
                            }
                        }
                        if(flag5==1){
                            System.out.println("No se encontro un libro con ese nombre");
                        }
                        break;
                    case 6://devolver libro
                        menu=0;
                        System.out.println("Ingrese Nombre de libro para devolver");
                        teclado.nextLine();
                         String aux6=teclado.nextLine();
                         int flag6=0;
                        for(i=0;i<size;i++){
                            if(libros[i].getNombre().compareTo(aux6)==0){
                                libros[i].DevolverLibro();
                                flag6=0;
                                break;
                            }
                            else{
                                flag6=1;
                                
                            }
                        }
                        if(flag6==1){
                            System.out.println("No se encontro un libro con ese nombre");
                        }                        
                        break;
                        
                    case 7://libro prestados
                        menu=0;
                        break;
                    case 8://salir
                        
                        break;
                    default:
                        menu=0;
                    break;
                    }
        }while(menu!=8);
        
        
        
    }
    
}
