package Main;

import Service.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Banco banco = new Banco();
        System.out.println("=== Banco Java ===");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Extrato");
        System.out.println("6. Encerrar conta");
        System.out.println("7. Listar clientes");
        System.out.println("0. Sair");
        
        banco.setOp(scanner.nextInt());
        
        System.out.println("Opção: " + banco.getOp());
        
        
        
    }
}