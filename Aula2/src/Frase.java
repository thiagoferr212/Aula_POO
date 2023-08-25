import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        String frase;
        int contVogal=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        for(int i=0; i<frase.length();i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U' || frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
                contVogal++;
        }
        System.out.println("Número de Vogais na frase é " + contVogal);
    }
}
