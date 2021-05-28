import java.util.Scanner;
public class Bichos {
    public static Bichos[][] bichos = new Bichos[2][2];
    
    private int salud;
    private String nombre;    

    public Bichos(){} 

    public Bichos(String n,int s){
        this.salud=s;
        this.nombre=n;
    }

    public static void mostrarMenu(int CB){
        Scanner scan = new Scanner(System.in);
        int control = 0;
        while(control < 1) {
            System.out.println("                                                              ");
            System.out.println("        |//////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|");
            System.out.println("        |                                            |");
            System.out.println("        |             MENÚ JUEGO DE BICHOS           |");
            System.out.println("        |                                            |");
            System.out.println("        |   Ingrese 0 - Cerrar el Juego              |");
            System.out.println("        |   Ingrese 1 - Ver Tablero con posiciones   |");
            System.out.println("        |   Ingrese 2 - Disparar una bala            |");
            System.out.println("        |   Ingrese 3 - Activar una bomba atómica    |");
            System.out.println("        |   Ingrese 4 - Activar un bicho mutante     |");
            System.out.println("        |                                            |");
            System.out.println("        |     -Ingrese Un Valor Para Continuar-      |");  
            System.out.println("        |                                            |");            
            System.out.println("        |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////|");            
            if(CB == 1){
                System.out.println("            -------------------------------------");
                System.out.println("            |      "+bichos[0][0].toStringBichos(0,0)+"      |                 |");
                System.out.println("            |-----------------------------------|");
                System.out.println("            |                 |                 |");
                System.out.println("            -------------------------------------");
                System.out.println("                      Tablero de Juego");
            }
            if(CB == 2){
                System.out.println("            -------------------------------------");
                System.out.println("            |      "+bichos[0][0].toStringBichos(0,0)+"      |      "+ bichos[0][1].toStringBichos(0,1)+"      |");
                System.out.println("            |-----------------------------------|");
                System.out.println("            |                 |                 |");
                System.out.println("            -------------------------------------");
                System.out.println("                      Tablero de Juego");
            }
            if(CB == 3){
                System.out.println("            -------------------------------------");
                System.out.println("            |      "+bichos[0][0].toStringBichos(0,0)+"      |      "+ bichos[0][1].toStringBichos(0,1)+"      |");
                System.out.println("            |-----------------------------------|");
                System.out.println("            |      "+bichos[1][0].toStringBichos(1,0)+"      |                 |");
                System.out.println("            -------------------------------------");
                System.out.println("                      Tablero de Juego");
            }
            if(CB == 4){
                System.out.println("            -------------------------------------");
                System.out.println("            |      "+bichos[0][0].toStringBichos(0,0)+"      |      "+ bichos[0][1].toStringBichos(0,1)+"      |");
                System.out.println("            |-----------------------------------|");
                System.out.println("            |      "+bichos[1][0].toStringBichos(1,0)+"      |      " + bichos[1][1].toStringBichos(1,1)+"      |");
                System.out.println("            -------------------------------------");
                System.out.println("                     Tablero de Juego");
            }
            int numero = scan.nextInt();
            if (numero == 0){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(" GRACIAS POR JUGAR");
                control = 1;
            }else if (numero == 1){ 
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("                                                              ");
                System.out.println("            -------------------------------------");
                System.out.println("            |        0,0       |       0,1      |");
                System.out.println("            |-----------------------------------|");
                System.out.println("            |        1,0       |       1,1      |");
                System.out.println("            -------------------------------------");
                System.out.println("                 Posiciones Tablero de Juego     ");

            }else if (numero == 2){                
                System.out.println("Ingrese la posicion 1 del bicho (0-1)");
                int x = scan.nextInt();
                System.out.println("Ingrese la posicion 2 del bicho (0-1)");
                int y = scan.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Bichos.dispararBala(x,y);                
            }else if (numero == 3){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                double aleatorioA = Math.random()*1; 
                int aleatorioA1 = (int) Math.round(aleatorioA);
                double aleatorioB = Math.random()*1;  
                int aleatorioB1 = (int) Math.round(aleatorioB);
                Bichos.activarBombaAtomica(aleatorioA1,aleatorioB1);                               
            }else if (numero == 4){         
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Bichos.bichoMutante();
            }
        }
    }

