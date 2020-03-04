import java.util.Scanner;

public class Binary {
public static void main(String[]args) {

    // TODO Auto-generated method stub

    Scanner s = new Scanner( System.in );
    // The input that the user using it
    // So for adding a binary
    System.out.println( "Enter the first binary number: " );
    String a = s.nextLine();

    System.out.println( "Enter the second binary number: " );
    String b = s.next();
    // Here i am taking a, 2 because binary numbers contain only two
    // 1`s and 0`s, so i am taking "2";

  /*  The Integer.parseInt() java method is used primarily in parsing
  a String method argument into an Integer object.
   */

    int x = Integer.parseInt( a, 2 );
    int y = Integer.parseInt( b, 2 ) ;

   //z is the summation of int a + b;

    int z = x + y;


  System.out.println("Sum of Binary Number : " + Integer.toBinaryString(z));
//System.out.println( "Sum of binary Number: " );


}

}
