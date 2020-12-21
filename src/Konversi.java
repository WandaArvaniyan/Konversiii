
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wanda
 */
public class Konversi {
    public static void main(String[] args) {
        // pilihan
        System.out.println("Pilihan Konversi : \n"
                        + " 1. Jam -> Menit\n"
                        + " 2. Detik -> Hari, Jam, Menit, dan Detik");
        System.out.println("\nMasukkan Pilihan : ");
        try (Scanner options = new Scanner(System.in)){
           if(!options.hasNextInt()){
               System.out.println("Itu alfabet, Anda salah!");
           } else {
               if(options.nextInt() == 1){
                   System.out.println("Masukkan Jam : ");
                           Scanner Hours = new Scanner(System.in);
                           JamKeMenit(Hours.nextInt());
               } else {
                   System.out.println("Masukkan Detik : ");
                   try(Scanner seconds = new Scanner(System.in)){
                       DetikKeHari(seconds.nextLong());
                   }
               }
           }
        }
    }
    public static void JamKeMenit(long jam){
        long menit = jam * 60;
        System.out.println("Menit : " + menit);
    }
    public static void DetikKeHari(long detik){
        // hari
        int hari = (int)(detik /(60 * 60 * 24));
        
        // jam
        detik %= (60 * 60 * 24);
        int jam = (int)(detik / (60 * 60));
        
        // menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        
        //detik
        detik %= 60;
        
        System.out.println(hari + "Hari, " + jam + "Jam, " + menit + "menit, " + detik + "Detik, ");
    }
}
