package Latihan;

public class LoopingBersarang {
  public static void main(String[] args) {
    
    for(int x = 0; x < 5; x++){

      for(int y = 0; y < 5; y++ ){

      System.out.print(" * ");

      }
      System.out.print("\n");
    }
    System.out.print("\n");
    /* HASIL
      * * * * *
      * * * * * 
      * * * * *
      * * * * * 
      * * * * *
    */

    for(int x = 0; x < 5; x++){

      for(int y = 0; y < 5; y++ ){

      System.out.print(" * ");
      if (x==y) {
        break;
      }
      }
      System.out.print("\n");
    }
    System.out.print("\n");

   /* HASIL
      * 
      * *  
      * * * 
      * * * * 
      * * * * *
    */

    for (int x = 0; x < 5; x++) {

      for (int y = 0; y < 5; y++) {

        System.out.print(" * ");
        if ((x+y) == 4) {
          break;
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /* HASIL
      * * * * *
      * * * *  
      * * * 
      * *  
      * 
    */

    for (int x = 0; x < 9; x++) {

      for (int y = 0; y < 9; y++) {

        System.out.print(" * ");
        if (x==y){
          break;
        }else if ((x + y) == 8) {
          break;
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /* HASIL
      * 
      * *  
      * * * 
      * * * * 
      * * * * *
      * * * * 
      * * * 
      * * 
      *     
    */

    System.out.println("====== TUGAS =======");

    /* Tugas
              *
            * * 
          * * *
        * * * * 
      * * * * * 

      * * * * *
        * * * * 
          * * *
            * * 
              *

              *
            * * 
          * * *
        * * * * 
      * * * * * 
        * * * * 
          * * *
            * * 
              *

          * 
        * * *  
      * * * * * 
    * * * * * * * 
  * * * * * * * * *
    * * * * * * * 
      * * * * * 
        * * * 
          * 
          
    */
    // for (int x = 0; x < 5; x++) {

    //   for (int y = 0; y < 5; y++) {
    //     if (x == y) {
    //       System.out.print(" * ");
    //     }else{
    //       break;
    //     }
    //   }
    //   System.out.print("\n");
    // }
    // System.out.print("\n");

  }
}
