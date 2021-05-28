import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws java.io.IOException {   
        Principal.mostrarMenu();
    }

    public static void mostrarMenu() throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        int control = 0;
        while(control < 1) {
            System.out.println("                                                                                  ");
            System.out.println(" |////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|");
            System.out.println(" |                                                                                |");
            System.out.println(" |                    MENÚ SISTEMA DE VEHICULOS Y SENSORES                        |");
            System.out.println(" |                                                                                |");
            System.out.println(" |   Ingrese 0 para cerrar el Sistema                                             |");
            System.out.println(" |   Ingrese 1 para generar un nuevo Vehiculo                                     |");
            System.out.println(" |   Ingrese 2 para ver la informacion de los Vehiculos generados                 |");
            System.out.println(" |   Ingrese 3 para ver la cantidad de Vehiculos generados                        |");
            System.out.println(" |   Ingrese 4 para ver los Vehiculos de Color Verde                              |");
            System.out.println(" |   Ingrese 5 para ver la informacion de un vehiculo por su id                   |");
            System.out.println(" |   Ingrese 6 para crearle un sensor aun vehiculo por su id                      |");
            System.out.println(" |   Ingrese 7 para ver la informacion de los sensores de un vehiculo por su id   |");
            System.out.println(" |   Ingrese 8 para ver la informacion de los Sensores de tipo temperatura        |");
            System.out.println(" |   Ingrese 9 para ver la informacion del vehiculo con más Sensores              |");
            System.out.println(" |   Ingrese 10 para crear 5 vehiculos de forma automatica                        |");
            System.out.println(" |   Ingrese 666 para ver los Sensores de tipo temperatura ordenados por valor    |");
            System.out.println(" |                                                                                |");
            System.out.println(" |                     -Ingrese Un Valor Para Continuar-                          |");
            System.out.println(" |                                                                                |");
            System.out.println(" |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////////////|");
            System.out.println("                                                                                  ");            
            int numero = scan.nextInt();
            if (numero == 0){
                control = 1;
            }else if (numero == 1){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ingrese el Modelo del Vehiculo (Año)");
                int modelo = scan.nextInt();
                System.out.println("Ingrese la Marca del Vehiculo");
                String marca = scan.next();
                System.out.println("Ingrese el Valor Comercial del Vehiculo");
                double valorComercial = scan.nextDouble();
                System.out.println("Ingrese el Color del Vehiculo");
                String color = scan.next();
                Vehiculo Nuevovehiculo = new Vehiculo(modelo, marca, valorComercial, color);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(" -Se ha generado correctamente el vehiculo-");
            }else if (numero == 2){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(Vehiculo.toStringVehiculos());
            }else if (numero == 3){         
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(" La cantidad de Vehiculos creados son: " + Vehiculo.cantidadVehiculos()); 
            }else if (numero == 4){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                
                System.out.println(Vehiculo.toStringVehiculosVerdes());
            }else if (numero == 5){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ingrese la Id del vehiculo que desea ver");
                int id = scan.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Vehiculo con la Id "+ id + ":");
                System.out.println(Vehiculo.obtenerVehiculoPorId(id).toString());                
            }else if (numero == 6){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ingrese la Id del vehiculo al que desea crearle el sensor");
                int id = scan.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (id > Vehiculo.idActual){
                    System.out.println("Error - No existe ningun Vehiculo con el Id ingresado");
                }else{
                    System.out.println("Ingrese el Tipo de Sensor");
                    String tipo = scan.next();
                    System.out.println("Ingrese el Valor del Sensor");
                    double valor = scan.nextDouble();
                    Sensor NuevoSensor = new Sensor(tipo, valor);
                    Vehiculo.obtenerVehiculoPorId(id).anadirSensor(NuevoSensor);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(" -Se ha generado correctamente el sensor del vehiculo con Id "+ id + "-");
                } 
            }else if (numero == 7){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ingrese la Id del vehiculo al cual quiere ver sus sensores");
                int id = scan.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(Vehiculo.obtenerVehiculoPorId(id).toStringSensores());
            }else if (numero == 8){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(Sensor.toStringSensoresTemperatura());
            }else if (numero == 9){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(Vehiculo.VehiculoConMasSensores());  
            }else if (numero == 10){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Vehiculo.leerTxt();
                System.out.println(" -Se han generado los vehiculos de forma exitosa-");
            }else if (numero == 666){                
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(Sensor.toStringSensoresTemperaturaOrdenados());         
            }else{
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }                
        }
    }
}
