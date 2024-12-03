/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorium.putbank;
import java.time.LocalTime;
/**
 *
 * @author Wiktu
 */


public abstract class BankObject {
    
    protected String id; 
    protected String name; 
    protected LocalTime dateOfCreation;
    
   
    public BankObject(String id, String name) {
        this.id = id;
        this.name = name;
        this. dateOfCreation = LocalTime.now();
    }
    
    // Gettery i Settery
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void getDate() {
            System.out.println(dateOfCreation);
}
    
    // Metoda abstrakcyjna do wyświetlania szczegółów obiektu (do zaimplementowania w klasach dziedziczących)
    public abstract void showDetails();
}


