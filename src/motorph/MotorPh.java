/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motorph;

/**
 *
 * @author HP-VICTUS
 */
public class MotorPh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Employee emp = new Employee();
        emp.employeeID = 10001;
        emp.name = "Manuel Garcia III";
        emp.department = "CEO";
        emp.getEmployeeInfo();

        Attendance att = new Attendance();
        double hoursWorked = att.calculateWorkedHours();

        Deduction deduction = new Deduction();
        deduction.sssContribution = 100;
        deduction.philHealthContribution = 75;
        deduction.pagIbigContribution = 50;
        deduction.withHoldingTax = 125;

        Bonus bonus = new Bonus();
        bonus.riceSubsidy = 500;
        bonus.phoneAllowance = 300;
        bonus.clothingAllowance = 400;
        bonus.otherBonus = 200;

        Payroll payroll = new Payroll();
        payroll.totalHoursWorked = hoursWorked;
        payroll.grossSalary = payroll.calculateGrossSalary(hoursWorked, 1, 2);
        payroll.netSalary = payroll.calculateNetPay(deduction, bonus);
        payroll.generatePayslip();
    }
}    // TODO code application logic here
