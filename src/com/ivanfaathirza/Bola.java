package com.ivanfaathirza;

public class Bola extends BangunRuang{

    public Bola(double jariJari){
        super(jariJari);
    }

    @Override
    public double hitungVolume() {
        return 4/3f * Math.PI * Math.pow(super.getJariJari(), 3);
    }
}
