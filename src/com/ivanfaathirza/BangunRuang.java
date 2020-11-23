package com.ivanfaathirza;

public abstract class BangunRuang {
    protected float jariJari;

    public BangunRuang(float jariJari){
        this.jariJari = jariJari;
    }

    public abstract float hitungVolume();

    public void tampil(){
        System.out.printf("Volume : %.0f cm%n", Math.ceil(hitungVolume()));
    }
}
