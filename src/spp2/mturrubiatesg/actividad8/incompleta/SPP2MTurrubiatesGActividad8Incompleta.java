/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.actividad8.incompleta;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2MTurrubiatesGActividad8Incompleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int [][] myArray = new int [4][4];
        for (int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                myArray[i][j]=solicitarEntero();
            }
        }
        for (int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray[i].length; j++){
                System.out.println("El contenido es" + myArray[i][j]);
            }
        }
        
    }
    public static int solicitarEntero(){
        Scanner kb= new Scanner(System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un numero entero");
            try{
                n = kb.nextInt();
                flag=false;
            } catch (Exception er){
                System.out.println("Vuelve a intentarlo");
                flag= true;
                kb.next();
            }
        } while (flag);
        return n;
    } 
    }
