import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();
        sc.close();

        int digitos = informeNumero(numero);
        System.out.println("O numero " + numero + " tem " + digitos + " digitos."); 
    }
    
    public static int informeNumero(int a) {
        
        String s = Integer.toString(a);

        return s.length(); 
    }
}
