package lab_oneDigital_JAVA;

import Facade.Face;
import kotlin.Lazy;
import lab_oneDigital_Strategy.*;

public class teste {

    public static void main(String[] args) {

        // testes Relacionados ao Design Pattern Singleton;

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonHolder LazyHolder = SingletonHolder.getInstancia();
        System.out.println(LazyHolder);
        LazyHolder = SingletonHolder.getInstancia();
        System.out.println(LazyHolder);
        
        //strategy 
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentonNormal();
        ComportamentoAgressivo  agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        // facade

        Face face = new Face();
        face.migrarCliente("Venilton", "14801788");
        
    }


}
