import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas10 = valor / 10;
        valor = valor % 10;

        int notas1 = valor;
 
        System.out.println("Valor do saque: " + ((notas50 * 50) + (notas10 * 10) + notas1));
        System.out.println("Número de notas de 50: " + notas50);
        System.out.println("Número de notas de 10: " + notas10);
        System.out.println("Número de notas de 1: " + notas1);

        scanner.close();
    }
}

