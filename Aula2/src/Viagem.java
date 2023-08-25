import java.util.Scanner;

public class Viagem {

    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmLitro, consumo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a velocdade: ");
        velocidade = ler.nextDouble();

        System.out.println("Digite tempo gasto: ");
        tempo = ler.nextDouble();

        System.out.println("Digite Km/Litro: ");
        kmLitro = ler.nextDouble();

        distancia = velocidade * tempo;
        consumo = distancia / kmLitro;

        System.out.println("Consumo médio: " + consumo);

    }
}
