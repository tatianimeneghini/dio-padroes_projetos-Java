package dio.springboot.padroes_projeto.strategy;

// Strategy
// Simplificar a variação de algoritmos para a resolução de um mesmo problema

public class Robo {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
