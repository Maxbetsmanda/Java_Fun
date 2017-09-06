import java.util.*;

public class StringManipulator{
  public String trimAndConcat(String string1, String string2){//Trim both input strings and then concatenate them. Return the new string.
    String isTC = (string1.trim()).concat(string2.trim());
    return isTC;
  }public Integer getIndexOrNull(String stringy, char letter){
    int a = stringy.indexOf(letter); //IndexOf: The indexOf() method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
    return a;
  }public Integer getIndexOrNull(String stringy1, String stringy2){//the second string is substring: for example "llo" is a substring of "Hello", so this method would return the index "llo" is at....conversely, "but" is not a substring of "Hello" so this would output NULL
    int b = stringy1.indexOf(stringy2);
    return b;
  }public String concatSubstring(String stringx, int z, int y, String stringj){
    String sub = (stringx.substring(z,y)).concat(stringj);
    //Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    return sub;
  }


}
