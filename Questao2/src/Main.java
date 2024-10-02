import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tamanho/peso do produto: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Digite o valor do produto: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        produto.mostrarInformacoes();

        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVenda = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a forma de pagamento: \n" +
                "1: Pix\n" +
                "2: Espécie\n" +
                "3: Transferência\n" +
                "4: Débito\n" +
                "5: Crédito\n ");
        int formaPagamento = scanner.nextInt();

        produto.vender(quantidadeVenda, formaPagamento);

        produto.mostrarInformacoes();

        scanner.close();
    }
}
