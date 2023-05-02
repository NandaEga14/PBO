package com.NandaEgaWijayaSaputra.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Input Batas Bilangan : ");
        bilangan = input.nextInt();

        System.out.println("~Program Menampilakan Batas Bilangan~");
        for (int i = 1; i <= bilangan; i++){
            if (i % 2 == 0) {
                System.out.println("Angka- " + i);
            }
        }
    }

}
