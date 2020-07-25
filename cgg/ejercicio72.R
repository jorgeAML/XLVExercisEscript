# this is an basic example using R
# just a control how I know R for use a Machine Learning project.
uno <- 6 ^ 3
print(uno)
dos <- 5 ^ 4
print(dos)
tres <- 7 ^ 3
print(tres)

# Hallar el valor de:
cuatro <- 2^0 * 2
print(cuatro)
a1 <- 3^0 * 5^4
print(a1)
# [1] 625
a2 <- 4^2 * 3^2
print(a2)
# [1] 144
a3 <- 5^0 * 3^7 * 6^0
print(a3)
# [1] 2187
a4 <- 2^0 * 3^0 * 4^0 * 5^0
print(a4)
[1] 1
a5 <- 3^3 * 4^2 * 5^4
print(a5)
#[1] 270000
polyroot(c(-3,-5,2))
# [1] -0.5+0i  3.0-0i
a6 <- 2^10 * 10^2 * 8^0
print(a6)
# [1] 102400
a7 <- 6^2 * 9^0 * 2^10
print(a7)
# [1] 36864
a8 <- 3^0 / (2^2 * 3^2)
print(a8)
#[1] 0.02777778
a9 <- 5^3 / 3^0
print(a9)
#[1] 125
a10 <- 3^2 * 3^0 / 9
print(a10)
# [1] 1
a11 <- (2^4 * 5^2) / (5^0 * 4^2)
print(a11)
# [1] 25
a <- 1
b <- 1
a12 <- 3^4 * a^0 / 9^2 * b^0
if (a12 == 1) {
    sprintf("RESPUESTA: %i", a12)
    } else {
      print("RESPUESTA INCORRECTA")
}
# EJERCICIO 29
a13 <- (5^5 * 2^3) / (10^2 * 5^0)
if (a13 == 250) {
    sprintf("Tu respuesta: %i", a13) 
     } else {
     print("Incorrecto")
     }
# EJERCICIO 30
a14 <- 3^0 *(5^2/4^0)
if (a14 == 25) {
    sprintf("Tu respuesta es correcta: %i", a14)
} else {
    print("Al parecer tu respuesta es incorrecta")
}
# EJERCICIO 30
a15 <- 3^3 * 2^2 - 3^0 * 4^0
if (a15 == 107) {
    sprintf("Tu respuesta correcta: %i", a15)
 } else {
    print("Al parecer tu respuesta es incorrecta")
 }


