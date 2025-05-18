/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

/**
 *
 * @author HP-VICTUS
 */
public class Deduction {
     double sssContribution;
    double philHealthContribution;
    double pagIbigContribution;
    double withHoldingTax;

    public double calculateTotalDeduction() {
        return sssContribution + philHealthContribution + pagIbigContribution + withHoldingTax;
    }
}
