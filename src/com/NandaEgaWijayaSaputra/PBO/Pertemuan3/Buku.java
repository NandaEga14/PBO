package com.NandaEgaWijayaSaputra.PBO.Pertemuan3;

public class Buku {
    private int harga;
    private String judul_buku;
    private int no_buku;
    private String pengarang;
    private int tahun_terbit;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public int getNo_buku() {
        return no_buku;
    }

    public void setNo_buku(int no_buku) {
        this.no_buku = no_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public void detailBuku() {
        System.out.println("No Buku      : " + no_buku);
        System.out.println("Judul        : " + judul_buku);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahun_terbit);
        System.out.println("Harga        : " + harga);
        System.out.println();
    }

    public void beli(int beli) {

    }

    public void bayar(int bayar) {

    }
}
