/*crie uma classe ContaBancaria com os
metodos sacar,depositar e exibir saldo */  

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    String titular;
    Double saldo;
    int opcao;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do titular: ");
        titular = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular,saldo);
 
   do {
        System.out.println("==== ESCOLHA UMA OPÇÃO ====");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Exibir Saldo");
        System.out.println("0. Sair");    
        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
           
            case 1 -> {
                System.out.print("Informe o valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
            }
            case 2 -> {
                System.out.print("Informe o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
            }
            case 3 -> {
                conta.exibirTitular();
            }
            case 0 -> {
                System.out.println("Saindo...");
            }
            default -> {
            System.out.println("Opção invalida!!");
            }
        }

    } while (opcao != 0);
    scanner.close();

      }
      
    }

