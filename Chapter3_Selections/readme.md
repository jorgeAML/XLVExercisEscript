# Pedagogical Note
For each exercise, **carefully** analyze the problem requirements and design strategies for solving the problem before coding.
## Debugging Tip
Before you ask for help, read and explain the program to **yourself**, and trace how to program by debugging your own mistakes.

---
### 1. Algebra: solve quadratic equations
The two roots of a cuadratic equation ax^2 + bx + c = 0 can be obtained using the following formula: ["Quadratic formula"](http://www.openmiddle.com/wp-content/uploads/2014/11/quadratic_formula.png).
> b^2 -4ac 
is called the discriminant of the quadratic equation.If is is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display "The equation has no real roots".
Note that you can use Math.pow(x, 0.5) to compute the square of x. [find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/QuadracticEcuation.java)

---
### 2.Game: add three numbers
The program in Listing 3.1 AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two integers. Revise the program to generate three single-digit integers and prompt the user to enter the sum of these three integers. [find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/AddThreeNumbers.java)

---
### 3. Algebra: solve 2 X 2 linear equation
A linear equation can be solved using Cramer's rule given in Programming Exercise 1.13 Write a program that prompts the user to enter a, b, c, d, e and f and displays the result. If *ad - bc* is 0, report that "The equation has no solution". [Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/LinearEquation.java)

---
### 3.17 Game: Scissor, rock, paper
Write a program that plays the popular scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock). The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to ente ra number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses or draws. Here are sample runs: [Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/ScissorRockPaper.java)

> scissor (0), rock (1), paper (2): 1 
>
>   The computer is scissor, You are rock. You won.
>
> scissor (0), rock (1), paper (2): 1
>
>   The computer is paper, You are paper too. It is a draw.

---
### 3.18 Cost of Shipping
A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
> c(w) = {
    >
>   3.5, if 0 < w <= 1
>
>   5.5, if 1 < w <= 3
>
>   8.5, if 3 < w <= 10
>
>   10.5, if 10 < w <= 20
>
>}

Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight is greater than 50, display a message "The package cannot be shipped" [Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/CostOfShipping.java)

---
### 3.19 Compute the perimeter of a triangle
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge. [Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/ComputePerimeterOfATriangle.java)

---
### 3.20 Science: Wind-Chill temperature
Programming exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for temperatures in the range between -58°F and 41°F and wind speed greater than or equal to 2. Write a program that prompts the user to enter a temperature and wind speed. The program displays the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid. [Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/WindChillTemperature.java)

---
### 3.21 Science: day of the week
Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is:

> h = (q + ((26(m + 1))/10) + K + k/4 + j/4 + 5j) % 7.

Where:
*h* is the day of the week (0: Saturday, 1: Sunday, 2:Monday, 3:Tuesday, 4:Wednesday, 5: Thursday, 6: Friday).
*q* is the day of the month.
*m* is the month (3: March, 4:April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
*j* is the century (i.e., year/100).
*k* is the year of the century (i.e., year % 100).

Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. Here are some example runs:

>Enter year: 2012
>
>Enter month: 1
>
>Enter the day of the month: 25
>
>Day of the week is Sunday

(Hint: January and February are counted as 13 and 14 in the formula, so you need to ocnvert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year).

---
### 3.22 Geometry: Point in a circle?
Write a program that prompts the user to enter a point (x,y) and checks whether the point is whithin the circle centered at (0,0) with radius 10. For example, (4,5) is inside the circle and (9,9), is outside the circle, as shown in Figure 3.7a.
(Hint: A point is in the circle if its distance to (0,0) is less than or equal to 10. The formula for computing the distance is sqrt((x2-x1)^2 + (y2-y1)^2). Test your program to cover all cases.) Two sample runs are shown below:

> Enter a point with two coordinates: 4 5
> Point (4.0, 5.0) is in the circle
>
> Enter a point with two coordinates: 9 9
> Point (9.0, 9.0) is not in the circle

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/PointInACircle.java)

---
### 3.23 Geometry: Point in a Rectangle?
Write a program that prompts the user to enter a point (x, y) and checks whether the point is whithin the rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.) Here are two sample runs:

> Enter a point with two coordinates: 2 2
> Point (2.0, 2.0) is in the rectangle
>
> Enter a point with two coordinates: 6 4
> Point (6.0, 4.0) is not in the rectangle

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/PointInARectangle.java)

