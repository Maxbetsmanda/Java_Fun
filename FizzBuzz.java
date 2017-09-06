public class FizzBuzz{
  public String getfizzBuzz(int number){
    if ((number % 3 == 0) && (number % 5 == 0) == true){
      return "FizzBuzz";

    }else if((number % 3 == 0) == true){
        return "Fizz";

    }else if((number % 5 == 0) == true){
        return "Buzz";

    }else{
        return " " + number;
    }
  }
}
