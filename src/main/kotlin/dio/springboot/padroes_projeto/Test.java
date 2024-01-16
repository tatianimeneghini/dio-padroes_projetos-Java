package dio.springboot.padroes_projeto;

import dio.springboot.padroes_projeto.facade.Facade;
import dio.springboot.padroes_projeto.singleton.SingletonEager;
import dio.springboot.padroes_projeto.singleton.SingletonLazy;
import dio.springboot.padroes_projeto.singleton.SingletonLazyHolder;
import dio.springboot.padroes_projeto.strategy.*;

// Testes relacionados aos Design Patterns
public class Test {
    public static void main(String[] arg) {
//         Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia(); // testa mesma instância
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager lazyEager = SingletonEager.getInstancia();
        System.out.println(lazyEager);
        lazyEager = SingletonEager.getInstancia();
        System.out.println(lazyEager);

        SingletonLazyHolder lazyEagerHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyEagerHolder);
        lazyEagerHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyEagerHolder);

//        Strategy:
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

//      Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ana", "40586000");
    }
}
