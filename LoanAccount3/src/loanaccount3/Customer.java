/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;
import java.util.ArrayList;

/**
 *
 * @author dxie1
 */
public class Customer{
    private String FirstName;
    private String LastName;
    private String SSN;
    ArrayList<LoanAccount> loan = new ArrayList<LoanAccount>();
            
    public Customer(String FirstName, String LastName, String SSN){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
        }
    
    public String getFirstName(){return FirstName;}
    public String getLastName(){return LastName;}
    public String getSSN(){return SSN;}

    public void addLoanAccount(LoanAccount Account){
        loan.add(Account);
    }
    
    public String printMonthlyReport(){
        System.out.println("Account Report for Coustomer " + getFirstName() + " " + getLastName() + " " + "With " + getSSN());
    for (LoanAccount x: loan){
        System.out.println(x);
        
    }
        return "";
    }

    
}
