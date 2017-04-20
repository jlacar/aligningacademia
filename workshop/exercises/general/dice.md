Exercise: Simulate N-sided die
==============================

Write a program that will simulate rolling an N-sided die.

Create two variants of die: one that is balanced and another that is loaded.

A _balanced die_ is one where the probability of it landing with a
particular face up is the same for all other faces.

A _loaded die_ is one where the probability of it landing with one particular
face up is significantly greater than the probability of it landing with any
other face up. Refer to the favored face as the _loaded face_.

All other faces are _non-loaded_ and have the same probability of showing as
other non-loaded faces.

The loaded face should have no less than 30% greater probability of showing up
than any non-loaded face but it should not exceed 60% greater probability of
showing up than any non-loaded face.

The input to the program will be `N`, the number of sides of the die to
create. The die created by the program should have a 50-50 chance of being
one of the two variants of die.

Provide a way to test whether a Die is loaded or balanced. DO NOT provide
any functionality that allows a Die to explicitly report whether it is
loaded or balanced. That is, you MAY NOT provide an `isLoaded()` or an
`isBalanced()` method or any similar means of querying the type of Die.

The testing part of your program can assume the 30%/60% greater probability
for the loaded face and it can rely on a `getSides()` method or similar
means to query a die for the number of faces it has.

The determination of `loaded` or `balanced` must be done through statistical
inference, that is, it will be based solely on empirical (observed) data
obtained by rolling the die.

Assumptions
-----------

You may assume that `N` is at least 3 and at most 9.

Sample run
----------

    Enter the number of sides: 4

    Creating 4-sided die...
    Please wait, testing die...

    This die appears to be balanced.

Sample run
----------

    Enter the number of sides: 7

    Creating 7-sided die...
    Please wait, testing die...

    This die appears to favor 2. It's probably loaded.
