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

For example,

    Ace of Spades should display as A&#x2660;
    Two of Hearts should display as 2&#x2665;

Use the following Unicode character values to display the card suits:

    Spades   : u+2660
    Hearts   : u+2665
    Clubs    : u+2663
    Diamonds : u+2666

Also provide a way to display the fully spelled-out name of a card such as
`Ace of Spades` and `Two of Hearts`.

Provide a way to tell if a card is allowed to be placed on top of another per
the normal rules of Classic Solitaire, namely, a card can only be put on top
of another card if its suit is the opposite color from the other and its rank
is exactly one less than that of the other. That is, a `Jack of Hearts` can
only be placed on top of a `Queen of Spades` or a `Queen of Clubs`.

Demonstrate that your code does indeed implement the above requirements.

Goals
-----

**Candidate** - Finish as much of the required functionality as possible within
the time allotted.

**Evaluator** - Determine candidate's ability to analyze a problem, think
critically, elicit requirements, and design and develop a correct solution.
