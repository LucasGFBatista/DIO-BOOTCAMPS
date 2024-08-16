package com.lucasgfbatista.gof.singleton;

/*
*
* Singletion "preguiçoso"
*
*
* @author lucasgfbatista
*
* */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {

        if (instance == null) {
            instance = new SingletonLazy();
        }


        return instance;
    }
}
