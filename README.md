# WAR Card Game - Java Project

This project is a simple, automated version of the classic card game **WAR**, created using Java. It demonstrates Object-Oriented Programming concepts including **classes**, **objects**, **methods**, **constructors**, and **lists**.

## 🎯 Game Overview

Two players are dealt a standard 52-card deck (26 cards each). Each turn, both players flip the top card in their hand:

* The player with the higher card value earns **1 point**.
* If both cards have the same value, **no points** are awarded.
* After all cards are played, the player with the higher score wins.

## 📂 Project Structure

```
src
 ├── Card.java
 ├── Deck.java
 ├── Player.java
 └── App.java (main program)
```

### Class Responsibilities

| Class      | Responsibility                                  |
| ---------- | ----------------------------------------------- |
| **Card**   | Holds value and name of a card and describes it |
| **Deck**   | Builds deck, shuffles, and deals cards          |
| **Player** | Holds player's hand, score, and actions         |
| **App**    | Runs the game logic                             |

## ▶️ How to Run the Game

### ✅ Requirements

* Java 8 or higher
* Eclipse IDE (or any Java IDE)

### 📥 Steps to Run in Eclipse

1. Open Eclipse
2. Create a **new Java project**
3. Inside `src`, create the following files:

   * `Card.java`
   * `Deck.java`
   * `Player.java`
   * `App.java`
4. Copy the code from this repository (or assignment) into each file
5. Right‑click `App.java` > **Run As > Java Application**

You should now see the game play out in the console with each round printed.

## 📝 Example Output

```
Round 1:
King of Hearts (Value: 13)
Five of Clubs (Value: 5)
Player 1 wins this round!
Current Score -> Player 1: 1 | Player 2: 0
...
Winner: Player 2
```

## 💡 Tips

* Comment your code for readability (already provided!)
* Follow Java naming conventions (CamelCase for classes & methods)
* Use `System.out.println()` for debugging if something isn't right

## 🚀 Future Enhancements (Optional)

* Implement true WAR rules (war rounds on tie)
* Add graphical interface
* Track and print card counts
* Add player input / interactive mode

Enjoy learning Java and object‑oriented programming with this fun card game project! 🎮🃏
