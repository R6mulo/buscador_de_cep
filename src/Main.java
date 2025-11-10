import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CepService cepService = new CepService();
        GeradorDeArquivo gerador = new GeradorDeArquivo();

        System.out.println("*** Buscador de CEP ***");

        while (true) {
            System.out.println("\n1- Buscar CEP");
            System.out.println("2- Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1){
                System.out.println("Digite o CEP (somente números): ");
                String cep = scanner.nextLine();

                Endereco endereco = cepService.buscarEndereco(cep);

                if (endereco != null) {
                    System.out.println("\n Endereço encontrado:\n" + endereco);
                    gerador.salvaComoJson(endereco);
                }
            } else if (opcao == 2) {
                System.out.println(" Encerrando aplicação...");
                break;
            }else {
                System.out.println("Opção invalida!");
            }
        }

        scanner.close();
    }
}
