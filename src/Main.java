import br.Produto.com.Produto;

public class Main {
        public static void main(String[] args) {
            // Criando objetos da classe Produto
            Produto produto1 = new Produto("Camiseta", 29.99, 50);
            Produto produto2 = new Produto("Calça Jeans", 79.99, 30);

            // Exibindo informações dos produtos
            System.out.println("Informações do Produto 1:");
            produto1.exibirInformacoes();

            System.out.println("\nInformações do Produto 2:");
            produto2.exibirInformacoes();

            // Modificando informações do produto 1
            produto1.setPreco(39.99);
            produto1.adicionarEstoque(20);

            // Exibindo informações atualizadas do produto 1
            System.out.println("\nInformações do Produto 1 após atualização:");
            produto1.exibirInformacoes();
        }
    }