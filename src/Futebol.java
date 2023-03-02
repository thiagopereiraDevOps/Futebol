import java.util.Scanner;

public class Futebol {
    public static void main(String[] args) {
        int jogo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantia as pessoas no estádio: ");
        jogo = entrada.nextInt();
        if (jogo >= 25) {
            System.out.println("Esta liberado pra ir no futebol..");
        } else {
            System.out.println("Fique em estádio pra assisitir no jogo!!");
        }
    }
}
