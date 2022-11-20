/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author karlo
 */
public class Person {
    private String name,adress;
    
    public Person(String Name, String Adress){
        this.name = Name;
        this.adress = Adress;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAdress(){
        return this.adress;
    }
    public void setAdress(String Adress){
        this.adress = Adress;
    }    
    
    public String toString(){
        return "Person[name=" +this.name+", adress="+this.adress+"]";
    }
}
