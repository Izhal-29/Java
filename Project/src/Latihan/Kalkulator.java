package Latihan;
import java.util.*;
public class Kalkulator {
  public static void main(String[] args){

    Float a,b,hasil;
    char operator;
    String o;
    Scanner inputUser;

    inputUser = new Scanner(System.in);

    // System.out.print("Nilai a = ");
    // a = inputUser.nextFloat();
    // System.out.print("Operator = ");
    // operator = inputUser.next().charAt(0);
    // System.out.print("Nilai b = ");
    // b = inputUser.nextFloat();

    // System.out.println("Input User = " + a + " " + operator + " " + b);

    //menangkap operator
    // if (operator == '+') {
    //   hasil = a + b;
    //   System.out.println("Hasil = " + hasil);
    // } else if (operator == '-'){
    //   hasil = a - b;
    //   System.out.println("Hasil = " + hasil);
    // } else if (operator == '*'){
    //   hasil = a * b;
    //   System.out.println("Hasil = " + hasil);
    // } else if (operator == '/'){
    //   if (b == 0){
    //     System.out.println("Hasilnya tak terhingga");
    //   } else {
    //     hasil = a / b;
    //     System.out.println("Hasil = " + hasil);
    //   }
    // } else {
    //   System.out.println("Operator tidak ditemukan");
    // }

    System.out.print("Nilai a = ");
    a = inputUser.nextFloat();
    System.out.print("Operator = ");
    o = inputUser.next();
    System.out.print("Nilai b = ");
    b = inputUser.nextFloat();

    System.out.println("Input User = " + a + " " + o + " " + b);

    switch (o) {
      case "+":
        hasil = a + b;
        System.out.println("Hasil = " + hasil);
        break;
      case "-":
        hasil = a - b;
        System.out.println("Hasil = " + hasil);
        break;
      case "*":
        hasil = a * b;
        System.out.println("Hasil = " + hasil);
        break;
      case "/":
        hasil = a / b;
        System.out.println("Hasil = " + hasil);
        break;
      default:
        System.out.println("Operator " + o + "tidak ditemukan");
        break;
    }
  }
}
