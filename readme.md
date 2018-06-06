# Katas

The Katas are from http://ccd-school.de/

## Übungen
 * [FizzBuzz](http://ccd-school.de/coding-dojo/function-katas/fizzbuzz/)
 * [From Roman Numerals](http://ccd-school.de/coding-dojo/function-katas/from-roman-numerals/)
 * [Fröhliche Zahlen](http://ccd-school.de/coding-dojo/function-katas/froehliche-zahlen/)
 
### FizzBuzz

http://ccd-school.de/coding-dojo/function-katas/fizzbuzz/

Schreibe eine Funktion, die die Zahlen von 1 bis 100 zurückgibt. Manche Zahlen sollen dabei allerdings übersetzt werden [1]:

Für Vielfache von 3 gibt „Fizz“ aus.
Für Vielfache von 5 gib „Buzz“ aus.Für Vielfache von 3 und 5 gib „FizzBuzz“ aus.
Beispiel:

```
1
2
Fizz
4
Buzz
Fizz
7
...
14
FizzBuz
16
...
1
2
3
4
5
6
7
8
9
10
11
12
1
2
Fizz
4
Buzz
Fizz
7
...
14
FizzBuz
16
...
```
Variation
„Fizz“ soll auch zurückgegeben werden, wenn die Zahl eine 3 als Ziffer enthält, z.B. 13. „Buzz“ soll auch zurückgegeben werden, wenn die Zahl eine 5 als Ziffer enthält, z.B. 52.

### From Roman Numerals

Schreibe eine Funktion, die Römische Zahlen in Dezimalzahlen übersetzt.

Beispiele:
```
„I“ -> 1
„II“ -> 2
„IV“ -> 4
„V“ -> 5
„IX“ -> 9
„XLII“ -> 42
„XCIX“ -> 99
„MMXIII“ -> 2013
```

Die Römischen Zahlen bewegen sich im Bereich von „I“ bis „MMM“.

Nimm an, dass die Römischen Zahlen korrekt sind.

Variation
Erkenne syntaktische (z.B. „I X“) und semantische (z.B. „IC“) Fehler in Römischen Zahlen.

#Fröhliche Zahlen (Happy Numbers)
Entwickle eine Funktion, die erkennt, ob eine Zahl „fröhlich“ ist oder nicht.

Eine Fröhliche Zahl ist eine Zahl, bei der die Summe der Quadrate ihrer Ziffern „auf die Dauer“ 1 ergibt. Beispiel:

```
19 -> 1^2 + 9^2 = 82 -> 8^2 + 2^2 = 68 -> 6^2 + 8^2 = 100 -> 1^2 + 0^2 + 0^2 = 1
```
Variation #1
Ermittle alle Fröhlichen Zahlen in einem Zahlenbereich, z.B. von 10 bis 20.