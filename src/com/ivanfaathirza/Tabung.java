package com.ivanfaathirza;

public class Tabung extends BangunRuang{
    private float tinggi;
    public Tabung(float jariJari, float tinggi){
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public float hitungVolume() {
        return (float) (Math.PI * tinggi  * Math.pow(jariJari,2));
    }
}
