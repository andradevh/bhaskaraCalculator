package com.mycompany.bhaskaracalculator;
import java.util.Scanner;

public class BhaskaraCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Digite três números (A B C): "); 
            double A, B, C; 
            A = scanner.nextDouble(); B = scanner.nextDouble(); C = scanner.nextDouble();


            
            double mult = A * C * 4; // Multiplicação
            double potencia = Math.pow(B, 2); // Potência
            double delta = potencia - mult; // Cálculo do delta

            if (delta >= 0) {
                double raiz_delta = Math.sqrt(delta); // Raiz quadrada de delta
                double bhaskara1 = (-B + raiz_delta) / (2.0 * A);
                double bhaskara2 = (-B - raiz_delta) / (2.0 * A);

                // Formatar a saída para exibir sem casas decimais se for inteiro
                System.out.println("x1 = " + (bhaskara1 % 1 == 0 ? String.format("%.0f", bhaskara1) : String.format("%.4f", bhaskara1)));
                System.out.println("x2 = " + (bhaskara2 % 1 == 0 ? String.format("%.0f", bhaskara2) : String.format("%.4f", bhaskara2)));
            } else {
                System.out.println("Erro: Delta é negativo, não é possível calcular a raiz quadrada.");
            }
        } 
    }
}
