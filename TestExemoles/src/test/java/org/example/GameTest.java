package org.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void testPlayerOneWin() {
        Dice dice =  new Dice() {
            int counter;
            @Override
            public int roll() {
                if (counter==0){
                    counter++;
                    return 6;
                }
                return 5;
            }
        };
        GameWinnerPrinter gameWinnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {

                Assert.assertEquals("Вася",winner.getName());
            }
        };
        Game game = new Game(dice,gameWinnerPrinter);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        game.playGame(player1,player2);
    }
    @Test
    public void testPlayerTwoWin() {
        Dice dice2 =  new Dice() {
            int counter;
            @Override
            public int roll() {
                counter++;
                if (counter==1){
                    return 5;
                }
                return 6;
            }
        };
        GameWinnerPrinter gameWinnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                Assert.assertEquals("Игорь",winner.getName());
            }
        };
        Game game = new Game(dice2,gameWinnerPrinter);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        game.playGame(player1,player2);
    }
    @Test
    public void testPlayerOtherWin() {
        Dice dice =  new Dice() {
            @Override
            public int roll() {
                return 5;
            }
        };
        GameWinnerPrinter gameWinnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                Assert.assertEquals("Ничья",winner.getName());
            }
        };
        Game game = new Game(dice,gameWinnerPrinter);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        game.playGame(player1,player2);
    }

}