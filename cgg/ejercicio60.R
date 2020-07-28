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

# La suma de dos numeros es 45678 y su diferencia es 9856. Hallar los numeros
# Introduce su diferencia primero (VARIABLE: a) y luego la sumatoria (VARIABLE: b)
ejercicio1(9856, 45678)

# La siguiente funcion encuentra el triplo de la suma de dos numeros y el duplo de la diferencia de los dos numeros. El siguiente ejemplo acalara lo anterior.
# El triplo de la suma de dos numeros es 1350 y el duplo de su diferencia es 700. Hallar los numeros:
ejercicio3 <- function(a,b) {
  if (a != 0 & b != 0) {
    a1 <- a/3 + b/2
    a2 <- a1 / 2
    a3 <- a2 * 3
    a4 <- a - a3
    a5 <- a4 / 3
    vector <- c(a2, a5)
    sprintf("Respuesta: %i", vector)
    } else {
    print("ERROR")
    }
  }
ejercicio3(1350, 700)


