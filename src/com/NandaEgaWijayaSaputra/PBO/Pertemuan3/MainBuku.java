package com.NandaEgaWijayaSaputra.PBO.Pertemuan3;

import java.util.Scanner;

public class MainBuku {

    public static void main(String[] args) {
        int pilih;
        int jml, bayar, totalHarga;

        Scanner input = new Scanner(System.in);
        Buku bk1 = new Buku();
        Buku bk2 = new Buku();

        System.out.println("=== Lisk Buku ===");
        bk1.setNo_buku(1);
        bk1.setJudul_buku("Pemrograman berbasis Objek Dengan Java");
        bk1.setPengarang("Indrajani");
        bk1.setTahun_terbit(2007);
        bk1.setHarga(70000);

        bk2.setNo_buku(2);
        bk2.setJudul_buku("Dasar Pemrograman Java");
        bk2.setPengarang("Abdul Kadir");
        bk2.setTahun_terbit(2004);
        bk2.setHarga(30000);

        bk1.detailBuku();
        bk2.detailBuku();

        System.out.println("===========================================");
        System.out.print("Masukan No Buku yang ingin dibeli     : ");
        pilih = input.nextInt();
        System.out.print("Masukan jumlah buku yang ingin dibeli : ");
        jml = input.nextInt();

        if (pilih == 1) {
            totalHarga = bk1.getHarga() * jml;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukan jumlah uang : ");
            bayar = input.nextInt();
            if (bayar <= totalHarga) {
                System.out.println("Maaf uang anda tidak cukup.");
            } else {
                System.out.println("=== Rincian Pembelian Buku ===");
                bk1.detailBuku();
                System.out.println("=== Rincian pembayaran ===");
                System.out.println("Jumlah bayar : " + bayar);
                System.out.println("Kembalian   : " + (bayar - totalHarga));
            }
        } else if (pilih == 2) {
            totalHarga = bk2.getHarga() * jml;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukan jumlah uang : ");
            bayar = input.nextInt();
            if (bayar <= totalHarga) {
                System.out.println("Maaf uang anda tidak cukup.");
            } else {
                System.out.println("=== Rincian Pembelian Buku ===");
                bk2.detailBuku();
                System.out.println("=== Rincian pembayaran ===");
                System.out.println("Jumlah bayar : " + bayar);
                System.out.println("Kembalian    : " + (bayar - totalHarga));
            }
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }
        input.close();
    }
}