package com.NandaEgaWijayaSaputra.PBO.Pertemuan5;

public class barang {
    // Attribute
    String nama ;
    int harga;

    // Constructor
    public barang(){}

    public barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method
    public void showInfo(){
        System.out.println("Nama Barang :" + this.nama);
        System.out.println("Harga Barang :" + this.harga);
        System.out.println();
    }
}
