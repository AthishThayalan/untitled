package org.example.Deck;

public class Card {
    private Suits suit;
    private FaceValue face;
    private int value;

    public Card(Suits suit,FaceValue face){
        this.suit = suit;
        this.face = face;
        value = getValueFromFaceSymbol(face.getFaceSymbol());
    }

    public Suits getSuit() {
        return suit;
    }

    public String getSuitSymbol (){
        return suit.getSuitSymbol();
    }

    public String getFaceSymbol() {
        return face.getFaceSymbol();
    }

    public FaceValue getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValueFromFaceSymbol(String symbol){
        if(Character.isDigit(symbol.charAt(0))){
            return Integer.parseInt(symbol);
        } else {
            switch(symbol){
                case"J":
                    return 11;
                case"Q":
                    return 12;
                case"K":
                    return 13;
                case"A":
                    return 14;
                default:
                    return -1;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        // ASCII representations for each card
        builder.append("┌─────────┐\n");
        builder.append(String.format("│ %-8s│\n", getFaceSymbol()));
        builder.append("│         │\n");
        builder.append("│         │\n");
        builder.append(String.format("│    %s    │\n", getSuitSymbol()));
        builder.append("│         │\n");
        builder.append("│         │\n");
        builder.append(String.format("│%-8s │\n", getFaceSymbol()));
        builder.append("└─────────┘\n");
        return builder.toString();
    }

    public boolean equals(Card card) {
        return face==card.face && suit==card.suit;
    }
}
