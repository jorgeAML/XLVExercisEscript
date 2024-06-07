## Chapter 5 loops
ok guys I hope to end this chapter in one week! so wish me luck
### 5.1 Count positive and negative numbers and compute the average of numbers
Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and the average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number. Here is a sample run:

>Enter an integer, the input ends if it is 0: 1 2 -1 3 0
>
>The number of positives is: 3
>
>The number of negatoves is: 1
>
>The total is: 5.0
>
>The average is 1.25

>Enter an integer, the input ends if it is 0: 0
>
>No numbers are entered expected 0

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/CountPositiveAndNegativeNumbers.java)

---
### 5.2 Repeat additions
Listing 5.4 SubstractionQuizLoop.java generate five random substraction questions. Revise the program to generate ten random addition question for two integers between 1 and 15. Display the correct count and test time.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/RepeatAdditions.java)

---
### 5.3 Conversion from kilograms to pounds
Write a program that displays the following table (note that 1 kilogram is 2.2 pounds).

>Kilograms | Pounds
> 1 | 2.2
> 3 | 6.6
> ...
> 197 | 433.4
> 199 | 437.8

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/ConversionFromKilogramsToPounds.java)

---
### 5.4 Conversion from miles to kilometers
Write a program that displays the following table (note: 1 mile is 1.609 kilometers).

| Miles | Kilometers |
| ----- | ---------- |
| 1     | 1.609      |
| 2     | 3.218      |
| ...   | ...        |
| 9     | 14.481     |
| 10    | 16.090     |

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/ConversionMilesToKilometers.java)

---
### 5.5 Conversion from kilograms to pounds and pounds to kilograms
Write a program that displays the following two tables side by side:

| Kilograms | Pounds | Pounds | Kilograms |
| --------- | ------ | ------ | --------- |
| 1         | 2.2    | 20     | 9.09      |
| 2         | 6.6    | 25     | 11.36     |
| ...       | ...    | ...    | ...       |
| 197       | 433.4  | 510    | 231.82    |
| 199       | 437.8  | 515    | 234.09    |

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/ConversionKilogramsToPoundsAndPoundsToKilogram.java)

---
### 5.6 Conversion from miles to kilometers
Write a program that displays the following two tables side by side.

| Miles | Kilometers | Kilometers | Miles |
| ----- | ---------- | ---------- | ----- |
| 1     | 1.609      | 20         | 12.43 |
| 2     | 3.218      | 25         | 15.53 |
| ...   | ...        | ...        | ...   |
| 9     | 14.481     | 60         | 37.29 |
| 10    | 16.090     | 65         | 40.39 |

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/MilesToKilometers2.java)

---
### 5.7 Financial application: Compute future tuition
Suppose that the tuition for a university is $10,000 this year and increase 5% every year. In one year the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years worth of tuition after the tenth year.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/ComputeFutureTuition.java)

---
### 5.8 Find the highest score
Write a program that prompts the user to enter the number of students and each student's name and score, and finally displays the name of the student with the highest score.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindHighestScore.java)

---
### 5.9 Find the two highest scores
Write a program that prompts the user to enter the number of students and each student's name and score and finally displays the student with the highest score and the student with the second-highest score.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindTheTwoHighestScore.java)

---
### 5.10 Find numbers divisible by 5 and 6
Write a program that displays all the numbers from 100 to 1000, ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one space.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindNumbersDivisibleBy5And6.java)

---
### 5.11 Find numbers divisible by 5 or 6, but not both
Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. Numbers are separated by exactly one space.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindNumbersDivisibleBy5Or6ButNotBoth.java)

---
### 5.12 Find the smallest n 
Use a while loop to find the smallest integer n such that n^2 is greather than 12,000.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindTheSmallestN.java)

---
### 5.13 Find the largest n such that n^3 < 12000
Use a while loop to find the largest integer n such that n^3 is less than 12,000.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindLargestN.java)

---
### 5.14 Compute the greatest common divisor
Another solution for Listing 5.9 to find the greatest commond divisor of two integers n1 and n2 is as follows: First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ... , 2, or 1 is a divisor for both n1 and n2 in this order. The first such common divisor is the greatest common divisor for n1 and n2. Write a program that prompts the user to enter two positive integers and displays the gcd.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/ComputeGreatestCommonDivisor.java)

---
### 5.15 Display the ASCII Character table
Write a program that prints the characters in the ASCII character table from ! to ~. Display ten characters per line. The ASCII table is shown in Appendix B. Characters are separated by exactly one space.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/DisplayASCIICharacterTable.java)

---
### 5.16 Find the factors of an integer
Write a program that reads an integer and displays all its smallest factors in increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/FindTheFactorsOfAnInteger.java)

---
### 5.17 Display pyramid
Write a program that prompts the user to enter an integer from 1 to 15 and displays as pyramid, as shown in the following sample run:

> Enter the number of lines: 7
>             1

>           2 1 2

>         3 2 1 2 3

>       4 3 2 1 2 3 4

>     5 4 3 2 1 2 3 4 5

>   6 5 4 3 2 1 2 3 4 5 6

> 7 6 5 4 3 2 1 2 3 4 5 6 7

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter5_Loops/DisplayPiramid.java)

---

