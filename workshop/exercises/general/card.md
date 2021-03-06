Exercise: Simulate playing cards
================================

Specifications
--------------

Write code that will allow you to simulate a game of Classic Solitaire.

A _card_ will have a _suit_ (Spades, Hearts, Clubs, Diamonds) and a _rank_
(Ace, Two, Three, ..., Jack, Queen, King) - the natural ordering of cards
follows how they have just been listed here.

Create a standard _deck_ of 52 cards. When first created, the cards in a deck
should be sorted in their natural order as defined above.

Provide a way to shuffle the cards in a deck.

Provide a way to display the cards in a deck.

When displaying a card "face up", the output should be the card's rank and suit.

For example, an Ace of Spades card should display as A&#x2660; and a Two of
Hearts card should display as 2&#x2665; when they are "face up". When displayed
as being "face down," a card should be shown as &#x2592;&#x2592; (two characters).
The rank of Ten should just be displayed with a **T**, as in T&#x2666; for the Ten of Diamonds.

Use the following Unicode character values to display the card suits and "back":

    Spades   : u+2660
    Hearts   : u+2665
    Clubs    : u+2663
    Diamonds : u+2666
    Back     : u+2592

Also provide a way to display the fully spelled-out name of a card such as
`Ace of Spades` and `Two of Hearts`.

Provide a way to tell if a card is allowed to be placed on top of another per
the normal rules of Classic Solitaire, namely, a card can only be put on top
of another card if its suit is the opposite color from the other and its rank
is exactly one less than that of the other. That is, a `Jack of Hearts` can
only be placed on top of a `Queen of Spades` or a `Queen of Clubs`.

Lastly, display the initial deal of Solitaire with 7 columns of cards, the
first column with one card, the second with two cards, etc., per the above
specifications for displaying cards.

Demonstrate that your code implements all of the above requirements.

Goals
-----

**Candidate** - Finish as much of the required functionality as possible within
the time allotted.

**Evaluator** - Determine candidate's ability to analyze a problem, think
critically, elicit requirements, and design and develop a correct solution.
