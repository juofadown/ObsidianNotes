# Variables
In C# there are different types of variables.

- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `double` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `string` - stores text, such as "Hello World". String values are surrounded by double quotes
- `bool` - stores values with two states: true or false

```C#
type variableName = value;
```

```c#
int myNum = 5;
double myDoubleNum = 5.99;
char myLetter = 'D';
bool myBool = true;
string myText = "Hello";
```

# Constants
Mit const kann man Konstanten erstellen. Wenn man eine Konstante versucht zu überschreiben gibt es einen Fehler.

```c#
const int myNum = 15;
myNum = 20; // error
```

# Display Variables
Zeigt die verschiedenen Möglichkeiten wie man Variablen anzeigen kann mit (x + y) oder 
("string" + int)

# Multiple Variables
Man kann Variablen vom gleichen Typ auf einer Zeile definieren.
```c#
int x = 5, y = 6, z = 50;
Console.WriteLine(x + y + z);
```

Man kann auch alle auf einer Linie einen Wert geben:
```C#
int x, y, z;
x = y = z = 50;
Console.WriteLine(x + y + z);
```

# Identifiers
The names of the Variables are called Identifiers and they need to be unique.
- Sie können Buchstaben, Zahlen und Unterstriche enthalten.
- Sie können nicht mit einer Zahl beginnen
- Müssen mit Unterstrich oder Buchstabe beginnen
- Sie können keine Leertaste (whitespace) enthalten
- Es ist Case Sensitiv. MyVar und myvar sind zwei verschiedene Variabeln
- Schlüsselwörter wie int, bool können nicht als Namen genutzt werden.





