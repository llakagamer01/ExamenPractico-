
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número de mes: ");
        int mes = input.nextInt(); 
        input.nextLine();
        String Mess = Mes(mes);
        System.out.println("El mes es: "+Mess);
        System.out.println();
        System.out.print("Ingrese una letra de calificación:");
        String Califas = input.nextLine();
        int calif = califas(Califas);
        System.out.println("La calificación es: "+calif);
        System.out.println("");
        System.out.print("Calificación: ");
        int cali = input.nextInt();
        String ca = Califas(cali);
        System.out.println("La calificación es: "+ca);
        System.out.println("");
        int califi = overload("Calificación: ", 0);
        System.out.println("La calificación es: "+califi);
        System.out.println("");
        double es = overload("Estatura: ", 1.1);
        System.out.println("Tu estatura es: "+es+" metros.");
        System.out.println("");
        String texto = overload("Introduce un mensaje: ", "z");
        System.out.println("Tu mensaje es: "+texto);
        System.out.println("");
        boolean bool = overload("Tienes INE?", false);
        System.out.println("Tu respuesta es: "+bool);
        System.out.println("");
        System.out.print("Ingrese un número: ");
        int nume = input.nextInt();
        System.out.println("Primo: "+primo(nume));
        System.out.println("");
        System.out.print("Introduce un año: ");
        int anio = input.nextInt();
        System.out.println(bisiesto(anio));
        System.out.println("");
        
        
        
        
    }
    
    public static String Mes (int mes){
        String nombre="";
        switch(mes){
            case 1:
                nombre = "Enero.";
                break;
            case 2:
                nombre = "Febrero.";
                break;
            case 3:
                nombre = "Marzo.";
                break;
            case 4:
                nombre = "Abril.";
                break;
            case 5:
                nombre = "Mayo.";
                break;
            case 6:
                nombre = "Junio.";
                break;
            case 7:
                nombre = "Julio.";
                break;
            case 8:
                nombre = "Agosto.";
                break;
            case 9:
                nombre = "Septiembre.";
                break;
            case 10:
                nombre = "Octubre";
                break;
            case 11:
                nombre = "Noviembre.";
                break;
            case 12:
                nombre = "Diciembre.";
                break;
        }
        return nombre;
    }
    
    public static int califas (String calif){
        int resu = 0;
        switch (calif){
            case "A":
                resu = 100;
                break;
            case "B":
                resu = 90;
                break;
            case "C":
                resu = 80;
                break;
            case "D":
                resu = 70;
                break;
            case "E":
                resu = 60;
                break;
            case "F":
                resu = 50;
                break;
        }
        return resu;
    }
    
    public static String Califas (int calif){
        String resu = "";
        switch (calif){
            case 100:
                resu = "A";
                break;
            case 90:
                resu = "B";
                break;
            case 80:
                resu = "C";
                break;
            case 70:
                resu = "D";
                break;
            case 60:
                resu = "E";
                break;
            case 50:
                resu = "F";
                break;
            default:
        }
        return resu;        
    }
    
    public static int overload(String texto, int a){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        int cal = input.nextInt();
        return cal;
    }
    public static double overload(String texto, double b){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        double est = input.nextDouble();
        return est;
    }
    public static String overload(String texto, String c){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        String tex = input.nextLine();
        return tex;
    }
    public static boolean overload(String texto, boolean d){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        boolean res = input.nextBoolean();
        return res;
    }
    
    public static boolean primo(int a){
        boolean primo = false;
        int conta = 0;
        for (int i = a; i > 0; i--) {
            if(a%i==0)
                conta++;
        }
        if(conta == 2)
            primo = true;
        return primo;
    }
    
    public static String bisiesto(int anio){
        int resi4 = anio%4;
        int resi100 = anio%100;
        int resi400 = anio%400;
        String bisiesto;
        if(((resi4==0)&&!(resi100==0)) || (resi400 == 0)){
            bisiesto = "El año es bisiesto.";
        }else{
            bisiesto = "El año no es bisiesto.";
        }
        return bisiesto;
    }
    
}
