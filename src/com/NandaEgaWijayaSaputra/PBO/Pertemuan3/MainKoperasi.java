package com.NandaEgaWijayaSaputra.PBO.Pertemuan3;

public class MainKoperasi {
    public static void main(String[] args) {
        Koperasi buku = new Koperasi();

        buku.setNama_barang("Buku Tulis");
        buku.setHarga_barang(5000);
        buku.setJumlah_barang(10);
        buku.detailBarang();

        Koperasi pensil = new Koperasi(3000, "Pensil", 20);
        pensil.detailBarang();

        Koperasi sewa = new Koperasi();
        sewa.setTotal(buku.getTotal() + pensil.getTotal());
        System.out.println("Total Harga Semua Barang : " + sewa.getTotal());

    }
}