import java.util.Scanner;

public class MahasiswaDemo13mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa13[] arrayOfMahasiswa = new Mahasiswa13[3];
        String dummy;

        for (int i = 0;i <3 ;i++ ) {
            arrayOfMahasiswa[i] = new Mahasiswa13();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");

        }
        for (int i=0;i < 3; i++){
            arrayOfMahasiswa[i].cetakInfo();
        }

        Mahasiswa13[] myArrayOfMahasiswa = new Mahasiswa13[3];
        for (int i = 0; i < 3; i++) {
            
            
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;


        
    }
}
}