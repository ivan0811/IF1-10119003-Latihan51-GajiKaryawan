package com.ivanfaathirza;

public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran(){
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = hadir * 10000;
    }

    public float tunjanganJabatan(String jabatan){
        return tunjanganJabatan = jabatan.equals("MANAGER") ? 2000000 : jabatan.equals("KABAG") ? 1000000 : 0;
    }

    public float tunjanganGolongan(int golongan){
        return tunjanganGolongan = golongan == 1 ? 500000 : golongan == 2 ? 1000000 : golongan == 3 ? 1500000 : 0;
    }

    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }

}
