public class Cards{
  private String suit;
  private String num;

  public Cards(String suit, String num){
    this.suit = suit;
    this.num = num;

  }
  public void showCard(){
    System.out.println(num + " of " + suit);
  }
}
