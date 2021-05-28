import java.util.ArrayList;
public class Sensor{
    public static ArrayList <Sensor> sensores = new ArrayList <Sensor>();
    
    private String tipo;
    private double valor;      

    public Sensor(){
        Sensor.sensores.add(this);
    } 

    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
        Sensor.sensores.add(this);
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double v){
        this.valor = v;
    }

    public String toString(){
        return "Tipo:" + this.getTipo() + " / Valor:" + this.getValor();
    }    

    public static String toStringSensoresTemperatura(){
        String datosSensores = "";
        for(int i=0; i < Sensor.sensores.size(); i++){
            if(Sensor.sensores.get(i).getTipo().equals("temperatura")){
                if(i == 0){
                    datosSensores = datosSensores + ("Sensores Temperatura:\n" + Sensor.sensores.get(i).toString());
                }else{
                    datosSensores = datosSensores + ("\n" + Sensor.sensores.get(i).toString());
                }  
            }
        }
        if(datosSensores.equals("")){
            datosSensores = "No se hallaron sensores tipo temperatura";
        }
        return datosSensores;
    }

    public static String toStringSensoresTemperaturaOrdenados(){        
        ArrayList<Sensor> nuevoArreglo = new ArrayList<Sensor>();
        for(int i=0; i < Sensor.sensores.size(); i++){
            if(Sensor.sensores.get(i).getTipo().equals("temperatura")){
                nuevoArreglo.add(Sensor.sensores.get(i));
            }else{
                continue;
            }
        }        
        int n = nuevoArreglo.size();      
        double temp;
        String datosSensores = "";
        for(int j=1; j<n; j++){
            for(int k=0; k<n-j; k++){
                if(nuevoArreglo.get(k).getValor() > nuevoArreglo.get(k+1).getValor()){
                    temp = nuevoArreglo.get(k).getValor();
                    nuevoArreglo.get(k).setValor(nuevoArreglo.get(k+1).getValor());
                    nuevoArreglo.get(k+1).setValor(temp);
                }
            }
        }             
        for(int i=0; i < n; i++){
            if (i==0){                
                datosSensores = datosSensores + "Sensores Temperatura Ordenados Por Valor:\n" + (nuevoArreglo.get(i));                
            }else{
                datosSensores = datosSensores + ("\n" + nuevoArreglo.get(i));
            }
        }
        if(datosSensores.equals("")){   
            datosSensores = "No se hallaron sensores tipo temperatura para ordenar";
        }
        return datosSensores;
    }    
}
