import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        
        System.out.println("Considere uma equação de segundo grau no formato:");
        System.out.println("ax² + bx + c = 0");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de 'a': ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de 'b': ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de 'c': ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes são: " + raiz1 + " e " + raiz2);
        } else {
            System.out.println("Delta negativo, a equação não possui raízes reais.");
        }

        scanner.close();
    }
}

