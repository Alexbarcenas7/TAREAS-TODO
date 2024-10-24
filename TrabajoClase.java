/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author ALEJANDROBARCENASDAVALOS
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      
        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();
        
         System.out.println("Ingresa tu puntaje crediticio ( entre 300 y 850) ");
         int puntajeHistorial = input.nextInt();
         
         System.out.println("Ingresos mensuales");
         int ingresosMensuales = input.nextInt();
          
         System.out.println("Ingresa la cantidad solicitada para el crédito hipotecario");
         int cantidadSolicitada = input.nextInt();
           
         System.out.println("Duracion del préstamo en años");
         int duracionPre = input.nextInt();
            
         System.out.println("Porcentaje de ahorro personal");
         int ahorroPersonal = input.nextInt();
             
           if (nombre.matches(".*\\d.*")){
            System.out.println("Error: El nombre no puede tener números");
           }else {
             if (puntajeHistorial<600){
              System.out.println("Solicitud rechazada");
           
            }else if(puntajeHistorial>=600||puntajeHistorial<=740){
            double tasaInteres =  cantidadSolicitada*.06;
             System.out.println("Tasa de interes es del 6% igual: " + tasaInteres );
            
          double operacion1 = Math.pow((1+tasaInteres), 2);
          
          double coutaMensual  = cantidadSolicitada
          
            
            }else {}
           }

    }
    
}
