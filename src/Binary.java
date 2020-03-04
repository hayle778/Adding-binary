import java.util.Scanner;

public class Binary {
public static void main(String[]args) {

    // TODO Auto-generated method stub

    Scanner s = new Scanner( System.in );
    // The input that the user using it
    // So for adding a binary
    System.out.println( "Enter the first binary number: " );

    //String a is intializing it, mean we are introduce for the computer that we gonna use what kind of the data type
    //we are going to use it. Declaring it is intriducing the computer that where the data type start from and end up with
    //that has a new value set by the user.

    String a = s.nextLine();

    System.out.println( "Enter the second binary number: " );
    String b = s.next();


    System.out.println( "Enter the third binary number: " );
    String c = s.next();


    // Here i am taking a, 2 because binary numbers contain only two
    // 1`s and 0`s, so i am taking "2";

  /*  The Integer.parseInt() java method is used primarily in parsing
  a String method argument into an Integer object.
   */

    int x = Integer.parseInt( a, 2 );
    int y = Integer.parseInt( b, 2 ) ;
    int z = Integer.parseInt( c, 2 );
   //z is the summation of int a + b;

    int f = x + y + z ;


  System.out.println("Sum of Binary Number : " + Integer.toBinaryString(f));
//System.out.println( "Sum of binary Number: " );


}

}
