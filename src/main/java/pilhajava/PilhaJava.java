package pilhajava;

import java.util.Scanner;

public class PilhaJava {

    private static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada: %n", "UTF-8");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int tamanho, op = 0, element;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho da pilha:");
        tamanho = scanner.nextInt();

        Pilha <Integer> pilha = new Pilha<>(tamanho); //Essa pilha só recebe inteiros.

        do {
            op = mostrarMenu();
            switch (op) {
                case 1: System.out.println("Digite um numero inteiro");
                    element = scanner.nextInt();
                    if (pilha.push(element) == true) {
                        System.out.println("\ninsercao realizada");
                    } else {
                        System.out.println("Stack Overflow! ******************");
                    }
                    //scanner.close(); //fechando o scanner para não ter erro de leitura.
                    break;
                
                case 2: if(pilha.isEmpty() == false)
                        System.out.println("Elemento removido: " + pilha.pop());
                        else
                        System.out.println("Pilha vazia!");
                
                
                    System.out.println("\nElemento removido!");
                    break;
                
                case 3: if(pilha.isEmpty() == false)
                        System.out.println("Elemento do topo: " + pilha.peek());
                        else
                        System.out.println("Pilha vazia!");
                    break;
                    
                case 4:
                    System.out.println("Elementos da pilha\n");
                    System.out.println(pilha);
                    break;

            }// fim switch
            System.out.println("Pressione uma tecla para continuar");
            scanner.nextLine();
        } while (op != 0);
    }
}
