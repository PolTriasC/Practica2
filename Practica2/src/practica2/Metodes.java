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
}
