public class DataDosen13 {
    
    int jumlahLaki = 0;
    int jumlahPerempuan = 0;

    void dataSemuaDosen(Dosen13[] arrayOfDosen){
        for(Dosen13 dosen : arrayOfDosen){
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-------------------------------------");
        } 
    }

    void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen){
        for(Dosen13 dosen : arrayOfDosen){
            if(dosen.jenisKelamin){
                jumlahLaki++;
            }else{
                jumlahPerempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki   : " + jumlahLaki);
        System.out.println("Jumlah Dosen Perempuan   : " + jumlahPerempuan);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen13 [] arrayOfDosen){
        int jumlahLaki = 0;
        int jumlahPerempuan = 0;
        double totalUsiaLaki = 0;
        double totalUsiaPerempuan = 0;
        for(Dosen13 dosen : arrayOfDosen){
            if(dosen.jenisKelamin){
                totalUsiaLaki += dosen.usia;
                jumlahLaki++;

            }else{
                totalUsiaPerempuan += dosen.usia;
                jumlahPerempuan++;
            }
        }

        totalUsiaLaki/=jumlahLaki;
        totalUsiaPerempuan/=jumlahPerempuan;
        System.out.println("Rata-rata Usia Dosen Laki-laki   : " + (totalUsiaLaki));
        System.out.println("Rata-rata Usia Dosen Perempuan   : " + (totalUsiaPerempuan));
    }

    void infoDosenPalingTua(Dosen13 [] arrayOfDosen){
        Dosen13 dosenTua = arrayOfDosen[0];
        for(Dosen13 dosen : arrayOfDosen){
            if(dosen.usia > dosenTua.usia){
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode           : " + dosenTua.kode);
        System.out.println("Nama           : " + dosenTua.nama);
        System.out.println("Jenis Kelamin  : " + (dosenTua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + dosenTua.usia);
        System.out.println("-------------------------------------");
    }

    void infoDosenPalingMuda(Dosen13 [] arrayOfDosen){
        Dosen13 dosenMuda = arrayOfDosen[0];
        for(Dosen13 dosen : arrayOfDosen){
            if(dosen.usia < dosenMuda.usia){
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda");
        System.out.println("Kode           : " + dosenMuda.kode);
        System.out.println("Nama           : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin  : " + (dosenMuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + dosenMuda.usia);
        System.out.println("-------------------------------------");
    }
}
