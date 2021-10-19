package Latihan;
import java.util.Scanner;
public class Percabangan {
  public static void main(String[] args){

    // tutorial untuk if statemant atau percabangan
    // Kondisinya Pakai Boolean (True | False)
    System.out.println("=======[A] IF ELSE STATEMANT======");
    int data = 5;
    System.out.println("Nilai = " + data);

    //ini adalah cabangnya
    if (data == 5) { // jika data sama dengan 5 maka lakukan berikut ini
      System.out.println("ini adalah jalur true"); 
    } else { //jika salah maka lakukan berikut ini
      System.out.println("ini adalah jalur false");
    }
    System.out.println("Selesai");

    System.out.printf("\n\n\n");

    System.out.println("=======[B] IF ELSE IF STATEMANT======");
    int a= 11;
    System.out.println("ini adalah awal program");
    if (a == 5) { //ekspresi 1
      // jika expresi 1 terpenuhi maka lakukan aksi 1 lalu diakhiri statemant
      System.out.println("ini adalah aksi 1");
    } else if (a == 10){//ekspresi 2
      //jika expresi 1 tdk terpenuhi lalu expresi ke 2 tepernuhi maka lakukan aksi 2 lalu akhiri statemant
      System.out.println("ini adalah aksi 2");
    }else{//ini adalah statemant defaultnya
      // jika expresi 1 dan 2 tdk terpenuhi maka lakukan aksi default lalu akhiri
      System.out.println("ini adalah aksi defaultnya"); 
    }//akhr dari if else statemant
    System.out.println("ini adalah akhir program");

    System.out.printf("\n\n\n");

    System.out.println("=======[C] Nested IF (IF Bersarang)======");
    int b = 5;
    int c = 12;
    System.out.println("Ini adalah awal Program");
    if (b == 5) { // ekspresi 1
      if (c == 10) { // ekspresi 1.1
        System.out.println("ini adalah aksi dimana b=5 dan c=10");
      } else { // ini adalah statemant default 1.1
        System.out.println("ini adalah aksi dimana b=5 dan c bukan 10");
      }
    } else if (b != 5 && c == 10)  { //expresi 2
      System.out.println("ini adalah aksi dimana b bukan 5 dan c=10");
    } else { //ini adalah statemant default 1
      System.out.println("ini adalah aksi dimana b dan c salah");
    }
    System.out.println("Ini adalah akhir Program");

    System.out.printf("\n\n\n");

    System.out.println("=======Latihan percabangan======");
    int x = 3;
    if(x == 1){
            System.out.println("(statement 1)");
    }else{
      if(x == 4){
         System.out.println("(statement 4)");
      }else{
        if(x == 2){
          System.out.println("(statement 2)");
        }else{
          System.out.println("(statement 3)");
        }
      }
    }
    System.out.println("SELESAI");

    System.out.printf("\n\n\n");

    System.out.println("=======[D] Switch Case======");
    //expresinya berupa satuan (int, long, byte, short), string, enum
    /*switch (expresi){
      case [pilihan]:
        [statemant 1]
        break; //untuk keluar dari switch dan default tdk dieksekusi
      case [Pilihan]:
        [statemant 2]
        break; //untuk keluar dari switch dan default tdk dieksekusi
      default:
        statemant default
    }
    jika  tidak ada "break;" maka case 1 dst akan di eksekusi statemantnya secara berurutan dan defaultnya akan dieksekusi juga
    dan jika casenya tdk ada yang benar maka defaultnya akan dieksekusi
    */

    String input;

    Scanner inputUser = new Scanner (System.in);
    System.out.print("Panggil nama : ");
    input = inputUser.next();
    switch (input){
      case "otong":
        System.out.println("Saya otong dan hadir bos !!!");
        break;
      case "ucup":
        System.out.println("Saya ucup dan hadir bos !!!");
        break;
      case "Mario":
        System.out.println("Saya Mario dan hadir bos !!!");
        break;
      default:
        System.out.println(input + " tidak hadir bos !!!");
    }
    System.out.println("Program Selesai");
  }
}
