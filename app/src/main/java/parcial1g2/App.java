
package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
      
        Scanner CA = new Scanner(System.in);
       
        String decadaVehiculo = "";
        

        //Proceso
        for (int i = 1; i >= 0; i++){
         i = cantVehiculos;   
        }
        System.out.println("Bienvenido a impuestos y seguros gonzalez");
        System.out.println("Cuantos vehiculos desea calcular");
        cantVehiculos = CA.nextInt();
        CA.nextLine();

        
            
    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------

    //funcion calcular total impuestos 
    public static int calcularTotalImpuestos(String decadaVehiculo, int avaluoVehiculo){

        double valorTotal = 0;
        double impuestoRodamiento = 0;
        double seguro = 0;
       
        try {
            switch (decadaVehiculo) {
                
                case "90":
                    impuestoRodamiento = (avaluoVehiculo * 4.09);
                    seguro = (avaluoVehiculo * 0.816);
                    valorTotal = (impuestoRodamiento + seguro);
                   
                
                case "00": 
                    impuestoRodamiento = (avaluoVehiculo * 4.34);
                    seguro = (avaluoVehiculo * 0.798);
                    valorTotal = (impuestoRodamiento + seguro);


                case "10":
                    impuestoRodamiento = (avaluoVehiculo * 4.93);
                    seguro = (avaluoVehiculo * 0.712);
                    valorTotal = (impuestoRodamiento + seguro);

                   
                case "20":
                    impuestoRodamiento = (avaluoVehiculo * 5.680);
                    seguro = (avaluoVehiculo * 0.699);
                    valorTotal = (impuestoRodamiento + seguro);

                  
                default:
                    break;
            }
            return calcularTotalImpuestos(decadaVehiculo, avaluoVehiculo);

            
        } catch (Exception e) {
            return -1;
        }
    }

    //


    //------------------------------------------------------------------

}
