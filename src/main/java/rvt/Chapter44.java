package rvt;

public class Chapter44 {

    //TESTING VIETA 
public static void main(String[] args) {
    

}
    //TESTING VIETA 

    
public static void ex1()
{
String zeta = new String( "The last rose of summer" );

//Answer:
// 1.  A new String object is created, containing the characters between quote marks.
// 2.  A reference to the object is saved in the variable zeta.
}

public static void ex2()
{
String stringA = "Random Jottings";
String stringB = "Lyrical Ballads";

if ( stringA.equals( stringB ) ) 
  System.out.println("They are equal.");
else
  System.out.println("They are different.");
//                                              ^  ^
// Yes, a String reference is often a parameter.|  |
}


public static void ex3()
{
    //DARBS AR NULL
 String a = "Random Jottings";
    String b = null;
    String c = "";

    if ( a != null ) 
      System.out.println( a );

    if ( b != null ) 
      System.out.println( b );

    if ( c != null ) 
      System.out.println( c );
}

public static void ex4()
{
String alpha =  new String("Red Rose");
String beta  = alpha;
alpha = null;

// 1. When was an object instantiated?       In the first statement.
//     2. What happens in the second statement?       The reference to the object is copied to beta.
//         3. What becomes of that object?                     It remains "alive," because there is still a reference to it.
}

public static void ex5()
{


//String name = first.concat( last ); 
// ----+----    --+-- --+--  --+--
//     |          |     |      |
//     |          |     |      |
//     |          |     |      +---- a String reference parameter
//     |          |     |
//     |          |     +----- the name of the method
//     |          |
//     |          +----- dot notation used to call an object's method.
//     |
//     +----- the method returns a reference to a new String object

}

public static void ex6()
{
String first = "Red " ;
String last  = "Rose" ;
String name  = first.concat( last );

//SAVIENO AR TO KAS IR IEKAVAS PIE concat
}

public static void ex7()
{
String first = "Red " ;
String last  = "Rose" ;
String name  = first + last ;
}
}
