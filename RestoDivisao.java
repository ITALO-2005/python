import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite o valor inteiro: ");
        int valor = scanner.nextInt();

        int resto = valor % 3;

        System.out.println("O resto da divisão por 3 é: " + resto);

        scanner.close();
    }
}
