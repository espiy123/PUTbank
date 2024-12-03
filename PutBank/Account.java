/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorium.putbank;


public abstract class Account extends BankObject  {
    
     protected double balance; 
     protected String surname;
    

    public Account(String id, String name, String surname, double balance) {
        super(id, name); // Wywołanie konstruktora klasy bazowej (BankObject)
        this.surname = surname;
        this.balance = balance;
    }

    // Gettery i Settery
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    // Implementacja metody abstrakcyjnej z BankObject
    @Override
    public abstract void showDetails();

}
