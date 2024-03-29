package view;


import Controller.SaldoInsuficienteException;
import model.Conta;

public class PrincipalEX2 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1000); // Saldo inicial
        conta.setLimite(500); // Limite de saque

        try {
            System.out.println("Saldo atual: " + conta.getSaldo());
            conta.saca(1500); // Tenta sacar um valor maior que o saldo + limite
            System.out.println("Saldo após saque: " + conta.getSaldo()); // Esta linha não será executada
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
