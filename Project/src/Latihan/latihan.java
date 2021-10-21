package Latihan;

import java.util.*;//Scanner ( * )
//saya mau mengambil sebuah library scanner yang ada dalam folder utility yang bernama scanner

public class latihan {
  public static void main(String[] args) {
    /*                        |      |
                            String   Mengambil data pada array sesuai nomor index
                            Array

    cara negejalaninnya lewat terminal dan eksekusi dari folder bin, berikut perintahnya :
    java Latihan.latihan [index1] [index2]
    */

    // System.out.println("Halo " + args[0] + " Ganteng");
    // System.out.println("Halo " + args[1] + " Manis");
    /*
    int panjang = 5;
    int lebar = 4;

    int luas = panjang * lebar;
    System.out.println(luas);


    Scanner userInput = new Scanner(System.in); // dia akan ngambil yang user input
    int p,l,t,L,V;
    System.out.println("======MENGHITUNG LUAS======");
    System.out.print("Input Panjang = ");
    p = userInput.nextInt();
    System.out.print("Input Lebar = ");
    l = userInput.nextInt();

    L = p * l;
    System.out.println("Luas = " + L);
    
    System.out.println("======Menghitung Volume======");
    System.out.print("Input Tinggi = ");
    t = userInput.nextInt();
    V = L * t ;

    System.err.println("Volume = " + V);

    System.out.println("====== MENGHITUNG PERSAMAAN KUADRAT ======");
    int m,c,x,y;
    System.out.print("Nilai x = ");
    x = userInput.nextInt();
    System.out.print("Gradient m = ");
    m = userInput.nextInt();
    System.out.print("Bias c = ");
    c = userInput.nextInt();
    y = m * x * x + c;
    System.out.println("Nilai y = " + y);
    */

    //Fungsi Atau Method
    //mendefenisikan sebuah persamaan/perhitungan atau apapun itu senhingga kita bisa memangggilnya berulang-ulang

    //System.out.println("\n\n\n");
    /*
    System.out.println("Fungsi atau Method");
  
    //y = x + 2 = x
    int y,x;
    x = 5;
    y = hitung (x);

    System.out.println("x = " + x + ", y = " + y);

    x = 20;
    y = hitung(x);

    System.out.println("x = " + x + ", y = " + y);

    x = 40;
    y = hitung(x);

    System.out.println("x = " + x + ", y = " + y);
    
  }
  
  static int hitung (int input){
    int hasil;
    
    hasil = (input + 2) * input;
    // hasil = input * input;

    return hasil;
    */
    Scanner userInput = new Scanner (System.in);

    //while (true) {
      System.out.print("Panjang = ");
      int InputPanjang = userInput.nextInt();
      System.out.print("Lebar = ");
      int InputLebar = userInput.nextInt();

      // memanggil fungsi Gambar
      gambar(InputPanjang, InputLebar);

      int luas = InputLebar * InputPanjang;
      System.out.println("Luas = " + luas(InputPanjang, InputLebar));

      int keliling = (InputPanjang + InputLebar) * 2;
      System.out.println("Keliling = " + keliling(InputPanjang, InputLebar));

      //memanggil fungsi tampilkanKelilingDanLuas
      tampilkanKelilingDanLuas(InputPanjang, InputLebar);
   // }
  }


  // fungsi memanggil fungsi
  private static void tampilkanKelilingDanLuas(int panjang, int lebar) {
    System.out.println("\n");
    System.out.println("Ini adalah fungsi memanggil fungsi");
    System.out.println("Luas = " + luas(panjang, lebar));
    System.out.println("Keliling = " + keliling(panjang, lebar));
  }

  //fungsi Keliling
  private static int keliling(int panjang, int lebar) {
    int hasil = (panjang+lebar)*2;
    return hasil;
  }

  //fungsi luas
  private static int luas(int panjang, int lebar) {
    int hasil = panjang*lebar;
    return hasil;
  }

  //fungsi gambar
  public static void gambar(int panjang, int lebar){
    System.out.println("ini adalah fungsi gambar");
    for (int i = 0; i < lebar; i++){
      for (int j = 0; j < panjang; j++){
        System.out.print("* ");
      }
    System.out.print("\n");
    }
  }
  
}
