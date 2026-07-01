/*Desenvolva um Sistema de Cadastro e Gerenciamento de Alunos em Java, executado no console. O sistema deve permitir cadastrar, listar, buscar e avaliar alunos, utilizando os conteúdos estudados no módulo.

Requisitos obrigatórios:
⦁	uso de Scanner
⦁	uso de switch case
⦁	uso de if/else
⦁	uso de laço de repetição
⦁	uso de vetor
⦁	criação de classe Aluno
⦁	uso de construtor
⦁	encapsulamento com getters e setters

Funcionalidades mínimas:
⦁	cadastrar aluno
⦁	listar alunos
⦁	buscar aluno por matrícula
⦁	calcular média
⦁	informar situação do aluno
 */
import java.util.Scanner;

public class App {
    static Aluno[] alunos = new Aluno[100];
    static int totalAlunos = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("=== Sistema de Login ===");
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        Login login = new Login(username, password);
        if (login.autenticar()) {
            System.out.println("Login bem-sucedido!");

        } else {
            System.out.println("Login falhou. Verifique suas credenciais.");
        }

        if (!login.autenticar()) {
            scanner.close();
            return;
        }

        int opcao;
        do { 
          System.out.println("==== ESCOLHA UMA OPÇÃO ====");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno por Matrícula");    
            System.out.println("4. Calcular Média");
            System.out.println("5. Informar Situação do Aluno");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1 -> {
                    // Lógica para cadastrar aluno
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();

                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();
                    scanner.nextLine(); 

                    Aluno aluno = new Aluno(nome, idade, matricula, nota1, nota2);
                    alunos[totalAlunos] = aluno;
                    totalAlunos++;
                    aluno.exibirAluno();
                }
                case 2 -> {
                    // Lógica para listar alunos
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            alunos[i].exibirAluno();
                        }
                    }
                }
                case 3 -> {
                    // Lógica para buscar aluno por matrícula
                    System.out.print("Digite a matrícula do aluno: ");
                    String buscaMatricula = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].getMatricula().equals(buscaMatricula)) {
                            alunos[i].exibirAluno();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                }
                case 4 -> {
                    // Lógica para calcular média
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado para calcular média.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;
                            System.out.println("Média do aluno " + alunos[i].getNome() + ": " + media);
                        }
                    }

                }
                case 5 -> {
                    // Lógica para informar situação do aluno
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado para informar situação.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;
                            String situacao = media >= 6 ? "Aprovado" : "Reprovado";
                            System.out.println("Situação do aluno " + alunos[i].getNome() + ": " + situacao);
                        }
                    }
                }
                    
                  
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
                                        } while (opcao != 0);
                }
            }
        }
            

