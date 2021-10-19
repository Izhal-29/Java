package Latihan;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Looping {
  public static void main(String[] args){

    /*Pengulangan / looping 
    1. While
        while (kondisi [true/false]){
          aksi
        }
    2. do while
        do {
          aksi
        } while (kondisi [true/false])
    3. for
        for(inisialisasi;kondisi;stepnilai){
          aksi
        }
        
    */
    System.out.println("====== While =====");   

    int a=0;
    boolean k1 = true;
    System.out.println("awal program");

    while (k1){
      System.out.println("while looping ke - " + a);
     
      if (a == 10) {
      k1 = false;
      }
      
      a++;

    }

    System.out.println("program berakhir");
    System.out.print("\n\n\n");



    System.out.println("====== Do While =====");

    System.out.println("awal program");
    int b=0;
    boolean k2=true;
    do{
      b++;
      System.out.println("Do while looping ke - " + b);

      if (b == 10) {
        k2 = false;
      }

    } while (k2);

   System.out.println("ini adalah akhir program");

   System.out.print("\n\n\n");



   System.out.println("====== For =====");

   System.out.println("Loop Pertama");
   for (int nilai = 0; nilai <=10; nilai++) {

     System.out.println("for loop ke - " + nilai);

   }
   System.out.println("Program berakhir");

   System.out.println("\n");

   System.out.println("Loop Kedua");
   for (int nilai = 0; nilai < 10; nilai++) {

     System.out.println("for loop ke - " + nilai);

   }
   System.out.println("Program berakhir");

   System.out.println("\n");

   System.out.println("Loop Ketiga");
   for (int nilai = 10; nilai >= 5; nilai--) {

     System.out.println("for loop ke - " + nilai);

   }
   System.out.println("Program berakhir");

   System.out.println("\n");

   System.out.println("Loop Keempat");
   int nilai = 0;
   for (; nilai <= 10;) {

     System.out.println("for loop ke - " + nilai);
     nilai++;
   }
   
   System.out.println("Program berakhir");
  }
}
