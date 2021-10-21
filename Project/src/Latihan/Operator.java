package Latihan;
import java.util.*;
public class Operator {
  public static void main (String[] args){
   
    /*
    (A) Operator Aritmatika
    1. Penjumlahan
    2. Pengurangan
    3. Perkalian
    4. Pembagian
    5. Modulus
    */
    System.out.println("######---(A) Operator Aritmatika---######");
    int V1 = 10;
    int V2 = 6;
    int hasil;

    //Penjumlahan
    hasil = V1 + V2;
    System.out.println(V1 + " + " + V2 + " = " + hasil);

    //Pengurangan
    hasil = V1 - V2;
    System.out.printf("%d - %d = %d \n", V1, V2, hasil);

    // Perkalian
    hasil = V1 * V2;
    System.out.printf("%d * %d = %d \n", V1, V2, hasil);

    // Pembagian
    hasil = V1 / V2;
    System.out.printf("%d / %d = %d \n", V1, V2, hasil);

    /*
    float a = 6;
    float b = 5;
    float hasilFloat = a/b;
    */
    Float a,b,hasilFloat;
    a = 6f;
    b = 5f;
    hasilFloat = a / b;
    System.out.println(a + " / " + b + " = " + hasilFloat);

    //Modulus (Sisa Pembagian)
    hasil = V1 % V2;
    System.out.println(V1 + " % " + V2 + " = " + hasil);
    System.out.printf("%d %% %d = %d\n", V1,V2,hasil);

    System.out.printf("\n\n\n");



    
    /*
    (B) Operator Unary (operasi yang dilakukan pada 1 variable saja)
    */
    System.out.println("######---(B) Operator Unary---######");

    //unary + dan -
    int angka = 1;
    System.out.printf("unary '-' %d menjadi %d \n", angka,-angka);
    System.out.printf("unary '-' %d menjadi %d \n", angka,+angka);

    //unary decrement dan Increment

    //decrement
    int angka2 = 10;
    angka2++;
    System.out.println("nilai dengan '++' menjadi = " + angka2);

    //increment
    int angka3 = 10;
    angka3--;
    System.out.println("nilai dengan '--' menjadi = " + angka3);

    int c = 5;
    //hasilnya akan 6 karena ditambah dulu baru ditampilkan
    System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++c);
    int d = 5;
    //hasilnya akan 5 karena ditampilkan dulu baru ditambah
    System.out.printf("nilai dengan '++' postfix menjadi = %d \n", d++);
    System.out.printf("nilai hasil dari postfix menjadi = %d \n", d++);

    //unary boolean ! untuk negasi
    boolean ucup = true;
    System.out.println("nilai boolean = " + ucup);
    System.out.println("nilai boolean = " + !ucup);

    System.out.printf("\n\n\n");  



    /*
    (C) Operator Assignments
    */
    System.out.println("######---(C) Operator Assignments---######");
    int e = 1;
    e += 5; // e = e + 5;
    System.out.println("nilai e = " + e);

    int f = 10;
    f -= 5; // f = f - 5;
    System.out.println("nilai f = " + f);

    int g = 10;
    g *= 5; // g = g * 5;
    System.out.println("nilai g = " + g);

    int h = 100;
    h /= 25; // h = h / 25;
    System.out.println("nilai h = " + h);

    int i = 11;
    i %= 5; // i = i % 5;
    System.out.println("nilai i = " + i);

    System.out.printf("\n\n\n");



    /*
    (D) Operator Komparasi
    yang akan menghasilkan nilai dalam bentuk boolean / perbandingan data
    */
    System.out.println("######---(D) Operator Komparasi---######");
    boolean hasilKomparasi;
    int j,k;
    System.out.println("======PERSAMAAN======"); // Operator equal atau Persamaan
    j = 10;
    k = 10;
    hasilKomparasi = (j == k); 
    System.out.printf("%d == %d ---> %s \n", j,k,hasilKomparasi);

