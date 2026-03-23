import java.util.HashMap;
import java.util.Map;

public class CadastroProduto {

    private final HashMap<Integer, Produto> produtos = new HashMap<>();

    public void adicionarProduto(int id, String nome, double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido.");
            return;
        }

        if (id <= 0) {
            System.out.println("ID inválido.");
            return;
        }

        if (produtos.containsKey(id)) {
            System.out.println("ID já existe.");
            return;
        }

        produtos.put(id, new Produto(id, nome, preco));
        System.out.println("Produto adicionado: " + nome);
    }

    public void buscarProduto(int id) {
        Produto produto = produtos.get(id);

        if (produto != null) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void removerProduto(int id) {
        Produto removido = produtos.remove(id);

        if (removido != null) {
            System.out.println("Removido: " + removido.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
            Produto p = entry.getValue();
            System.out.println("ID: " + p.getId() + " | " + p.getNome() + " | R$ " + p.getPreco());
        }
    }
}