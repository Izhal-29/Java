package Latihan;
import java.util.*;
public class LatihanLooping {
  public static void main (String[] args){

    Scanner inputUser = new Scanner (System.in);
    int  nilaiAwal, nilaiAkhir, total1,total2,total3;

    System.out.println("====== While =====");
    System.out.print("Masukkan Nilai Awal : ");
    nilaiAwal = inputUser.nextInt();
    System.err.print("Masukkan Nilai Akhir : ");
    nilaiAkhir = inputUser.nextInt();

    total1 = 0;
    while(nilaiAwal <= nilaiAkhir){
      total1 = total1 + nilaiAwal;
      System.out.println("Ditambah " + nilaiAwal + " menjadi " + total1);
      nilaiAwal++;
    }

    System.out.print("\n\n\n");



    System.out.println("====== Do While =====");

    System.out.print("Masukkan Nilai Awal : ");
    nilaiAwal = inputUser.nextInt();
    System.err.print("Masukkan Nilai Akhir : ");
    nilaiAkhir = inputUser.nextInt();

    total2 = 0;
    do{

      total2 = total2 + nilaiAwal;
      System.out.println("Ditambah " + nilaiAwal + " menjadi " + total2);

      nilaiAwal++;

    } while(nilaiAwal <= nilaiAkhir);

    System.out.print("\n\n\n");



    System.out.println("====== For =====");

    System.out.print("Masukkan Nilai Awal : ");
    nilaiAwal = inputUser.nextInt();
    System.err.print("Masukkan Nilai Akhir : ");
    nilaiAkhir = inputUser.nextInt();

    total3 = 0;
    for(; nilaiAwal <= nilaiAkhir; nilaiAwal++){
    total3 = total3 + nilaiAwal;
    System.out.println("Ditambah " + nilaiAwal + " menjadi " + total3);

    } 
  }
}
