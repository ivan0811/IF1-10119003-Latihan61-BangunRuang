package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan hasil hitung kerucut, bola dan tabung menggunakan konsep abtract
 */

public class Main {

    public static void main(String[] args) {
        BangunRuang kerucut, tabung, bola;
        bola = new Bola(7);
        System.out.println("Volume Bola Basket");
        bola.tampil();

        kerucut = new Kerucut(14, 9);
        System.out.println("Volume Bola Kerucut");
        kerucut.tampil();

        tabung = new Tabung(10, 21);
        System.out.println("Volume Bola Tabung");
        tabung.tampil();

    }
}
