import java.util.Scanner;

public class ISBNLikeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your ISBN: ");
        String isbn = input.nextLine();
        int isbnToInt = Integer.parseInt(isbn);

        //System.out.println(isbnToInt);
        if (isbn.length() != 9) {
            System.out.println("You must to insert 9 digits not more or less. Something like '156888945'");
            System.exit(1);
        }
        //LA LOGICA
        int divisionPrimerDig = isbnToInt / 100000000; //RETORNA EL PRIMER NUMERO ISBN
        int moduloSegundoDigito = isbnToInt % 100000000;
        int divisionSegundoDig = moduloSegundoDigito / 10000000; //EL SEGUNDO
        moduloSegundoDigito = isbnToInt % 10000000;
        int divisionTercerDig = moduloSegundoDigito / 1000000; //EL TERCERO
        moduloSegundoDigito = isbnToInt % 1000000;
        int divisionCuartoDig = moduloSegundoDigito / 100000; //EL CUARTO
        moduloSegundoDigito = isbnToInt % 100000;
        int divisionQuintoDig = moduloSegundoDigito / 10000; //EL QUINTO
        moduloSegundoDigito = isbnToInt % 10000;
        int divisionSextoDig = moduloSegundoDigito / 1000; //EL SEXTO
        moduloSegundoDigito = isbnToInt % 1000;
        int divisionSeptimoDig = moduloSegundoDigito / 100; //EL SEPTIMO
        moduloSegundoDigito = isbnToInt % 100;
        int divisionOctavoDig = moduloSegundoDigito / 10; //EL OCTAVO
        int moduloNoveno = isbnToInt % 10;

        //FORMULA
        int formula = (divisionPrimerDig * 1 + divisionSegundoDig * 2 + 
        divisionTercerDig * 3 + divisionCuartoDig * 4 + divisionQuintoDig * 5 + 
        divisionSextoDig * 6 + divisionSeptimoDig * 7 + divisionOctavoDig * 8 +
        moduloNoveno  * 9) % 11;

        System.out.println("Sumatoria Formula " + formula);

        if (formula < 10) {
            System.out.println("The ISBN-10 number is: " + divisionPrimerDig + divisionSegundoDig + 
            divisionTercerDig + divisionCuartoDig + divisionQuintoDig + 
            divisionSextoDig + divisionSeptimoDig + divisionOctavoDig + 
            moduloNoveno + formula);
        } else if (formula >= 10) {
            System.out.println("The ISBN-10 number is: " + divisionPrimerDig + divisionSegundoDig + 
            divisionTercerDig + divisionCuartoDig + divisionQuintoDig + 
            divisionSextoDig + divisionSeptimoDig + divisionOctavoDig + 
            moduloNoveno + "X");
        } else {
            System.out.println("The ISBN-10 is not correct");
        }
    }
}