Type Casting ist wenn man einen Typ von Variable in einen anderen Typ ändert. Zum Beispiel von Int zu double. Das passiert automatisch.

# Implicit Casting
Von einem VarTyp der kleiner ist als der in den gecastet wird, ist alles gut und passiert automatisch.  
z. B. von int zu double sit alles gut, weil int (9) zu double (9.000000...) verliert man nichts. oder wie von char ('L') zu string ("L")
# Explicit Casting
Wenn man ein Typ zu einem kleineren Typ ändern will muss man manuell noch hinzuschreiben zu welchem Typ es wird.

```c#
double myDouble = 9.78;
int myInt = (int) myDouble;    // manuell casting: double zu int

Console.WriteLine(myDouble);   // Output 9.78
Console.WriteLine(myInt);      // Output 9
```
# Casting Functions
Es gibt noch FUnktionen von C# mit denen man auch noch manuellen Casting machen kann.
```c#
Console.WriteLine(Convert.ToString(myInt));    // convert int to string
Console.WriteLine(Convert.ToDouble(myInt));    // convert int to double
Console.WriteLine(Convert.ToInt32(myDouble));  // convert double to int
Console.WriteLine(Convert.ToString(myBool));   // convert bool to string
```

