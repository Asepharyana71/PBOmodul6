package com.pbomodul6;

public class Hewan {
    String jenis,ciri;
    public void suara(){
        System.out.println("Suara hewan");

    }
    public void berjalan(){
        System.out.println("cara berjalan hewan");
    }
    
}
class Singa extends Hewan{
    public void suara(){
        System.out.println("Wouuu..woouu..woouu");
    }
    public void berjalan(){
        System.out.println("Berlari");
        System.out.println("==================================");
    }
}
class Elang extends Hewan{
    public void suara(){
        System.out.println("Teooookk..teoookk..teoookk");
    }
    public void berjalan(){
        System.out.println("Terbang");
        System.out.println("==================================");
    }
}
class Lebah extends Hewan{
    public void suara(){
        System.out.println("wungggg");
    }
    public void berjalan(){
        System.out.println("Terbang");
        System.out.println("==================================");
    }
}
class Paus extends Hewan{
    public void suara(){
        System.out.println("Boooooooooom");
    }
    public void berjalan(){
        System.out.println("berenang");
        System.out.println("==================================");
    }
}
