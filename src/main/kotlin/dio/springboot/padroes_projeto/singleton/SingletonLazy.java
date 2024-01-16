package dio.springboot.padroes_projeto.singleton;

//Singleton
// Criação de única instância de uma classe e fornece um modo para recuperá-la

// não disponibiliza a instância, antes faz uma verificação se é vazia ou não
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}