import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String [] args) {
        System.out.println("-------------JOGO DA ADIVINHAÇÃO------------------");
        Scanner reading = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int tentativas = 0;
        for(int cont = 0; cont <5; cont++) {
            tentativas = tentativas + 1; // aqui fará a contagem das minhas tentativas, a cada laço começado, estou iniciando uma tentativa
            System.out.print("Qual o número aleatório? ");
            int guessing = reading.nextInt(); // lendo o numero que estou informando
            if (guessing != aleatorio) {
                System.out.println("Número a ser adivinhado não confere com o número informado!");
                if (guessing > aleatorio){
                    System.out.println("O número a ser adivinhado é menor do que o número digitado!");
                } else {
                    System.out.println("O número a ser adivinhado é maior do que o número digitado!");
                }
                if(tentativas == 5){
                    System.out.println("Você não conseguiu adivinhar o número aleatório!");
                    System.out.println("Tentativas: " +tentativas);
                    System.out.println("Número aleatório: " + aleatorio);

                }
            }  else {
                System.out.println("PARABÉNS! VOCÊ ACERTOU O NÚMERO A SER ADIVINHADO!");
                System.out.println("NÚMERO ADIVINHADO: "+aleatorio);
                System.out.println("TENTATIVAS: " + tentativas);
                break;
            }
        }

    }
}
