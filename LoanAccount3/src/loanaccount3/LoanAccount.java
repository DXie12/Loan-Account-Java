/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;

/**
 *
 * @author dxie1
 */
    public class LoanAccount {
    
    private double principle;
    private double annualIntreastRate;
    public int months;
    
    public LoanAccount(double principle, double annualIntreastRate, int months){
        this.principle = principle;
        this.annualIntreastRate = annualIntreastRate;
        this.months = months;
    }
    
    public double getprinciple(){return principle;}
    public double getannualIntreastRate(){return annualIntreastRate;}
    public int getmonths(){return months;}
    
    public void setAnnualInterestRate(double rate){
        annualIntreastRate = rate/100;
    }
    

    
    public double calculateMonthlyPayment(){
        double monthlyintreast = annualIntreastRate/12;
        double monthlypayment = principle * (monthlyintreast / (1 - Math.pow(1 + monthlyintreast,-months)));
        return monthlypayment;
    }     
    
    
    @Override
    public String toString(){
        return String.format("Principle: $%.2f\nAnnual Interest Rate: %.2f\nTerm of Loan in Months: %d\nMonthly Payment: $%.2f\n", getprinciple(), this.getannualIntreastRate(), getmonths() ,calculateMonthlyPayment());
        
    }
}
