import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Usuario> usuarios = new ArrayList<>();
    static int contadorId = 1;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== GERENCIADOR DE USUARIOS ===");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opçao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine();

                Usuario usuario = new Usuario(contadorId++, nome);
                usuarios.add(usuario);

                System.out.println("Usuario cadastrado");

            } else if (opcao == 2) {
                if (usuarios.isEmpty()) {
                    System.out.println("Nenhum usuario cadastrado.");
                } else {
                    for (Usuario u : usuarios) {
                        System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome());
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome para buscar: ");
                String nomeBusca = scanner.nextLine();

                boolean encontrado = false;

                for (Usuario u : usuarios) {
                    if (u.getNome().equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Encontrado: ID" + u.getId() + " | Nome: " + u.getNome());
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Usuario nao encontrado.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo.....");
                break;

            } else {
                System.out.println("Opçao invalida...");
            }
        }
        scanner.close();
    }
}

class Usuario {
    private int id;
    private String nome;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public String getNome() {
        return nome;

    }
    public int getId() {
        return id;
    }
}
