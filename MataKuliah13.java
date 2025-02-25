import java.util.Scanner;
public class MataKuliah13 {
    public String kode;
    public String nama;
    public String dummy;
    public int sks;
    public int jumlahJam;

    MataKuliah13[] arrayOfMataKuliah = new MataKuliah13[3];
    Scanner sc = new Scanner(System.in);

    public MataKuliah13() {
    }

    public MataKuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        System.out.print("Kode           : ");
        kode = sc.nextLine();
        System.out.print("Nama           : ");
        nama = sc.nextLine();
        System.out.print("Sks            : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam     : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("----------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Sks            : " + sks);
        System.out.println("Jumlah Jam     : " + jumlahJam);
        System.out.println("-------------------------------------");
    }
}
