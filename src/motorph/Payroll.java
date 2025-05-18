/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

/**
 *
 * @author HP-VICTUS
 */
public class Payroll {
      double totalHoursWorked;
    double totalLate;
    double overtimeHours;
    double grossSalary;
    double totalDeduction;
    double totalBonus;
    double netSalary;
    double taxCalculation;

    public double calculateGrossSalary(double workedHours, double late, double overTime) {
        return (workedHours * 100) + (overTime * 120) - (late * 50);
    }

    public double calculateDeduction(Deduction deduction) {
        return deduction.calculateTotalDeduction();
    }

    public double calculateBonus(Bonus bonus) {
        return bonus.calculateTotalBonus();
    }

    public double calculateNetPay(Deduction deduction, Bonus bonus) {
        totalDeduction = calculateDeduction(deduction);
        totalBonus = calculateBonus(bonus);
        return grossSalary - totalDeduction + totalBonus;
    }

    public void generatePayslip() {
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Deductions: " + totalDeduction);
        System.out.println("Bonus: " + totalBonus);
        System.out.println("Net Salary: " + netSalary);
    }

}
