import java.util.Scanner;

public class Dosen13 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Scanner SC = new Scanner(System.in);

    public Dosen13() {
    }
    public Dosen13(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData() {
        System.out.print("Kode                : ");
        kode = SC.nextLine();
        System.out.print("Nama                : ");
        nama = SC.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        char jk = SC.next().charAt(0);
        if (jk == 'L' ) {
            jenisKelamin = true;
        } else if(jk == 'P') {
            jenisKelamin = false;
        }
        System.out.print("Usia                : ");
        usia = SC.nextInt();
        System.out.println("----------------------------------------");
    }

    // void cetakInfo() {
    //     System.out.println("Kode           : " + kode);
    //     System.out.println("Nama           : " + nama);
    //     System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    //     System.out.println("Usia           : " + usia);
    //     System.out.println("-------------------------------------");
    // }

}





