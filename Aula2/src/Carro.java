import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {

        int ano;
        String placa;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a placa  do carro: ");
        placa = ler.nextLine();

        System.out.println("Informe o ano do carro: ");
        ano = ler.nextInt();

        if (ano <= 2010)
            System.out.println("Carro Velho");
        else if (ano <= 2022)
            System.out.println("Carro Semi novo");
        else if (ano == 2023)
            System.out.println("Carro Novo");
        else
            System.out.println("Ano de fabricação indisponível");

        placa = placa.toUpperCase();
        for (int i=0;i<placa.length();i++){
            if (placa.charAt(i)=='A'|| placa.charAt(i)=='E'|| placa.charAt(i)=='I'|| placa.charAt(i)=='O'|| placa.charAt(i)=='U')
                placa = placa.replace(placa.charAt(i),'*');
        }
        System.out.println("Placa alterada: " + placa);
    }

}
