# La suma de dos numeros es 1250 y su diferencia 750. Hallar los numeros.
ejercicio1 <- function(a,b) {
  if (a != 0 & b != 0) {
    a1 <- a + b
    a2 <- a1 / 2
    a3 <- b - a2
    vector <- c(a2, a3)
    sprintf("Respuesta: %i", vector)
    } else {
      print("ERROR")
      }
   }
ejercicio1(750, 1250)
