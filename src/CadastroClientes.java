import java.util.HashMap;

public class CadastroClientes {
    HashMap<Integer, String> clientes = new HashMap<>();

    public void adicionarCliente(int id, String nome) {
        if (id <= 0) {
            System.out.println("ID inválido, cliente não adicionado.");
            return;
        }

        if (clientes.containsKey(id)) {
            System.out.println("ID já existe, cliente não adicionado.");
            return;
        }

        clientes.put(id, nome);
        System.out.println("Cliente adicionado: " + nome);
    }

    public void buscarCliente(int id) {
        String nome = clientes.get(id);

        if (nome != null) {
            System.out.println("Cliente encontrado: " + nome);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void removerCliente(int id) {
        String removido = clientes.remove(id);

        if (removido != null) {
            System.out.println("Removido: " + removido);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (HashMap.Entry<Integer, String> entry : clientes.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
        }
    }

}
