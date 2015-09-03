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
public class BookLibrary extends BookData {
    private String[] cedula= new String[100];
    
    

    public String[] getCedula() {
       
        return cedula;
    }

    public void setCedula(String[] cedula) {
        this.cedula = cedula;
    }


    public boolean PrestarLibro(){
        Scanner teclado = new Scanner(System.in);
        /*if(this.getCantidad()>0){
            
            
            System.out.println("ingrese cedula del prestador:");
            this.cedula[this.getCantidad()]=teclado.nextLine();
            
            this.setCantidad(this.getCantidad()-1);
            System.out.println("libro prestado con exito");
        }
        else{
            System.out.println("LIBRO AGOTADO");
        }*/
        if(this.getCantidad()>0){
            System.out.println("ingrese cedula del prestador:");
            String aux=teclado.nextLine();
            int i;
            for(i=0;i<cedula.length;i++){
                if(cedula[i]==null){
                    cedula[i]=aux;
                    break;
                }
            }
            return true;
        }
        else return false;
    }
    public boolean DevolverLibro(){
        /*if(this.getCedula().compareTo("")==0){
            this.setCedula("");
            this.setCantidad(this.getCantidad()+1);
        }
        else{
            System.out.println("Este libro no se encuentra prestado");
        }*/
        if(false){
            return true;
        }
        else return false;

    }
    public void BorrarLibro(){
        this.setArea("");
        this.setAutor("");
        this.setCantidad(0);
        //this.setCedula("");
        this.setCodigo("");
        this.setNombre("");
        this.setYear("");
        
    }
    
    
}
