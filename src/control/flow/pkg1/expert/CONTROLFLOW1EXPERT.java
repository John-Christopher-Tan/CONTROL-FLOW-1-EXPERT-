/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.flow.pkg1.expert;


public class CONTROLFLOW1EXPERT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userN = "john_doe";
        int pin = 1234;
        double balance = 2500.0;
        double withdrawA = 500.0;

        if (userN.equals("john_doe")) {
            if (pin == 1234) {
                String tier;
                double dailyLimit;

                if (balance >= 10000.0) {
                    tier = "Platinum";
                    dailyLimit = 5000.0;
                } else if (balance >= 5000.0) {
                    tier = "Gold";
                    dailyLimit = 2000.0;
                } else if (balance >= 1000.0) {
                    tier = "Silver";
                    dailyLimit = 1000.0;
                } else {
                    tier = "Bronze";
                    dailyLimit = 500.0;
                }

                double feePercentage;
                switch (tier) {
                    case "Platinum":
                        feePercentage = 0.00;
                        break;

                    case "Gold":
                        feePercentage = 0.01;
                        break;

                    case "Silver":
                        feePercentage = 0.02;
                        break;
                    default:
                        feePercentage = 0.03;
                        break;
                }

                double totalDeduction = withdrawA + (withdrawA * feePercentage);

                if (withdrawA <= dailyLimit) {
                    if (totalDeduction <= balance) {
                        System.out.println("TRANSACTION APPROVED");
                        System.out.println("Account Tier: " + tier);
                        System.out.println("Withdrawal: $" + withdrawA);
                        System.out.println("Fee: $" + (withdrawA * feePercentage));
                        System.out.println("Remaining Balance: $" + (balance - totalDeduction));
                    } else {
                        System.out.println("TRANSACTION DENIED: Insufficient account balance.");
                    }
                } else {
                    System.out.println("TRANSACTION DENIED: Exceeds daily limit for " + tier + " tier.");
                }
            } else {
                System.out.println("TRANSACTION DENIED: Invalid 4-digit PIN.");
            }
        } else {
            System.out.println("TRANSACTION DENIED: Invalid username.");
        }
    }
    
}
