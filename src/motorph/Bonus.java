/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

/**
 *
 * @author HP-VICTUS
 */
public class Bonus {
     double riceSubsidy;
    double phoneAllowance;
    double clothingAllowance;
    double otherBonus;

    public double calculateTotalBonus() {
        return riceSubsidy + phoneAllowance + clothingAllowance + otherBonus;
    }

}
