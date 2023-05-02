package com.NandaEgaWijayaSaputra.PBO.Pertemuan3;

public class Koperasi {
    private int harga_barang;
    private String nama_barang;
    private int jumlah_barang;
    private int total;

    public Koperasi() {
    }

    public Koperasi(int harga_barang, String nama_barang, int jumlah_barang) {
        this.harga_barang = harga_barang;
        this.nama_barang = nama_barang;
        this.jumlah_barang = jumlah_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void detailBarang() {
        total = harga_barang * jumlah_barang;

        System.out.println("Nama Barang     : " + nama_barang);
        System.out.println("Harga Baarang   : " + harga_barang);
        System.out.println("Jumlah Barang   : " + jumlah_barang);
        System.out.println("Total Harga     : " + total);
        System.out.println();
    }
}
