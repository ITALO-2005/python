import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a distância? ");
        float km = scanner.nextFloat();

        System.out.print("Quanto usou de combustível? ");
        float l = scanner.nextFloat();

        float consumo = km / l;

        System.out.println("Seu consumo foi: " + consumo);

        scanner.close();
    }
}
