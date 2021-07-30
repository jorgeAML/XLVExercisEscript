## Chapter 2 Elementaary Programming

### 2.1 Convert celsius to Fahrenheit
Write a program that reads a a Celsius degree in a *double* value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:

> Fahrenheit = (9 / 5) * celsius + 32

*Hint: In java 9/5 is 1, but 9.0/5 is 1.8.* Here is a sample run

>Enter a degree in Celsius: 43
>
>43 Celsius is 109.4 Fahrenheit.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/ConvertCelsiusToFahrenheit.java)


---
### 2.2 Compute the volume of a cylinder
Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:

| Area | Volume |
| ---- | ------ |
| radius * radius * PI | area * radius |

Here is a sample run:

> Enter the radius and length of a cylinder: **5.5 12**
>
> The area is 95.0331
>
> The volume is 1140.4

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/ComputeVolumeCylinder.java)

---
### 2.3 Convert feet into meters
Write a program that reads a number in feet, converts its to meters, and displays the result. One foot is **0.305** meter. Here is a sample run:

>Enter a value for feet: 16.5
>
>16.5 feet is 5.0325 meters

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/ConvertFeetIntoMeters.java)

---
### 2.4 Convert pounds into kilograms
Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and display the result. One pound is **0.454** Kilogram. Here is a sample run:

>Ente a number in pounds: 55.5
>
>55.5 pounds is 25.197 kilograms.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/ConvertPoundsIntoKilograms.java)

---
### 2.5 Financial application: calculate tips
Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters **10** for subtotal and **15%** for gratuity rate, the program displays **$1.5** as gratuity and **$11.5** as total. Here is a sample run:

>Enter the subtotal and the gratuity rate: 10 15
>
>The gratuity is $1.5 and total is $11.5

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/CalculateTips.java)

---
### 2.6 Sum the digits in an integer
Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all digits is 14.
Hint: use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. Here is a sample run:

>Enter a number between 0 and 1000: 999
>
>The sum of the digits is 27.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/SumTheDigitsInteger.java)

---
### 2.7 Find the number of years
Write a program that prompts the user to enter the minutes (e.g, 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days. Here is a sample run:

>Enter the number of minutes: 1000000000
>
>1000000000 minutes is approximately 1902 years and 214 days.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/FindNumberOfYears.java)

---
### 2.8 Current Time
Listing 2.7, ShowCurrentTime.java gives a program to displays the current time in GMT. Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone. Here is a sample run:

>Enter the time zone offset to GMT: -5
>
>The current time is 4:50:54S

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/CurrentTime.java)

---
### 2.9 Physics acceleration
Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in the following formula:

> a = v1 - v0 / t

Write a program that prompts the user to enter the starting velocity **v0** in meters/seconds, the ending velocity **v1** in meters/seconds, and the time span **t** in seconds, and displays the average acceleration. Here is a sample run:

>Enter v0, v1, and t: 5.5 50.9 4.5
>
>The average acceleration is 10.0889

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/PhysicsAcceleration.java)

---
### 2.10 Science: Calculating Energy
Write a program that calculates the enery needed to heat water from an initial temperature to a final temperature. Your program shoul prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is:

> Q = M * (finalTemperature - initialTemperature) * 4184

Where **M** is the weight of water in kilograms, temperature are in degrees Celsius, and energy **Q** is measured in joules. Here is a sample run:

> Enter the amount of water in kilograms: 55.5 
>
> Enter the initial temperature: 3.5
>
> Enter the final temperature: 10.5
>
> The energy needed is 1625484.0

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/CalculatingEnergy.java)

---
### 2.11 Population Projection
Rewrite programming exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years. Use the hint in programming exercise 1.11 for this program. The population should be cast into an integer. Here is a sample run of the program:

> Enter the number of years: 5
>
> The population in 5 years is 325932970.

[Find the answer here](https://github.com/jorgeAML/XLVExercisEscript/blob/master/Chapter2-Elementary-Programming/PopulationProjection.java)

---