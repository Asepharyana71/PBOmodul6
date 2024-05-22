package com.pbomodul6;

class Bentuk {
    public void gambar() {
        System.out.println("Gambar Bentuk");
    }
    public void hapus() {
        System.out.println("Hapus Bentuk");
    }
}
class Lingkaran extends Bentuk {
    public void gambar() {
        System.out.println("Gambar Lingkaran");
    }
    public void hapus() {
        System.out.println("Hapus Lingkaran");
    }
}
class elips extends Bentuk {
    public void gambar() {
        System.out.println("Gambar elips");
    }
    public void hapus() {
        System.out.println("Hapus elips");
    }
}
class segitiga extends Bentuk {
    public void gambar() {
        System.out.println("Gambar segitiga");
    }
    public void hapus() {
        System.out.println("Hapus segitiga");
    }
}
public class TestBentuk {
    public static void main(String[] args) {
        Bentuk b = new Bentuk();
        Lingkaran l = new Lingkaran();
        elips e = new elips();
        segitiga s = new segitiga();
        System.out.println("Bentuk");
        b.gambar();
        b.hapus();
        System.out.println("Lingkaran");
        l.gambar();
        l.hapus();
        System.out.println("elips");
        e.gambar();
        e.hapus();
        System.out.println("segitiga");
        s.gambar();
        s.hapus();
    }
}
