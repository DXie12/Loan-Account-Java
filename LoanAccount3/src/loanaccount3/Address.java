/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount3;

/**
 *
 * @author dxie1
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    
    public Address(String street, String city, String state, String zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    
    @Override
        public String toString(){
            return (street + "\n" + city + ", " + state + " " + zipcode + "\n");
        }
    
}