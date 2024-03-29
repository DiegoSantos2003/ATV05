package view;

import Controller.OperacaoController;

public class PrincipalEX3 {
    public class TesteOperacaoController {
        public static void main(String[] args) {
            OperacaoController controller = new OperacaoController();
    
            // Teste com número positivo par
            int numeroPar = 4;
            try {
                int resultado = controller.operacaoValor(numeroPar);
                System.out.println("O quadrado de " + numeroPar + " é: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
    
            // Teste com número positivo ímpar
            int numeroImpar = 5;
            try {
                int resultado = controller.operacaoValor(numeroImpar);
                System.out.println("O cubo de " + numeroImpar + " é: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
    
            // Teste com número negativo
            int numeroNegativo = -3;
            try {
                int resultado = controller.operacaoValor(numeroNegativo);
                System.out.println("O resultado é: " + resultado); // Esta linha não será executada
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        }
    
    