---
### 3.24 Game: pick a card
Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (ACE, 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING) and suit (CLUBS, DIAMONDS, HEARTS, SPADES) of the card. Here is a sample run of the program:

> The card you picked is Jack of Hearts

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/PickACard.java)

---
### 3.25 Geometry: Intersection point
Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4) as shown in Figure 3.8a-b. The intersectiong point of the two lines can be found by solving the following linear equation:

> (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
>
> (y3 - y4)x - (x3 - x4)y = (x3 - y4)x3 - (x3 - x4)y3

This linear equation can be solved using Cramer's rule [Intersection Euclidean Geometry](https://en.wikipedia.org/wiki/Intersection_%28Euclidean_geometry%29#Two_lines) (see Programming Exercise 3.3). If the equation has no solutions, the two lines are parallel. Write a program that prompts the user to enter four points and displays the intersecting point. Here are sample runs:

> Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
> The intersecting point is at (2.88889, 1.1111)
>
> Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
> The two lines are parallel.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/IntersectionPoint.java)

---
### 3.26 Use the &&, || and ^ operators
Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6, whether it is divisble by 5 or 6, and whether it is divisible by 5 ir 6, but not both. Here is a sample run of this program:

> Enter an integer: 10
>
>Is 10 divisible by 5 and 6? false
>
>Is 10 divisible by 5 or 6? true
>
>Is 10 divisible by 5 or 6, but not both? true

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/TernaryOperators.java)

---
### 3.27 Geometry: Points in Triangle?
Suppose a right triangle is placed in a plane as show below. The right-angle point is placed at (0,0), and the other two points are placed at (200,0) and (0,100). Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle. Here are the sample runs:

>Enter a point's x- and y-coordinates: 100.5 25.5
>
>The point is in the triangle
>
>Enter a point's x- and y-coordinates: 100.5 50.5
>
>The point is not in the triangle

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/PointsInTriangle.java)

---
### 3.28 Geometry: Two Rectangles
Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first, as shown in Figure 3.9. Test your program to cover all cases:

> Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
>
> Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
>
> r2 is inside r1

> Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
>
> Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
>
> r2 overlaps r1

> Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3 
>
> Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
>
> r2 does not overlaps r1

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/TwoRectangles.java)

---
### 3.29 Geometry: Two Cricles
Write a program that prompts the user to enter the center coordinates and radio of two circles and determines whether the second circle is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle 2 is inside circle 1 if the distance between the two centers <= |r1 - r2| and circle 2 overlaps circle 1 if the distance between the two centers <= r1 + r2. Test your program to cover all cases.)
Here are the sample runs:

>Enter circles1's center x-, y-coordinates, and radius: 0.5 5.1 13
>
>>Enter circles2's center x-, y-coordinates, and radius: 1 1.7 4.5
>
>circle2 is inside circle1

>Enter circles1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
>
>>Enter circles2's center x-, y-coordinates, and radius: 6.7 3.5 3
>
>circle2 overlaps circle1

>Enter circles1's center x-, y-coordinates, and radius: 3.4 5.5 1
>
>>Enter circles2's center x-, y-coordinates, and radius: 5.5 7.2 1
>
>circle2 does not overlap circle1

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/TwoCircles.java)

---
### 3.30 Current Time
Revise the Programming Exercise 2.8 to display the hour using a 12-hour clock. Here is a sample run:

> Enter the time zone offset to GMT: -5
>
> The current time is 4:50:34 AM

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/CurrentTime.java)

---
### 3.31 Financials: Currency exchange
Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to chinese RMB and 1 to convert from chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollar or chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. Here are the sample runs:

>Enter the exchange rate from dollars to RMB: 6.81
>
>Enter 0 to convert dollars to RMB and 1 vice versa: 0
>
>Enter the dollar amount: 100
>
>$100.0 is 681.0 yuan.

>Enter the exchange rate from dollars to RMB: 6.81
>
>Enter 0 to convert dollars to RMB and 1 vice versa: 1
>
>Enter the RMB amount: 10000
>
>$10000.0 yuan is $1468.43.

>Enter the exchange rate from dollars to RMB: 6.81
>
>Enter 0 to convert dollars to RMB and 1 vice versa: 5
>
>Incorrect input.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter3_Selections/FinancialCurrencyExchange.java)

---