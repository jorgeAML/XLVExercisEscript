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
>   The computer is scissor, You are rock. You won.

> scissor (0), rock (1), paper (2): 1
>   The computer is paper, You are paper too. It is a draw.

---
### 3.18 Cost of Shipping
A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
> c(w) = {
>   3.5, if 0 < w <= 1
>   5.5, if 1 < w <= 3
>   8.5, if 3 < w <= 10
>   10.5, if 10 < w <= 20
>}

Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight is greater than 50, display a message "The package cannot be shipped"

---
### 3.19 Compute the perimeter of a triangle
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.

---