    j = 11;
    k = 10;
    hasilKomparasi = (j == k); 
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);


    System.out.println("======PERTIDAKSAMAAN======");// Operator Not Equal atau Pertidaksamaan
    j = 10;
    k = 10;
    hasilKomparasi = (j != k); 
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 12;
    k = 10;
    hasilKomparasi = (j != k); 
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);


    System.out.println("======KURANG DARI======");// Operator LESS THAN / KURANG DARI
    j = 10;
    k = 10;
    hasilKomparasi = (j < k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 10;
    k = 12;
    hasilKomparasi = (j < k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);


    System.out.println("======LEBIH DARI======");// Operator GREATER THAN / LEBIH DARI
    j = 10;
    k = 10;
    hasilKomparasi = (j > k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 12;
    k = 10;
    hasilKomparasi = (j > k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);


    System.out.println("======KURANG DARI SAMADENGAN======");// Operator LESS THAN EQUAL / KURANG DARI
    j = 9;
    k = 10;
    hasilKomparasi = (j <= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 10;
    k = 10;
    hasilKomparasi = (j <= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 12;
    k = 10;
    hasilKomparasi = (j <= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    System.out.println("======LEBIH DARI SAMADENGAN======");// Operator GREATER THAN EQUAL / LEBIH DARI
    j = 9;
    k = 10;
    hasilKomparasi = (j >= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 10;
    k = 10;
    hasilKomparasi = (j >= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    j = 12;
    k = 10;
    hasilKomparasi = (j >= k);
    System.out.printf("%d == %d ---> %s \n", j, k, hasilKomparasi);

    System.out.printf("\n\n\n");



    /*
    (E) Operator Logika
    opearasi yang kita bisa lakukan kepada tipe data boolean
    AND, OR, XOR, NEGASI

               |---TRUE  --> 1  
    BOOLEAN----
               |---FALSE --> 0
    Kita bisa melakukan operasi aritmatika yang hasilnya boolean

    === OR ===           === AND ===          === XOR ===         
     a | b | c            a | b | c            a | b | c            
     0 | 0 | 0 false      0 | 0 | 0 false      0 | 0 | 0 false      
     0 | 1 | 1 true       0 | 1 | 0 false      0 | 1 | 1 true        
     1 | 0 | 1 true       1 | 0 | 0 false      1 | 0 | 1 true        
     1 | 1 | 1 true       1 | 1 | 1 true       1 | 1 | 0 false      

    */
    System.out.println("######---(E) Operator Logika---######");

    //OR / (||)
    boolean m, n,l;
    System.out.println("====== OR (||) ======");
    m = false;
    n = false; 
    l = (m||n);
    System.out.println(m + " || " + n + " = " + l);
    m = false;
    n = true;
    l = (m || n);
    System.out.println(m + " || " + n + " = " + l);
    m = true;
    n = false;
    l = (m || n);
    System.out.println(m + " || " + n + " = " + l);
    m = true;
    n = true;
    l = (m || n);
    System.out.println(m + " || " + n + " = " + l);


    // AND / (&&)
    System.out.println("====== AND (&&) ======");
    m = false;
    n = false;
    l = (m && n);
    System.out.println(m + " && " + n + " = " + l);
    m = false;
    n = true;
    l = (m && n);
    System.out.println(m + " && " + n + " = " + l);
    m = true;
    n = false;
    l = (m && n);
    System.out.println(m + " && " + n + " = " + l);
    m = true;
    n = true;
    l = (m && n);
    System.out.println(m + " && " + n + " = " + l);


    // XOR / Exclusive OR (^)
    System.out.println("====== XOR (^) ======");
    m = false;
    n = false;
    l = (m ^ n);
    System.out.println(m + " ^ " + n + " = " + l);
    m = false;
    n = true;
    l = (m ^ n);
    System.out.println(m + " ^ " + n + " = " + l);
    m = true;
    n = false;
    l = (m ^ n);
    System.out.println(m + " ^ " + n + " = " + l);
    m = true;
    n = true;
    l = (m ^ n);
    System.out.println(m + " ^ " + n + " = " + l);

    
    // NOT / Negasi ---> flipping (!)
    System.out.println("====== NOT (!) ======");
    m = true;
    l = !m;
    System.out.println(m + " ----> (!) " + l);
    n = false;
    l = !n;
    System.out.println(n + " ----> (!) " + l);

    System.out.printf("\n\n\n");



    /*
    (F) Operator Bitwise
    sebuah operator untuk melakukan operasi pada nilai bit

    8 bit = 1 byte

    decimal                 bit
       |                     |
       |      2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
       |      128 64  32  16   8   4   2   1 
       0    =  0   0   0   0   0   0   0   0
       1    =  0   0   0   0   0   0   0   1  --> 2^0 = 1
       2    =  0   0   0   0   0   0   1   0  --> 2^1 = 2 
       3    =  0   0   0   0   0   0   1   1  --> 2^1 + 2^0 = 3

       angka 0 tidak dihitung

    */
    System.out.println("######---(F) Operator Bitwise---######");

    byte o = 28;
    byte p,q;
    String o_bits,p_bits,q_bits;

    o_bits = String.format("%8s",Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n",o_bits, o);
    System.out.printf("\n");

    //operator SHIFT LEFT
    System.out.println("======SHIFT LEFT======");
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    p =(byte)(o << 2);
    p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.printf("\n");

    // operator SHIFT RIGHT
    System.out.println("======SHIFT RIGHT======");
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    p = (byte) (o >> 2);
    p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.printf("\n");

    // operator Bitwise OR (|)
    System.out.println("======Bitwise OR======");
    o = 24;
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    p = 12;
    p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.println("------OR------");
    q = (byte) (o|p);
    q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
    System.out.printf("%s = %d \n", q_bits, q);
    System.out.printf("\n");

    // operator Bitwise AND (&)
    System.out.println("======Bitwise AND======");
    o = 24;
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    p = 12;
    p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.println("------AND------");
    q = (byte) (o & p);
    q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
    System.out.printf("%s = %d \n", q_bits, q);
    System.out.printf("\n");

    // operator Bitwise XOR (^)
    System.out.println("======Bitwise AND======");
    o = 24;
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    p = 12;
    p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.println("------XOR------");
    q = (byte) (o ^ p);
    q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
    System.out.printf("%s = %d \n", q_bits, q);
    System.out.printf("\n");

    // operator Bitwise NOT (~)
    System.out.println("======Bitwise NOT======");
    o = 24;
    p = (byte) (~o);
    o_bits = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
    System.out.printf("%s = %d \n", o_bits, o);
    System.out.println("------NOT------");
    p_bits = String.format("%8s", Integer.toBinaryString(p).substring(24));
    System.out.printf("%s = %d \n", p_bits, p);
    System.out.printf("\n\n\n");



    System.out.println("######---(G) Ternary Operator ---######");
    //
    //variabel x = ekspresi ? statemant_true : statemeant_false

    int input,x,y,z;
    Scanner inputUser = new Scanner (System.in);

    // jika memakai IF Else
    System.out.print("Masukkan Nilai X : ");
    
    input = inputUser.nextInt();
   
    if (input==10){;
      x = input*input;
    } else {
      x = input/2;
    }
    System.out.println("hasil X : " + x);


    //jika memakai Ternary operator
    System.out.print("Masukkan Nilai Y : ");

    z = inputUser.nextInt();
    y = (z == 10) ? (z*z) : (z/2);

    System.out.println("hasil Y : " + y);
  }
}
