/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;

/**
 *
 * @author dxie1
 */
public class UnsecuredLoan extends LoanAccount{
        public UnsecuredLoan(double principle, double annualIntreastRate, int months){
            super(principle, annualIntreastRate, months);           
        }
        
        @Override
        public String toString(){
            return ( "\n" + "Unsecured Loan with: " ) + super.toString();
   }
    
}