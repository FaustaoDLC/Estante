package com.mycompany.trabalho;
import java.util.Scanner;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de dias do mês: ");
        int numDias = scan.nextInt();

        double[] faturamentoDiario = new double[numDias];

        double somaFaturamento = 0.0;

        for (int i = 0; i < numDias; i++) {
            System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");
            faturamentoDiario[i] = scan.nextDouble();
            somaFaturamento += faturamentoDiario[i];
        }

        double mediaFaturamento = somaFaturamento / numDias;

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        int numDiasSuperiorMedia = 0;

        for (int i = 0; i < numDias; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > mediaFaturamento) {
                numDiasSuperiorMedia++;
            }
        }

        System.out.println("O menor valor de faturamento diário é: " + menorFaturamento);
        System.out.println("O maior valor de faturamento diário é: " + maiorFaturamento);
        System.out.println("O número de dias em que o faturamento diário foi superior à média mensal é: " + numDiasSuperiorMedia);
    }
}
