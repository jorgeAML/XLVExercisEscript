import java.util.Scanner;

public class FinancialApplicationPayroll {
    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner (System.in);
        //Nombre del usuario
        System.out.println("Enter employee's name: ");
        String nombreUsuario = input.nextLine();
        //Horas de trabajo
        System.out.println("Enter number of hours worked in a week: ");
        double horas = input.nextDouble();
        //Pago de horas
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        //Federal tax
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        //state tax
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        //FORMULAS
        double grossPay = horas * payRate;
        double federalTaxWithholding = federalTax * payRate * 10;
        double stateTaxWithholding = (stateTax * payRate * 100)/10D;
        double totalDeduction = federalTaxWithholding + stateTaxWithholding;
        double netPay = grossPay - totalDeduction;
        //CONDITIONALS
        if (nombreUsuario.length() > 1) {
            System.out.println("\n");
            System.out.println("------------------------------");
            System.out.println("Employee Name: " + nombreUsuario);
            System.out.println("Hours Worked: " + horas);
            System.out.println("Pay Rate: " + payRate);
            System.out.println("Gross Pay: " + grossPay);
            System.out.println("Deductions: " + "\n" + " Federal Withholding (" + (federalTax * 100) +  "%): " + federalTaxWithholding 
            + "\n" + " State Deductions (" + (stateTax * 100) + "%): " + stateTaxWithholding + "\n" + 
            " Total Deduction: " + totalDeduction);
            System.out.printf("Net Pay: %10.2f \n", netPay);
            System.out.println("------------------------------");
        } else {
            System.out.println("You must insert a valid name");
            System.exit(1);
        }

    }
}