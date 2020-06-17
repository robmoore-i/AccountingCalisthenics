# Accounting Kata

I found the outline for this here: 
https://github.com/bibryam/crafting-OO-code-kata. I then wrote up the
requirements more explicitly based on the solution, and added some IO, to make
it better suited as a training exercise.

Note: The default branch on this repository is 'main', not 'master'.

## What to do

Create a simple accounting application that has:

* Create Account
* Deposit, Withdrawal
* Print Account Statements

## Caveats

On its own, this exercise is pretty simple and easy. However, to put you into
the metaphorical gravity-chamber, you're advised to try to complete this
exercise under the constraints of Object Calisthenics!

- Use only one level of indentation per method.
- Don’t use the else keyword.
- Wrap all primitives and strings in your own domain-specific types.
- Use only one dot per line.
- Don’t abbreviate.
- Keep all entities small.
- Don’t use any classes with more than two instance-variables.
- Use first-class collections (i.e no primitive arrays/varargs).
- Don’t use any getters/setters/properties (i.e. private fields only, and no direct accessors for them).

Reference: www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf

## Examples

Please note, these examples are not exhaustive! You'll have to come up with
your own as well.

#### Example 1

Input:

```
Open Account $
Print Statement
```

Output:

```
---------------Statement--------------------
---------------Transactions-----------------
---------------Total Balance----------------
Amount: $0
```

#### Example 2

Input:

```
Open Account £
Deposit 10
Deposit 5
Withdraw 7
Print Statement
```

Output:

```
---------------Statement--------------------
---------------Transactions-----------------
Deposit transaction:     2020/06/17 : Amount: 10
Deposit transaction:     2020/06/17 : Amount: 5
Withdrawal transaction:  2020/06/17 : Amount: 7
---------------Total Balance----------------
Amount: £8
```

#### Example 3

Input:

```
Open Account ¥
Withdraw 5000
Print Statement
```

Output:

```
---------------Statement--------------------
---------------Transactions-----------------
Withdrawal transaction:  2020/06/17 : Amount: 5000 (failed)
---------------Total Balance----------------
Amount: ¥0
```