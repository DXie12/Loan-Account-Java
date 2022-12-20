/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;

/**
 *
 * @author dxie1
 */
public class CarLoan extends LoanAccount{
        private String veichleVIN;
        
        public CarLoan(double principle,double annualIntreastRate, int months, String veichleVIN){
            super(principle ,annualIntreastRate, months);
            this.veichleVIN = veichleVIN;              
        }
        public String getCarLoan(){return veichleVIN;}
        
        
    
        @Override
        public String toString(){
            return ("Car Loan with: " + "\n") +  super.toString() + ("Vehicle VIN: " + getCarLoan() + "\n");
          
        }
        
    }
    
