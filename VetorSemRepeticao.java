import java.util.Scanner;

public class VetorSemRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int indice = 0;

        System.out.println("Digite 10 números diferentes:");

        // Enquanto o vetor não estiver cheio (10 posições)
        while (indice < 10) {
            System.out.print("Digite o valor para a posição " + indice + ": ");
            int valorDigitado = leitor.nextInt();
            
            boolean repetido = false;

            // Percorremos o vetor até onde já preenchemos para checar se o número já existe
            for (int j = 0; j < indice; j++) {
                if (numeros[j] == valorDigitado) {
                    repetido = true;
                    break; // Se achou um igual, nem precisa continuar testando o resto
                }
            }

            // Se NÃO for repetido, salvamos no vetor e passamos para a próxima posição
            if (!repetido) {
                numeros[indice] = valorDigitado;
                indice++;
            } else {
                System.out.println("Erro: Você já digitou esse número. Tente outro!");
            }
        }

        // Impressão final
        System.out.println("\nOs números digitados foram:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        leitor.close();
    }
}