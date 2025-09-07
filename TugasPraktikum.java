import java.util.Scanner;

public class TugasPraktikum {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)){
        
        //Input Data Mahasiswa       
        System.out.println ("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println ("Masukkan NIM : ");
        String NIM = input.nextLine();
        System.out.println ("Masukkan Tahun Angkatan :");
        int tahunangkatan = input.nextInt();
        input.nextLine();
        System.out.println ("Masukkan Prodi : ");
        String prodi = input.nextLine();
        System.out.println("Apakah mahasiswa aktif? (true/false) ");
        boolean status = input.nextBoolean();
        System.out.println ("Masukkan IPK : ");
        double IPK = input.nextDouble();
        
        System.out.println("\n== DATA MAHASISWA ==");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Angkatan : " + tahunangkatan);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mahasiswa Aktif : " + status);
        System.out.printf("IPK : %.2f\n", IPK);

        input.close();
        
    }
}
}