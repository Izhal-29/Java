package Latihan;
  import java.util.*;
public class LatihanOL {
  public static void main(String[] Args){
    //membuat sebuah objek untuk mennagkap input dari user
    Scanner InputUser = new Scanner(System.in);
    int nilaiBenar = 6;
    int nilaiTebakan;
    boolean statusTebakan;

    //sebuah program sederhana untuk menebak sebuah angka
    System.out.print("Masukkan nilai tebakan : ");
    nilaiTebakan = InputUser.nextInt();
    statusTebakan = (nilaiTebakan == nilaiBenar);
    System.out.println("Nilai Tebakan anda adalah : " + nilaiTebakan);
    System.out.println("Tebakan anda : " + statusTebakan);

    //Operator aljabar Boolean (and / or)
    System.out.print("Masukkan nilai diantara 4 dan 9 : ");
    nilaiTebakan = InputUser.nextInt();
    statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9 );
    System.out.println("Tebakan anda : " + statusTebakan);


  }
}
