package com.pbomodul6;

public class DemoNegara {
    public static void main(String[] args) {
        System.out.println("\nProgram Polimorphism");
        System.out.println("=====================\n");
        Negara objnegara = new Negara();
        Indonesia objindonesia = new Indonesia();
        Malaysia objmalaysia = new Malaysia();
        Singapura objsingapura = new Singapura();
        Thailand objthailand = new Thailand();
        Vietnam objvietnam = new Vietnam();
        Negara[] Negara = new Negara[6];
        Negara[0] = objnegara;
        Negara[1] = objindonesia;
        Negara[2] = objmalaysia;
        Negara[3] = objsingapura;
        Negara[4] = objthailand;
        Negara[5] = objvietnam;
        System.out.println("Negara[0] : " + Negara[0].nama());
        System.out.println("Negara[1] : " + Negara[1].nama());
        System.out.println("Negara[2] : " + Negara[2].nama());
        System.out.println("Negara[3] : " + Negara[3].nama());
        System.out.println("Negara[4] : " + Negara[4].nama());
        System.out.println("Negara[5] : " + Negara[5].nama());
    }
}
