import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota01 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota02 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota03 = scanner.nextFloat();

        float media = (nota01 + nota02 + nota03) / 3;

        if (media < 50) {
            System.out.println("Aluno reprovado!");
        } else if (media >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em recuperação!");
        }
        
        scanner.close();
    }
}
