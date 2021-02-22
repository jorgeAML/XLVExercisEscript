## Chapter 4 - Mathematical FUnctions, Characters and Strings
### 4.1 Geometry: Area of a pentagon
Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon. The formula for computing the area of a pentagon is:

> Area = 5 * S*^2 / 4 * tan(PI/5)

Where *s* is the lenght of a side. The side can be computed using the formula:

> s = 2r sin PI/5

Where *r* is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point. Here is a sample run:

>Enter the length from the center to a vertex: 5.5
> The area of the pentagon is 71.92

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/AreaOfAPentagon.java)

---
### 4.2 Geometry: Great circle distance
The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:

>d = radius * arcos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

Write a program that prompts the user to enter the latitude and longitude of two points on theearth in degrees and displays its great circle distance. The average earth radius is 6,371.01 km. Note that you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees. Here is a sample run:

>Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
>Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
>The distance between the two points is 10691.79183231593 km

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/GreatCircleDistance.java)

---
### 4.3 Geography: estimate areas
Find the GPS locations or Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from [gps data team](www.gps-data-team.com/map/) and compute the estimated area enclosed by these four cities. (Hint: Use the formula in Programming exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute area of a triangle).

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/EstimateAreas.java)

---
### 4.4 Geometry: Area of a hexagon
The area of a hexagon can be computed using the following formula (**S** is the length of a side):

>Area = 6 * s^2 / 4 * tan(PI/6).

Write a program that prompts the user to enter the side of a hexagon and displays its area. Here is a sample run:

>Enter the side 5.5
>The area of the hexagon is 78.59

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/AreaOfAHexagon.java)

---
### 4.5 Geometry: area of a regular polygon
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is:

>Area = n * s^2 / 4 * tan(PI/n).

Here **s** is the lenght of a side. Write a program that prompts the user to enter the number of sides and their lenght of a regular polygon and displays its area. Here a sample run:

>Enter the number of sides: 5
>Enter the side: 6.5
>The area of the polygon is 74.6901

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/AreaOfARegularPolygon.java)

---
### 4.6 Random points on a circle
Write a program that generates three random points on a circle centered at (0,0) with radius 40 and display three angles in a triangle formed by these points, as shown in figure 4.7a. (Hint: Generate a random angle (alpha) in radians between 0 and 2PI, as shown in Figure 4.7b. and the point determined by this angle is (r*cos(alpha),r*sin(alpha))).

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/RandomPointOnACircle.java)

---
### 4.7 Corner point coordinates
Suppose a pentagon is centered at (0,0) with one point at the 0 o'clock position, as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon. Here is a sample run:

>Enter the radius of the bounding circle: 100
>The coordinates of five points on the pentagon are:
> (95.1057, 30.9017)
> (0.000132679, 100)
> (-95.1056, 30.9019)
> (-58.7788, -80.9015)
> (58.7782, -80.902)

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/CornerPointCoordinates.java)

---
### 4.8 Find the character of an ASCII code
Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character. Here is a sample run:

>Enter an ASCII code: 69
>The character for ASCII code is 69 is E

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/AsciiCode.java)

---
### 4.9 Find the Unicode of a character
Write a program that receives a character and displays its Unicode. Here is a sample run:

>Enter a character: E
>The Unicode for the character E is 69

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/UnicodeCharacter.java)

---
### 4.10 Guess Birthday
Rewrite listing 4.3, GuessBirthday.java, to prompt the user to enter the character Y for yes and N for No rather than entering 1 for Yes and 0 for No.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/GuessBirthday.java)

---
### 4.11 Decimal to Hex
Write a program that prompts the user to enter an integer between 0 and 15, and displays its corresponding hex number. Here are some sample runs:

>Enter a decimal value (0 to 15): 11
>The hex values is B.

>Enter a decimal value (0 to 15): 5
>The hex value is 5.

>Enter a decimal value (0 to 15): 31
>31 is an invalid input

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/DecimalToHex.java)

---
### 4.12 Hex to Binary
Write a program that prompts the user to enter a hex digit and displays its corresponding binary number. Here is a sample run:

>Enter a hex digit: B
>
>The binary value is 1011.

>Enter a hex digit: C
>
>G is an invalid input

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/HexToBinary.java)

---
### 4.13 Vowel or consonant
Write a program that prompts the user to enter a letterand check whether the letter is a vowel or consonant. Here is a sample run:

