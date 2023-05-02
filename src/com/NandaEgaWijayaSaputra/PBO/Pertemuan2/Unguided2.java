package com.NandaEgaWijayaSaputra.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided2 {
    public static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : Nanda Ega Wijaya Saputra");
        System.out.println("NIM  : 21102195");
        System.out.println();
        System.out.println();

        String nama;
        int umur, Pilih;
        System.out.println("=====================================");
        System.out.println("-- Form Pendaftaran Mahasiswa Baru --");
        System.out.println("=====================================");
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        umur = input.nextInt();

        if (umur <= 17) {
            clearScreen();
            System.out.println("Program Tidak Berjalan, Umur Anda Belum Mencukup");

        } else if (nama == "") {
            System.out.println("ERROR, Mohon Masukkan Nama Terlebih Dahulu !!!");

        } else {
            clearScreen();
            System.out.println("Pilih Jurusan : ");
            System.out.println("1. Teknik Informatika");
            System.out.println("2. Sistem Informasi");
            System.out.println("3. Rekayasa Perangkat Lunak");
            System.out.print("Masukkan Pilihan : ");
            Pilih = input.nextInt();
            System.out.println();

            if (Pilih == 1) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama : " + nama);
                System.out.println("Umur : " + umur);
                System.out.println("Jurusan : Teknik Informatika");
            } else if (Pilih == 2) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama : " + nama);
                System.out.println("Umur : " + umur);
                System.out.println("Jurusan : Sistem Informasi");
            } else if (Pilih == 3) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama : " + nama);
                System.out.println("Umur : " + umur);
                System.out.println("Jurusan : Rekayasa Perangkat Lunak");
            } else {
                System.out.println("Program ERROR, Pilihan Tidak Tersedia !");
            }
        }
        input.close();
    }
}
