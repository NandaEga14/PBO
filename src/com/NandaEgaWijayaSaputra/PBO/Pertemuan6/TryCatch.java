package com.NandaEgaWijayaSaputra.PBO.Pertemuan6;

public class TryCatch {
    //Membuat method main
    public static void main(String[] args) {
        //Membuat array
        int[] angka = {
                1,2,3,4,5
        };

        System.out.print("Index ke 4 ada : ");
        try {
            //Memanggil array berdasarkan index
            System.out.println(
                    angka[4]
            );
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }

        System.out.println("Index ke 6 ngga ada : ");
        try {
            //Memanggil array berdasarkan index
            System.out.println(
                    angka[6]
            );
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }
    }
}