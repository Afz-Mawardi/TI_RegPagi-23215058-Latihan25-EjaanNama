package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan For
 *          Ejaan Nama 
 */
import java.util.Scanner;

public class Latihan_25 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama depan anda untuk di eja : ");
            String nama = scanner.nextLine();
            
            System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
            
            for (int i = 0; i < nama.length(); i++) {
                System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
            }
        }
    }
}