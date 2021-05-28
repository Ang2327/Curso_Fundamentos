import java.util.ArrayList;
import java.io.*;
public class Vehiculo {
    public static ArrayList <Vehiculo> vehiculos =  new ArrayList <Vehiculo>();
    public static int idActual = 1;

    private int id;
    private int modelo;
    private ArrayList <Sensor> sensores = new ArrayList <Sensor>();    
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){        
        this.id = idActual;
        Vehiculo.vehiculos.add(this);
        Vehiculo.idActual = Vehiculo.idActual + 1;
    }

    public Vehiculo(int mo, String ma,double va){
        this(mo,ma,va,"verde");
    }

    public Vehiculo(int mo, String ma,double va,String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        this.id = idActual;        
        Vehiculo.vehiculos.add(this);
        Vehiculo.idActual = Vehiculo.idActual + 1;
    }

    public ArrayList getSensores(){ 
        return this.sensores;
    }
    public void setSensores(ArrayList s){
        this.sensores = s;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getModelo(){
        return this.modelo;
    }
    public void setModelo(int mo){
        this.modelo = mo;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String ma){
        this.marca = ma;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }
    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        String datosVehiculosYSensores = "";
        datosVehiculosYSensores = datosVehiculosYSensores + "\n" +"ID:" + this.getId() + " / Modelo:" + this.getModelo() + " / Marca:" +
        this.getMarca() + " / Valor Comercial:" + this.getValorComercial() + " / Color:" + this.getColor();
        for(int i=0; i < this.sensores.size(); i++){
            if(i == 0){
                datosVehiculosYSensores = datosVehiculosYSensores + "\n" +("Sensores del Vehiculo:\n" + sensores.get(i).toString());
            }else{
                datosVehiculosYSensores = datosVehiculosYSensores + ("\n" + sensores.get(i).toString());
            }                   
        }
        return datosVehiculosYSensores; 
    }

    public String toStringSensores(){
        String datosSensores = "";
        if(this.sensores.size() != 0){
            for(int i=0; i < this.sensores.size(); i++){
                if(i == 0){
                    datosSensores = datosSensores + ("Sensores del Vehiculo con Id "+ this.id+" - Marca "+ this.marca + ":\n" + sensores.get(i).toString());
                }else{
                    datosSensores = datosSensores + ("\n" + sensores.get(i).toString());
                }                   
            }
        }else{
            datosSensores = datosSensores + (" El vehiculo con id "+ this.id + " no tiene ningun sensor");
        }
        return datosSensores; 
    }

    public static String toStringVehiculos(){
        String datosVehiculos = "";
        for(int i=0; i < Vehiculo.vehiculos.size(); i++){
            if(i == 0){
                datosVehiculos = datosVehiculos + ("Vehiculos:\n"  + Vehiculo.vehiculos.get(i).toString());
            }else{
                datosVehiculos = datosVehiculos + ("\n" + Vehiculo.vehiculos.get(i).toString());
            }
        } 
        if (datosVehiculos.equals("")){
            return "No se ha generado ningun vehiculo";
        }else{
            return datosVehiculos;
        }         
    }

    public static String toStringVehiculosVerdes(){
        String datosVehiculos = "";   
        int x = 0;
        for(int i=0; i< Vehiculo.vehiculos.size(); i++){
            if(Vehiculo.vehiculos.get(i).color.equals("verde")){
                if(i == x){
                    datosVehiculos = datosVehiculos + ("Vehiculos de color verde:\n"  + Vehiculo.vehiculos.get(i).toString());
                }else{
                    datosVehiculos = datosVehiculos + ("\n" + Vehiculo.vehiculos.get(i).toString());
                }                
            }else if(!Vehiculo.vehiculos.get(i).color.equals("verde")){
                x++;
            }
        }   
        if (datosVehiculos.equals("")){
            return "No hay vehiculos de color verde";
        }else{
            return datosVehiculos;
        }
    }

    public static int cantidadVehiculos(){
        return Vehiculo.vehiculos.size();
    }   

    public int cantidadSensores() {
        return this.sensores.size();
    }

    public void anadirSensor(Sensor s) {
        this.sensores.add(s);
    }

    public static Vehiculo obtenerVehiculoPorId(int id){
        Vehiculo vehiculo1 = null;
        for(int i=0; i < Vehiculo.vehiculos.size(); i++){
            if(vehiculos.get(i).id == id){
                vehiculo1 = Vehiculo.vehiculos.get(i);
            }            
        }
        return vehiculo1;
    }     

    public static String VehiculoConMasSensores(){
        String datosVehiculoCMSensores = "";
        int mayor = Vehiculo.vehiculos.get(0).sensores.size();               
        Vehiculo vehiculoCMS = Vehiculo.vehiculos.get(0);  
        for(int i = 0; i < Vehiculo.vehiculos.size(); i++){                          
            if(Vehiculo.vehiculos.get(i).sensores.size() > mayor){
                vehiculoCMS = Vehiculo.vehiculos.get(i);
                mayor = Vehiculo.vehiculos.get(i).sensores.size();
            }      
        }
        datosVehiculoCMSensores = datosVehiculoCMSensores + ("Vehiculo con mas sensores:\n" + vehiculoCMS.toString());
        return datosVehiculoCMSensores;
    }    

    public static String leerTxt()throws IOException{        
        String textoArchivo = "";        
        try{
            BufferedReader archivo = new BufferedReader(new FileReader("C:/Users/User/OneDrive/Documentos/EAFIT/Fundamentos de Programación/txt/Vehiculos.csv.txt"));          
            String archivoLeer;
            while((archivoLeer = archivo.readLine()) != null){
                String[] para = archivoLeer.split(",");           
                int modelo = Integer.parseInt(para[0]);
                double valor = Double.parseDouble(para[2]);
                Vehiculo nuevoVehiculo = new Vehiculo(modelo, para[1], valor, para[3]);                
            }                        
        }catch(IOException e){ 
            System.out.println("No se encontro el archivo con los vehiculos");
        }        
        return textoArchivo;
    }
}
