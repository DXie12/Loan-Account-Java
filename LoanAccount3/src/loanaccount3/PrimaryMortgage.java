/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;

/**
 *
 * @author dxie1
 */
public class PrimaryMortgage extends LoanAccount{
    private double PMIMonthlyAmount;
    private final Address Address;

        public PrimaryMortgage(double principle, double annualIntreastRate, int months, double PMIMonthlyAmount, Address Address){
            super(principle, annualIntreastRate, months);
            this.PMIMonthlyAmount = PMIMonthlyAmount;
            this.Address = Address;
            
        }
        
        public double getPMIAmount(){return PMIMonthlyAmount;}
       

        @Override
        public String toString(){
            return ("\n" + "Primary Mortgage Loan with: " + "\n") + super.toString()+("PMI Monthly Amount: "+ getPMIAmount() + "\n" + "Property Address: " + "\n" + Address.toString());
        }
        
        
   }
