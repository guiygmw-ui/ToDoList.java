import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("Lista de tarefas");

        // Declarando o Scanner
        Scanner leitor = new Scanner(System.in);

        // Declarando a Lista e variaveis
        String[] tarefas = new String[10];
        int opcao = 0;
        int totalTarefas = 0;

        // Administrando as tarefas
        while (opcao != 4) {
            System.out.println("\nMinha lista de tarefas \n" +
                    "1 - Adicionar tarefa \n" +
                    "2 - Remover tarefas \n" +
                    "3 - listar tarefa \n" +
                    "4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                if (totalTarefas < 10) {
                    System.out.println("digite sua tarefa: ");
                    tarefas[totalTarefas] = leitor.nextLine();
                    totalTarefas++;
                    System.out.println("Tarefa adicionada!");
                } else {
                    System.out.println("Lista cheia, cumpra algumas de suas tarefas para adicionar mais!");
                }
            }

            if (opcao == 2) {
                System.out.print("Digite o número da tarefa para remover (ou 0 para voltar): ");
                int indiceRemover = leitor.nextInt();
                leitor.nextLine();

                if (indiceRemover > 0 && indiceRemover <= totalTarefas) {
                    int posicaoArray = indiceRemover - 1;

                    for (int i = posicaoArray; i < totalTarefas - 1; i++) {
                        tarefas[i] = tarefas[i + 1];
                    }

                    tarefas[totalTarefas - 1] = null;
                    totalTarefas--;
                    System.out.println("Tarefa removida com sucesso!");
                } else if (indiceRemover != 0) {
                    System.out.println("Número inválido!");
                }
            }

            if (opcao == 3) {
                System.out.println(" SUAS TAREFAS");
                if (totalTarefas == 0) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < totalTarefas; i++) {
                        System.out.println((i + 1) + ". " + tarefas[i]);
                    }
                }
            }

            if (opcao == 4) {
                System.out.println("Saindo do programa... Até logo!");
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}