>Enter a letter: B
>
>B is a consonant.

>Enter a letter grade: a
>
>a is a vowel.

>Enter a letter grade: #
>
>invalid input.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/VowelOrConsonant.java)

---
### 4.14 Convert letter grade to number
Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0. Here is a sample run:

>Enter a letter grade: B
>
>The numeric value for grade B is 3.

>Enter a letter grade: T
>
>T is an invalid grade.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/ConvertLetterGradeToNumber.java)

---
### 4.15 Phone key pads
The international standard letter/number mapping found on the telephone is shown below here: [Phone key pad](https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/1920px-Telephone-keypad2.svg.png)
Write a program that prompts the user to enter a letter and displays its corresponding number.

>Enter a letter: A
>
>The corresponding number is 2.

>Enter a letter: a
>
>The corresponding number is 2.

>Enter a letter: +
>
>'+' is an invalid input

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/PhoneKeyPads.java)

---
### 4.16 Random Character
Write a program that displays a random uppercase letter using the Math.random() method.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/RandomCharacter.java)

---
### 4.17 Days of a month
Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month. Here is a sample run:

>Enter a year: 2001
>
>Enter a month: Jan
>
>Jan 2001 has 31 days

>Enter a year: 2016
>
>Enter a month: Feb
>
>Jan 2016 has 29 days

---
### 4.18 Student major and status
Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following characters are used to denote the majors:

1. M: Mathematics
2. C: Computer Science
3. I: Information Technology

Here is a sample run:

>Enter two characters: M1
>   Mathematics Freshman

>Enter two characters: C3
>   Computer Science Junior

>Enter two characters: T3
>   Invalid Input

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/StudentMajorAndStatusVersion2.java)

---
### 4.19 Bussiness check ISBN-10
Rewrite the programming exercise 3.9 by entering the ISBN number as a string.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/ISBNLikeString.java)

---
### 4.20 Process a string
Write a program that prompts the user to enter a string and displays its length and its first character.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/ProcessAString.java)

---
### 4.21 Check SSN
Write a program that prompts the user to enter a social security number in format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. Here are sample runs:

>Enter a SSN: 232-23-5435
>
>232-23-5435 is a valid social security number.

>Enter a SSN: 23-23-5435
>
>23-23-5435 is an invalid social security number.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/CheckSSN.java)

---
### 4.22 Check substring
Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.

>Enter a string s1: ABCD
>
>Enter a string s2: BC
>
>BC is a substring of ABCD

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/CheckSubstring.java)

---
### 4.23 Financial application: payroll 
Write a program that reads the following information and prints a payroll statement:

>Employee's name (e.g. Smith)
> Number of hours worked in a week (e.g. 10)
> Hourly pay rate (e.g. 9.75)
> Federaltax withholding rate (e.g. 20%)
> State tax withholding rate (e.g. 9%)

A sample run is shown below:

>>Employee's name: Smith
> Number of hours worked in a week: 10
> Hourly pay rate: 9.75
> Federaltax withholding rate: 20%
> State tax withholding rate: 9%
>
>Employee Name: Smith
> Hours workedL 10.0
> Pay rate: $9.75
> Gross pay: $97.5
> Deductions:
>  Federal withholding (20.0%): $19.5
>  State withholding (9.0%): $8.77
>  Total deductions: $28.27
> Net pay: $69.22

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/FinancialApplicationPayroll.java)

---
### 4.24 Order three cities
Write a program that prompts the user to enter three cities and displays them in ascending order. Here is a sample run:

>Enter the first city: Chicago
>
>Enter the second city: Los Angeles
>
>Enter the third city: Atlanta
>
>The three cities in alphabetical order are Atlanta, Chicago, Los Angeles.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/OrderThreeCities.java)

---
### 4.25 Generate vehicle plate numbers
Assume a vehicle plate number consist of three uppercase letters followed by four digits. Write a program to generate a plate number.

>You vehicule plate number: DVD1985

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/VehiclePlateNumber.java)

---
### 4.26 Financial application: monetary units
Rewrite listing 2.10, ComputeChange.java to fix the possible loss of accuracy when converting a float value to an **int** value. Read the input as a string such as "11.56". Your program should extract the dollar amount before the decimal point and the cents after the decimal amount using the **indexOf** and **substring** methods.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter4_Mathematical_Functions/ComputeChange.java)

---