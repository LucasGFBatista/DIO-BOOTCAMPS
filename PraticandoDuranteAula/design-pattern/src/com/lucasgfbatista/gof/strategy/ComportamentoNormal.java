package com.lucasgfbatista.gof.strategy;

public class ComportametoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo normalmente...");
    }
}
