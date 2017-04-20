package bad.examples;

import java.io.*;

public class Deck implements Serializable
{
    // instance variables
    private Card[][] myCards;
    private int m_numCards; // the number of card that are picked up to build the partial deck
    private String m_sortedDeck;

    // constructor
    public Deck()
    {
        myCards = new Card[4][13];

        // populate the card array
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
                myCards[i][j] = new Card(i, j);
    }

    // shuffle the deck
    public void shuffle(int numShuffles)
    {
        for (int i = 0; i < numShuffles; i++)
        {
            // generate random positions
            int suit1 = (int)(Math.random() * 4);
            int suit2 = (int)(Math.random() * 4);
            int rank1 = (int)(Math.random() * 13);
            int rank2 = (int)(Math.random() * 13);

            // swap the cards
            Card temp = myCards[suit1][rank1];
            myCards[suit1][rank1] = myCards[suit2][rank2];
            myCards[suit2][rank2] = temp;
        }
    }

    // return a particular card in the deck
    public Card getCard(int suit, int rank)
    {
        return myCards[suit][rank];
    }

    // return a specific number of cards as a card array
    public Card[] getPartialDeck(int numCards)
    {
        Card[] partialDeck = new Card[numCards];
        int counter = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
            {
                partialDeck[counter] = myCards[i][j];
                counter++;

                if (counter == numCards)
                    return partialDeck;
            }

        return partialDeck;
    }

    // return a string reprentation of the deck
    public String toString()
    {
        String deckContent = "";

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
                deckContent += myCards[i][j].toString() + " ";

            deckContent += "\n";
        }

        return deckContent;
    }

    // set the number of cards that would be picked up and the sorted deck string
    public void setVars(int numCards, String sortedDeck)
    {
        m_numCards = numCards;
        m_sortedDeck = sortedDeck;
    }

    // return the number of cards that would be picked up
    public int getnumCards()
    {
        return m_numCards;
    }

    // return the sorted deck string
    public String getSortedDeck()
    {
        return m_sortedDeck;
    }
}
