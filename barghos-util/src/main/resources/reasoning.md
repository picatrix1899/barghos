## Reason for - Tuple component naming as v0, v1 etc.

Tuples are the lowest level of data structures with related data (For example
vectors). They provide a common base to access the data. However the actual data
structures like vectors might have their own naming conventions (For example
three dimensional vectors have the components x, y and z while colors have the
components r, g, b). Because of this, a neutral naming convention has been
choosen to prevent conflicts and confusion (A color with the components x, y, z
does not make much sense).

## Reason for - Functions with tolerance have the same names as the exact functions

There is no different naming convention for functions with tolerance and exact
functions because it would be hard to describe every possible use case with a
single name (For example a possible name could be isNearlyZero, but that would
implicate the intention to check for zero taking into account floating point
error, but the tolerance can be much higher. At the same time a name like
isAproxZero doesn't give any hint on the operation).

## Reason for - No functions with tolerance using common tolerance available

There is no separate function with tolerance that uses a common tolerance
instead of a parameter. The reason is, that it does not make much sense to
specify a common tolerance as the tolerated margin around zero is situational
(For example, to compare two vectors after floating point error prone
calculations, it should be sufficient to use a very small tolerance to
counteract the FPE. However, to check for collision between two AABBs, a greater
tolerance is probably required).

## Reason for - Usage of "is", "has" prefix in functions

The prefix "is" or "has" is used in function names whether the function returns
a value that represents a detectable state that is not directly modifiable. For
example The Nullable class contains a getter and setter called "value". But it
also contains the function "hasValue", which determines whether the value is
set or not. It is a member on the class but does not directly represent a value
but a state the object is in.

## Reason for - Usage of "to", "from" prefix in functions

The prefix "to" or "from" is used in functions that perform a conversion. For
example a function "toArray" converts logically the current object into an array.
