package com.ivanfaathirza;

public class Kerucut extends BangunRuang{
    private double tinggi;

    public Kerucut(double jariJari, double tinggi){
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1f/3f * Math.PI)* Math.pow(super.getJariJari(), 2) * tinggi;
    }
}
