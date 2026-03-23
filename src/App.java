public class App {
    public static void main(String[] args) throws Exception {
        CadastroProduto cadastro = new CadastroProduto();

        cadastro.adicionarProduto(1, "Notebook", 2500.00);
        cadastro.adicionarProduto(2, "Smartphone", 1500.00);
        cadastro.adicionarProduto(3, "Tablet", 1200.00);
        cadastro.adicionarProduto(4, "Monitor", 800.00);

        System.out.println("\nLista de Produtos:");
        cadastro.listarProdutos();

        System.out.println("\nBuscando produto com ID 2:");
        cadastro.buscarProduto(2);

        System.out.println("\nRemovendo produto com ID 1:");
        cadastro.removerProduto(1);

        System.out.println("\nLista de Produtos após remoção:");
        cadastro.listarProdutos();
    }

    
}