    public static void main(String[]args){         
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("                                                                         ");
        System.out.println("        ******    *****    ******   *     *      *****       *******         ");
        System.out.println("        *     *     *     **        *     *     *     *     *                ");
        System.out.println("        *     *     *     *         *     *    *       *    *                ");
        System.out.println("        ******      *     *         *******   *         *    ******          ");
        System.out.println("        *     *     *     *         *     *    *       *           *         ");
        System.out.println("        *     *     *     **        *     *     *     *            *         ");
        System.out.println("        ******    *****    ******   *     *      *****      *******          ");
        System.out.println("                                                                         ");
        System.out.println("   |////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|");
        System.out.println("   | Ingrese 0 - Generar de forma Manual la cantidad de bichos en el tablero |");        
        System.out.println("   | Ingrese 1 - Generar automaticamente la cantidad de bichos en el tablero |");
        System.out.println("   |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////|");    
        int numero = scan.nextInt();
        int DatoC = 0;
        if(numero == 0){
            System.out.println("Ingrese el numero de bichos que desea crear 1-4");
            DatoC = scan.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }else if(numero == 1){
            double aleatorioA = Math.random()*(1-4)+4;   
            DatoC = (int) Math.round(aleatorioA);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        int posAnadir1 = 0;
        int posAnadir2 = 0;
        int control = 0;         
        while(control < DatoC){         
            double aleatorioB = Math.random()*(1-2)+2;
            int aleatorioB1 = (int) Math.round(aleatorioB);            
            if(aleatorioB1 == 1){
                BichosNormales n1 = new BichosNormales();                 
                Bichos.bichos[posAnadir1][posAnadir2] = n1;                
            }else if(aleatorioB1 == 2){
                BichosAliens a1 = new BichosAliens();                 
                Bichos.bichos[posAnadir1][posAnadir2] = a1;                
            }
            control = control + 1;
            if (control == 1){
                posAnadir2++;
            }else if(control == 2){
                posAnadir1++;
                posAnadir2 = posAnadir2-1;
            }else if(control == 3){     
                posAnadir2++;     
            }
        }        
        Bichos.mostrarMenu(DatoC);        
    }

    public int getSalud(){
        return this.salud;
    }
    public void setSalud(int s){
        this.salud = s;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public String toStringBichos(int x, int y){
        String datosBichos = "";
        if (bichos[x][y] == null){
            datosBichos = "     ";            
        }else if(bichos[x][y] != null){
            datosBichos = datosBichos + this.getNombre()+ "-" + this.getSalud();
        }        
        return datosBichos;
    }

    public static void dispararBala(int x,int y){        
        if (bichos[x][y] == null){
            System.out.println("      -Fue una bala perdida,en ese lugar no habia ningun bicho al cual disparar-");
        }else {
            bichos[x][y].setSalud(bichos[x][y].getSalud() - 5);
            System.out.println("          La bala le ha quitado 5 de dalud a un " + bichos[x][y].getNombre());
        }
    }

    public static void activarBombaAtomica(int aleatorio1,int aleatorio2){
        if (bichos[aleatorio1][aleatorio2] == null){
            System.out.println("    -No hubo exterminio, la Bomba cayo en un lugar donde no habia ningun bicho-");
        }else{
            bichos[aleatorio1][aleatorio2].setSalud(0);
            System.out.println("              Uno de los " + bichos[aleatorio1][aleatorio2].getNombre() + " ha sido exterminado");
        }
    }

    public static void bichoMutante(){        
        int menor = bichos[0][0].getSalud();               
        Bichos bichoMenor = bichos[0][0];   
        for(int i = 0; i < bichos.length; i++){    
            for(int j = 0; j < bichos[i].length; j++){         
                if (bichos[i][j] == null){
                    continue;
                }else{
                    if(bichos[i][j].getSalud() < menor){
                        bichoMenor = bichos[i][j];
                        menor = bichos[i][j].getSalud();
                    }      
                }
            }   
        }        
        if (bichoMenor.getSalud() == 0){
            System.out.println("   -Se intenta hacer mutante a un " + bichoMenor.getNombre() +" con 0 de salud, pero no se consigue-");
        }else{
            bichoMenor.setSalud(bichoMenor.getSalud() * 2);
        }
    }
}
