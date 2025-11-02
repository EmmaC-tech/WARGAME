import java.util.ArrayList; // needed for ArrayList
import java.util.List; // needed for List


public class Player {
private List<Card> hand; // list to store player's cards
private int score; // player's score
private String name; // player's name


// Constructor initializes hand and score and sets player name
public Player(String name) {
this.hand = new ArrayList<>(); // create list for player's cards
this.score = 0; // start score at zero
this.name = name; // assign player name
}


// Describe method prints player details and their cards
public void describe() {
System.out.println("Player: " + name + " | Score: " + score); // show player info
for (Card card : hand) { // loop through player's cards
card.describe(); // call card's describe method
}
}


// Flip method returns top card from hand
public Card flip() {
return hand.remove(0); // remove and return first card in hand
}


// Draw method adds card to player's hand from deck
public void draw(Deck deck) {
hand.add(deck.draw()); // take card from deck and add to hand
}


// Add one point to score
public void incrementScore() {
score++; // increase score by 1
}


// Getter for score
public int getScore() {
return score; // return current score
}


// Getter for player name
public String getName() {
return name; // return player's name
}
}