package dio.springboot.padroes_projeto.singleton;

// thread safe
public class SingletonLazyHolder {
    // encapsula classe intermanente
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}