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

---