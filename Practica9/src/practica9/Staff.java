/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author karlo
 */
public class Staff extends Person {

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public double getPay(){
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }
    
    public Staff(String Name, String Adress,String School,double Pay){
        super(Name,Adress); 
        this.school = School;
        this.pay = Pay;
    }

    @Override
    public String toString(){
      return "Staff[Person[name=" +this.getName()+", adress="+this.getAdress()+"], School="+this.school+",Pay="+this.pay+"]";  
    }
    
    private String school;
    private double pay;
}
