import jdk.internal
        .jimage.ImageReader;

import java.util.ArrayList;
import  java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar tarefa como concluida");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Sair");
            System.out.print("Escilha uma opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descriçao da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(new Tarefa(descricao));
                    System.out.println("Tarefa adicionada");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE TEREFAS ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + " - " + tarefas.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Digite o numero da tarefa para marcar como concluida: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.get(indice).marcarComoConcluida();
                        System.out.println("Tarefa marcada como concluida.");
                    } else {
                        System.out.println("Indice invalido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o numero da tarefa para remover: ");
                    int remover = scanner.nextInt();
                    if (remover >= 0 && remover < tarefas.size()) {
                        tarefas.remove(remover);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Indice invalido. ");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opçao invalida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
