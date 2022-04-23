package practica2;
import java.util.Scanner;
public class Metodes {
    
    public static String DemanarNumero1 (String numero1){
        
        Scanner sc = new Scanner(System.in);
        do {
                System.out.println("\n Introdueix el primer numero: ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            
            
        return numero1;
    }
    
    public static String DemanarNumero2 (String numero2){
        
        Scanner sc = new Scanner(System.in);
        do {
                System.out.println("\n Introdueix el primer numero: ");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero2);
            double n1 = new Double(numero2);
            
        return numero2;
    }
    
    public static String DemanarOperacio(String operacion){
        
        Scanner sc = new Scanner(System.in);
        boolean comprobar=false;
        do {
                System.out.println("\n Quina operació vols fer? (Indica el signe)");
                System.out.println(" + = sumar \n - = restar \n"
                        + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                        + "\n % = residu\n");
                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                        || operacion.equals("*")) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (comprobar != true);
        
        return operacion;
    }
}
