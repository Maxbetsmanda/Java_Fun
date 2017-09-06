import java.util.*;

public class Deck{
  private ArrayList<Cards> deck = new ArrayList<Cards>();
  private ArrayList<Cards> shuffled = new ArrayList<Cards>(deck);


  public void createDeck(){
      String[] d = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
      String[] s = {"Black Spades", " Red Diamonds","Black Clubs", "Red Hearts"};
      for (int i = 0; i < 13 ; i++){
        for (int j = 0; j < 4; j++){
          Cards card = new Cards(s[j], d[i]);
          deck.add(card);

        }
      }
    }

  public void showDeck(){
    for (int i = 0; i < 52; i++){
      deck.get(i).showCard();
    }
  }
  public void shuffleDeck(){
    Collections.shuffle(deck);
  }
  }
