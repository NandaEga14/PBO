package com.NandaEgaWijayaSaputra.PBO.Pertemuan2;

import java.util.Scanner;//buat input

public class InputOutput {
    public static void main(String[] args) { //format = psvm
        Scanner scanner = new Scanner(System.in);//

        System.out.print("Masukkan Nama Anda : ");//format = sout
        String nama = scanner.nextLine(); // input // nextLine = buat baca String // nextInt = buat baca Int

        System.out.println("Selamat Pagi " + nama); // output
    }
}
