package com.mycompany.trabalho;
public class FaturamentoMensal {
  public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        double percentualSP = (faturamentoSP / faturamentoTotal) * 100.0;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100.0;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100.0;
        double percentualES = (faturamentoES / faturamentoTotal) * 100.0;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100.0;

        System.out.println("Percentual de representação do faturamento de SP: " + percentualSP + "%");
        System.out.println("Percentual de representação do faturamento de RJ: " + percentualRJ + "%");
        System.out.println("Percentual de representação do faturamento de MG: " + percentualMG + "%");
        System.out.println("Percentual de representação do faturamento de ES: " + percentualES + "%");
        System.out.println("Percentual de representação do faturamento de outros estados: " + percentualOutros + "%");
    }
}
