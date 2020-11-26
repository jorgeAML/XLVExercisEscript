# Pedagogical Note
For each exercise, **carefully** analyze the problem requirements and design strategies for solving the problem before coding.
## Debugging Tip
Before you ask for help, read and explain the program to **yourself**, and trace how to program by debugging your own mistakes.

---
### Algebra: solve quadratic equations
The two roots of a cuadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:
!["Quadratic formula"](http://www.openmiddle.com/wp-content/uploads/2014/11/quadratic_formula.png)
> b^2 -4ac 
is called the discriminant of the quadratic equation.If is is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display "The equation has no real roots".
Note that you can use Math.pow(x, 0.5) to compute the square of x.

---

