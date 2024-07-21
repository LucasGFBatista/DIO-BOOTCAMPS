package com.lucasgfbatista.gof.singleton;

/**
 * Singletion "apressado"
 *
 * @author lucasgfbatista
 */

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
