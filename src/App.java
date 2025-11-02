
public class App {
public static void main(String[] args) {
Deck deck = new Deck(); // create new deck
deck.shuffle(); // shuffle deck


Player player1 = new Player("Player 1"); // create Player 1
Player player2 = new Player("Player 2"); // create Player 2


// Deal all 52 cards to two players
for (int i = 0; i < 52; i++) { // loop 52 times
if (i % 2 == 0) { // if even index, give card to player 1
player1.draw(deck); // player 1 draws
} else { // if odd index, give card to player 2
player2.draw(deck); // player 2 draws
}
}


// Play 26 rounds (each player flips one card per round)
for (int round = 1; round <= 26; round++) { // loop 26 times
System.out.println("\nRound " + round + ":"); // print round header


Card card1 = player1.flip(); // player 1 flips card
Card card2 = player2.flip(); // player 2 flips card


card1.describe(); // show player 1's card
card2.describe(); // show player 2's card


if (card1.getValue() > card2.getValue()) { // check if player 1 wins
player1.incrementScore(); // give point to player 1
System.out.println(player1.getName() + " wins this round!"); // print winner
} else if (card2.getValue() > card1.getValue()) { // check if player 2 wins
player2.incrementScore(); // give point to player 2
System.out.println(player2.getName() + " wins this round!"); // print winner
} else { // tie case
System.out.println("It's a tie! No points awarded."); // tie message
}


System.out.println("Current Score -> " + player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore()); // show score
}


System.out.println("\n===== Final Scores ====="); // print game end header
System.out.println(player1.getName() + ": " + player1.getScore()); // show final score player 1
System.out.println(player2.getName() + ": " + player2.getScore()); // show final score player 2


// Determine and print final winner
if (player1.getScore() > player2.getScore()) { // check if player 1 won
System.out.println("Winner: " + player1.getName()); // print winner
} else if (player2.getScore() > player1.getScore()) { // check if player 2 won
System.out.println("Winner: " + player2.getName()); // print winner
} else { // if scores tied
System.out.println("It's a draw!"); // print draw
}
}
}