import java.util.Scanner;

public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyak Data MataKuliah: ");
        int banyakData = sc.nextInt();
        MataKuliah13[] arrayOfMataKuliah = new MataKuliah13[banyakData];
    
        for (int i = 0; i < banyakData; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah13();
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < banyakData; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
        // String kode,nama,dummy;
        // int sks,jumlahJam;

        // for(int i=0;i < 3; i++){
        // System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
        // System.out.print("Kode : ");
        // kode = sc.nextLine();
        // System.out.print("Nama : ");
        // nama = sc.nextLine();
        // System.out.print("Sks : ");
        // dummy = sc.nextLine();
        // sks = Integer.parseInt(dummy);
        // System.out.print("Jumlah Jam : ");
        // dummy = sc.nextLine();
        // jumlahJam = Integer.parseInt(dummy);
        // System.out.println("----------------------------------------");

        // arrayOfMataKuliah[i] = new MataKuliah13(kode, nama, sks, jumlahJam);
        // }


        // for (int i=0; i < 3 ; i++){
        // System.out.println("Data MataKuliah ke-" + (i + 1));
        // System.out.println("Kode : " + arrayOfMataKuliah[i].kode);
        // System.out.println("Nama : " + arrayOfMataKuliah[i].nama);
        // System.out.println("Sks : " + arrayOfMataKuliah[i].sks);
        // System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
        // System.out.println("-------------------------------------");
        // }
        
    }
}
