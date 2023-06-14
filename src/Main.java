import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A:");
        int a = sc.nextInt();
        sc.nextLine(); 
        // Você só precisa consumir o '\n' bugado quando você tenta ler uma String depois de um tipo numerico
        //Neste caso é desnecessário.
        System.out.println("Digite um valor para B:");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um valor para C:");
        int c = sc.nextInt();
        sc.nextLine();

        double delta = (Math.pow(b,2) - (4*a*c));

        System.out.println("O valor de delta é " + delta);

        double x1 = ((-b + Math.sqrt(delta))/2*a);
        double x2 = ((-b - Math.sqrt(delta))/2*a);

        System.out.println("O valor de X1 é " + x1);
        System.out.println("O valor de X2 é " + x2);

        //Faltou fechar o Scanner
        sc.close();

        //Por fim calcule com A sendo 1, B e C sendo 2
    }
}