import java.util.Scanner;

public class DosenDemo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("=========== Program Dosen ============");
        System.out.print("Masukkan Banyak Data Dosen: ");
        int banyakDD = sc.nextInt();
        Dosen13[] arrayOfDosen = new Dosen13[banyakDD];
    
        for (int i = 0; i < banyakDD; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen13();
            arrayOfDosen[i].tambahData();
        }

        
        DataDosen13 dosen = new DataDosen13();
        
        dosen.dataSemuaDosen(arrayOfDosen);

        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

        dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        dosen.infoDosenPalingTua(arrayOfDosen);

        dosen.infoDosenPalingMuda(arrayOfDosen);



    }
}