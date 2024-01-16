package dio.springboot.padroes_projeto.singleton;

// Singleton apressado irá instanciar imediatamente
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}