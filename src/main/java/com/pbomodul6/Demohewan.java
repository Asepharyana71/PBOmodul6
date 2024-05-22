package com.pbomodul6;

public class Demohewan {
    public static void main(String[] args) {
        Lebah HewanLebah = new Lebah();
        Paus HewanPaus = new Paus();
        Singa HewanSinga = new Singa();
        Elang HewanElang = new Elang();
        Hewan h;
        System.out.println("Lebah");
        h = HewanLebah; h.suara(); h.berjalan();
        System.out.println("Singa");
        h = HewanSinga; h.suara(); h.berjalan();
        System.out.println("Elang");
        h = HewanElang; h.suara(); h.berjalan();
        System.out.println("Paus");
        h = HewanPaus; h.suara(); h.berjalan();
    }
}
