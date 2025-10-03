## Reason for - Tuple component naming as v0, v1 etc.

Tuples are the lowest level of data structures with related data (For example
vectors). They provide a common base to access the data. However the actual data
structures like vectors might have their own naming conventions (For example
three dimensional vectors have the components x, y and z while colors have the
components r, g, b). Because of this, a neutral naming convention has been
choosen to prevent conflicts and confusion (A color with the components x, y, z
does not make much sense).

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

## Reason for - Usage of per component isZero instead of isZero on squared length in vectors

The reason for using a per component check against zero instead of first calculating
the squared length and checking that against zero is, that the available tolerance for
the squared length actually scales with dimensions. therefore a vec2 has more tolerance
per component that a vec4. by checking each component, the tolerance is always the same.
it also removes the need for transforming the tolerance to quadric space.

## Reason for - Tolerance functions

Certain functions have an overload with a tolerance parameter. The functions are suffixed with
"EM", standing either for "E minus" (1.e-x) the scientific exponential expression, or "Error Margin".
There is also always overloads for predefined tolerances "EM4", "EM6" and "EM8", which correspond
to the values "1.e-4", "1.e-6" and "1.e-8".