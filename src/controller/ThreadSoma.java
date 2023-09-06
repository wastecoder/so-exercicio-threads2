package controller;

public class ThreadSoma extends Thread {
    private int[] linha;
    private int indiceLinha;

    public ThreadSoma(int[] linha, int indiceLinha) {
        this.linha = linha;
        this.indiceLinha = indiceLinha;
    }

    public int somarLinha() {
        int acumulador = 0;
        for (int valorAtual : linha) {
            acumulador += valorAtual;
        }

        return acumulador;
    }

    @Override
    public void run() {
        System.out.println("indice: " + indiceLinha + " |==> soma = " + somarLinha());
    }
}
