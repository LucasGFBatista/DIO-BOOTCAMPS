package com.lucasgfbatista.gof.singleton;

/**
 *
 * Singletion "Lazy Holder"
 *
 *@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author lucasgfbatista
 *
 * */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instance;

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {

        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
}
