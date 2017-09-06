public class StringManipulatorTest{
  public static void main(String[] args){
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hellllllo     ","     Worlds    ");
    System.out.println(str); //

    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("WHAAAT", letter);
    Integer b = manipulator.getIndexOrNull("The Dojo", letter);
    Integer c = manipulator.getIndexOrNull("Hello", letter);
    System.out.println(a); //
    System.out.println(b); //
    System.out.println(c); //


    String word = manipulator.concatSubstring("nANA's", 4, 5, "egg");
    System.out.println(word); //
  }




}
