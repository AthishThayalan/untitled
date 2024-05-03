package org.example.Game;

import org.example.Users.HeartsComputerUser;
import org.example.Users.User;

public class HeartsGame extends Game {
    private int roundNumber = 0;

    public HeartsGame(User[] users) {
        super(users);
    }

    public void dealerDeals() {
        deckOfCards.shuffleDeck();
        for (int i = 0; i < 13; i++) {
            for (User user : users)
                user.addCard(deckOfCards.dealCard());
        }
    }


    public void trick() {

    }

    public void round() {

    }

    public void passCards() {

    }

    @Override
    public void resetGame() {

    }

    @Override
    public void play() {

    }

    @Override
    public boolean gameOngoing() {
        return false;
    }

    @Override
    public boolean gameWon() {
        return false;
    }

    @Override
    public boolean gameLost() {
        return false;
    }
}