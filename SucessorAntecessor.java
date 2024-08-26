import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor: " + antecessor);

        scanner.close();
    }
}
