import java.util.Scanner;

class Produto {
    String codigo;
    String nome;
    String tamanhoPeso;
    String cor;
    double valor;
    int quantidadeEstoque;

    public Produto(String codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade, int formaPagamento) {
        if (quantidade <= quantidadeEstoque) {
            double valorFinal = valor * quantidade;
            if (formaPagamento == 1 || formaPagamento == 2 ||
                    formaPagamento == 3 || formaPagamento == 4) {
                valorFinal *= 0.95;
            }

            System.out.println("Valor total: R$ " + valorFinal);
            if (formaPagamento == 5) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Valor pago: R$ ");
                double valorPago = scanner.nextDouble();
                if (valorPago > valorFinal) {
                    System.out.println("Troco: R$ " + (valorPago - valorFinal));
                }
            }

            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}

