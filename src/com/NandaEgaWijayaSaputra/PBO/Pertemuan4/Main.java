package com.NandaEgaWijayaSaputra.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args){
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        pegawai.nip = 191220032;
        pegawai.nama = "Ahmad";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);
        manajer.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
