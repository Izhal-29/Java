package Latihan;

public class KonversiTypeData {
  public static void main(String[] args) {
    
    //Konversi data
    /*
    Mengkonversi data dapat dilakukan jika tipe data awal rentangnya lebih kecil dibanding rentang yang akan dikonversi, apa bila sebaliknya maka nilainya akan memutar (mengulang) dari rentang nilai yang dimilika oleh type data
    */
    int nilaiInt = 450 ; //32 bit
    System.out.println("Nilai Int = " + nilaiInt);

    //Memperluas Rentang ke tipe data yang lebih Besar
    long nilaiLong = nilaiInt;
    System.out.println("Nilai Long = " + nilaiLong);

    //Memperkecil rentang ke tipe data yang lebih kecil
    byte nilaiByte = (byte) nilaiInt;
    System.out.println("Nilai byte = " + nilaiByte);
    System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
    System.out.println("Nilai Min Byte = " + Byte.MIN_VALUE);

    //casting pembagian
    /*
    Jika dominan tipe datanya float maka hasilnya jdi float begitu juga berlaku dengan tipe data yang lain
    */
    int a = 10;
    float b = 4 ;

    float c = a/b;
    System.out.printf("%d / %f = %f \n",a,b,c);

    //Teknik Lain
    int x = 10;
    int y = 4;
    
    float z = (float) x/y;
    System.out.printf("%d / %d = %f \n", x,y,z);
  }
}
