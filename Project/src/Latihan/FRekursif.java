package Latihan;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class FRekursif {
  public static void main(String[] args){
  
    Scanner userInput = new Scanner (System.in);
    System.out.print("Masukkan Nilai : ");
    int nilai = userInput.nextInt();
    System.out.println("Anda memasukkan nilai = " + nilai);


    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
    System.out.println("Jumlah = " + jumlah);
   
    int faktorial = hitungFaktorial(nilai);
    System.out.println("Hasil Faktorial = " + faktorial);
  }
  
  // fungsi rekursi sederhana
  private static int jumlahNilai(int parameter) {
    System.out.println("parameter = " + parameter);
    if(parameter == 0){
      return parameter;
    }
    
    return parameter + jumlahNilai(parameter-1);
  }
  
  private static int hitungFaktorial(int parameter) {
    System.out.println("parameter = " + parameter);
    if (parameter == 1) {
      return parameter;
    }

    return parameter * hitungFaktorial(parameter - 1);
  }

  private static void printNilai(int parameter) {
    System.out.println("nilai = " + parameter);
    if (parameter == 0){
      return;
    }
    parameter--;
    printNilai(parameter);
  }
}
