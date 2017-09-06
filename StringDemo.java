public class StringDemo{
  public static void main(String[] args){
    String ninja = "Coding Dojo is AWESOME!!! ";
    String string1 = "My name is ";
    String string2 = "Amanda B.";
    String string3 = ninja.concat(string1).concat(string2);
    int length = string3.length();
    System.out.println(string3);
    System.out.println("The String Length is :" + length);
  }
}


//String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
//System.out.println(ninja);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.



//String ninja = "Welcome to Coding Dojo!";
//int a = ninja.indexOf("Coding"); // a is 11
//int b = ninja.indexOf("co"); // b is 3
//int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
