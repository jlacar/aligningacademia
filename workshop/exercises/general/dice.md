Exercise: Simulate N-sided die
==============================

Specifications
--------------

Write a program that will simulate rolling an N-sided die.

Create two variants of die: one that is balanced and another that is loaded.

A _balanced die_ is one where the probability of it landing with a
particular face up is the same for all other faces.

A _loaded die_ is one where the probability of it landing with one particular
face up is significantly greater than the probability of any other face landing
up. Refer to the favored face as the _loaded face_. Refer to all other faces
as _non-loaded_. Non-loaded faces will all have the same probability of landing up.

The _loaded face_ should have no less than 20% greater probability of landing
up than any non-loaded face but it should not exceed 40% greater probability
than any non-loaded face of landing up.

The input to the program will be `N`, the number of sides of the die to
create. The die created by the program should have a 50-50 chance of being
one of the two variants of die.

Provide a way to test whether a die is loaded or balanced. DO NOT provide
any functionality that allows a die to explicitly report whether it is
loaded or balanced. That is, you MAY NOT provide an `isLoaded()` or an
`isBalanced()` method or any similar means of querying the type of die.

Your program must determine whether a die is `balanced` or `loaded` by
statistical inference. That is, it should be based solely on empirical
(observed) data obtained by rolling the die.

Goals
-----

**Candidate** - Finish as much of the required functionality as possible within
the time allotted.

**Evaluator** - Determine candidate's ability to analyze a problem, think
critically, elicit requirements, and design and develop a correct solution.

Assumptions
-----------

You may assume that the input `N` is at least 3 and at most 9.

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
