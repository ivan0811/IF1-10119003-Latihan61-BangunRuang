package com.ivanfaathirza;

public class Tabung extends BangunRuang{
    private double tinggi;
    public Tabung(double jariJari, double tinggi){
        super(jariJari);
        this.tinggi = tinggi;
    }


    @Override
    public double hitungVolume() {
        return Math.PI * tinggi  * Math.pow(super.getJariJari(),2);
    }
}
