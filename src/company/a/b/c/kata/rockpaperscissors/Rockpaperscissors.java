package company.a.b.c.kata.rockpaperscissors;

import java.util.HashMap;

//Let's play! You have to return which player won! In case of a draw return Draw!.
//
//Examples(Input1, Input2 --> Output):
//
//"scissors", "paper" --> "Player 1 won!"
//"scissors", "rock" --> "Player 2 won!"
//"paper", "paper" --> "Draw!"
public class Rockpaperscissors {

    public static void main(String[] args) {
        rps("paper", "rock");
    }

    public static String rps(String p1, String p2) {

        final String scissors = "scissors";
        final String paper = "paper";
        final String rock = "rock";
        final String player2 = "Player 2 won!";
        final String player1 = "Player 1 won!";

        if (scissors.equals(p1) && paper.equals(p2)) {
            return player1;
        }
        if (scissors.equals(p2) && paper.equals(p1)) {
            return player2;
        }
        if (rock.equals(p1) && paper.equals(p2)) {
            return player2;
        }

        if (rock.equals(p1) && paper.equals(p2)) {
            return player1;
        }

        if (rock.equals(p1) && scissors.equals(p2)) {
            return player1;
        }
        if (rock.equals(p2) && scissors.equals(p1)) {
            return player2;
        }
        if (paper.equals(p1) && rock.equals(p2)) {
            return player1;
        }
        if (paper.equals(p2) && paper.equals(p1)) {
            return "Draw!";
        }
        if (rock.equals(p2) && rock.equals(p1)) {
            return "Draw!";
        }
        if (scissors.equals(p2) && scissors.equals(p1)) {
            return "Draw!";
        }
        return null;
    }
}

//public class KataTest {
//
//    @Test
//    public void test1() {
//        System.out.println("Fixed Tests Player 1 won!");
//        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
//        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
//        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
//    }
//    @Test
//    public void test2() {
//        System.out.println("Fixed Tests Player 2 won!");
//        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
//        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
//        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
//    }
//    @Test
//    public void test3() {
//        System.out.println("Fixed Tests Draw!");
//        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
//        assertEquals("Draw!", Kata.rps("paper", "paper"));
//        assertEquals("Draw!", Kata.rps("rock", "rock"));
//    }
//
//}