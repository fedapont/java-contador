import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita os dois parâmetros
            System.out.print("Digite o primeiro número: ");
            int parametro1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametro2 = scanner.nextInt();

            // Chamada da função que executa o desafio
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de digitar apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }

    // Função principal da lógica do desafio
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Validação dos parâmetros
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = parametro2 - parametro1;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
