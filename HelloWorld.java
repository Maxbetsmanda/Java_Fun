import java.util.ArrayList;
import java.util.Arrays;


public class HelloWorld{
  public static void main(String[] args){
    String msg= "new message";
    int [] array = {10,11,12,13,14,15,16,17,18,19};
    ArrayList<String> test = new ArrayList<String>();
    System.out.println("Hello World, Hello JAVA!!!");
    System.out.println(msg);
    for (int i=0; i < 10; i++){
      System.out.println(array[i]);
      test.add(array[i] + " : " + i);


    }
    System.out.println(Arrays.toString(array));
    System.out.println(test);

  }
}
