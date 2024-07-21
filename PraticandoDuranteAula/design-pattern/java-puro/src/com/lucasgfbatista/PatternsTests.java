package com.lucasgfbatista;

import com.lucasgfbatista.gof.facade.Facade;
import com.lucasgfbatista.gof.singleton.SingletonEager;
import com.lucasgfbatista.gof.singleton.SingletonLazy;
import com.lucasgfbatista.gof.singleton.SingletonLazyHolder;
import com.lucasgfbatista.gof.strategy.*;

public class PatternsTests {

    public static void main(String[] args) {

        //DESIGN PATTERN - SINGLETON
        //LAZY
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //EAGER
        System.out.println("\n");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);


        //LAZY HOLDER
        System.out.println("\n");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //DESIGN PATTERN - STRATEGY
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();


        //DESIGN PATTERN - FACADE
        System.out.println("\n");
        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "41341321");
    }


}
