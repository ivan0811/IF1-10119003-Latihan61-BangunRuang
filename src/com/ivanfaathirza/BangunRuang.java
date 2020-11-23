package com.ivanfaathirza;

public abstract class BangunRuang {
    protected double jariJari;

    public BangunRuang(double jariJari){
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public abstract double hitungVolume();

    public void tampil(){
        System.out.printf("Volume : %.0f cm%n", Math.ceil(hitungVolume()));
    }
}
