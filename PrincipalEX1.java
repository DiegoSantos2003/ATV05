package view;


public class PrincipalEX1 {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do método 1");
        try {
            metodo2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor.");
            throw e; 
        }
        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do método 2");
        int[] vetor = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
            throw e; 
        }
        System.out.println("Fim do método 2");
    }
}
