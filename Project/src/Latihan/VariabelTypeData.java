package Latihan;

public class VariabelTypeData {
  public static void main(String[] args) {
    int x = 10;
    System.out.println("nilai x = " + x);

    x = 20;
    System.out.println("nilai baru X = " + x);
    /*
     Deklarasi : 
     int a,x,y;
      
     assignment : 
     a = 10; 
     x = 2;
     y = 7;


     #Typedata Primitif (Ukurannya FIX)#
    Integer, byte, short, long, double, float, char, boolean
    */

    // Integer (satuan)
    int i = 10;
    System.out.println("======Integer======");
    System.out.println("Nilai integer  = " + i );
    System.out.println("Nilai Max = " + Integer.MAX_VALUE);
    System.out.println("Nilai Min = " + Integer.MIN_VALUE);
    System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
    System.out.println("Besar Integer = " + Integer.SIZE + " bit");

    // byte (satuan)
    byte b = 10;
    System.out.println("======Byte======");
    System.out.println("Nilai Byte  = " + b );
    System.out.println("Nilai Max = " + Byte.MAX_VALUE);
    System.out.println("Nilai Min = " + Byte.MIN_VALUE);
    System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
    System.out.println("Besar Byte = " + Byte.SIZE + " bit");

    //Short (satuan)
    short s = 10;
    System.out.println("======Short======");
    System.out.println("Nilai Short  = " + s);
    System.out.println("Nilai Max = " + Short.MAX_VALUE);
    System.out.println("Nilai Min = " + Short.MIN_VALUE);
    System.out.println("Besar Short = " + Short.BYTES + " bytes");
    System.out.println("Besar Short = " + Short.SIZE + " bit");

    // Long (satuan)
    Long l = 10L;
    System.out.println("======Long======");
    System.out.println("Nilai Long  = " + l);
    System.out.println("Nilai Max = " + Long.MAX_VALUE);
    System.out.println("Nilai Min = " + Long.MIN_VALUE);
    System.out.println("Besar Long = " + Long.BYTES + " bytes");
    System.out.println("Besar Long = " + Long.SIZE + " bit");

    // Double (Koma, Bilangan Real)
    Double d = 10.5d;
    System.out.println("======Double======");
    System.out.println("Nilai Double  = " + d);
    System.out.println("Nilai Max = " + Double.MAX_VALUE);
    System.out.println("Nilai Min = " + Double.MIN_VALUE);
    System.out.println("Besar Double = " + Double.BYTES + " bytes");
    System.out.println("Besar Double = " + Double.SIZE + " bit");

    // Float (Koma, Bilangan Real)
    Float f = 10f;
    System.out.println("======Float======");
    System.out.println("Nilai Float  = " + f);
    System.out.println("Nilai Max = " + Float.MAX_VALUE);
    System.out.println("Nilai Min = " + Float.MIN_VALUE);
    System.out.println("Besar Float = " + Float.BYTES + " bytes");
    System.out.println("Besar Float = " + Float.SIZE + " bit");

    // Char (Koma, Bilangan Real) berdasarkan ASCII
    char c = 'c';
    System.out.println("======Char======");
    System.out.println("Nilai Char  = " + c);
    System.out.println("Nilai Max = " + Character.MAX_VALUE);
    System.out.println("Nilai Min = " + Character.MIN_VALUE);
    System.out.println("Besar Char = " + Character.BYTES + " bytes");
    System.out.println("Besar Char = " + Character.SIZE + " bit");

    // Boolean (Nilai True | False)
    Boolean bo = true;
    System.out.println("======Boolean======");
    System.out.println("Nilai Boolean = " + bo);
    System.out.println("Nilai True = " + Boolean.TRUE);
    System.out.println("Nilai False = " + Boolean.FALSE);

  }
}
