Project: better-ticket-machine
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 2.

Purpose of project: To illustrate conditional statements.
How to start this project: Create one or more TicketMachine objects.

Q47: Tested insertMoney with varioud values, the balance can only change when theres a positive amount thats been inserted.
Q48: Using >=0 allows the balance to increase slightly with 0, needing the number to exceed the price of the ammount you put while adding the ticket.
Q49: ???
Q50:???
Q51: better-ticket-machine updates total and balance more safely compared to the naive version.
Q52: removing else completly, the program does not print an error message.
Q53: Balance can never be negative. Tickets can only be printed when theres enough money inserted.
Q54: Arihmetic operators include +, -, *, /, %.
Q55:
Q56:
Q57-58: Affordable method added; prints message depending on budget. When price is greater then budget, print says "Too expensive" but when the budget is greater than price it prints "Just right"
Q59-60: Original issue; balance = 0; return balance always returns 0.
        Wrong version: return balance; balance = 0 -> does not compile since the same name is reused.
refundBalance returns old balance and resets it to 0.

Q61 - Challenge excersize: The problem is that int price = cost; creates a new variable named price instead of assigning the value to the field. Because of this error, we cannot compile. The correct line should be: price = cost; so the field can properly initialize it.
