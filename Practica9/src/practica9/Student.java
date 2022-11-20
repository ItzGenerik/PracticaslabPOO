/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author karlo
 */
public class Student extends Person {


    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee(){
        return fee;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    public Student(String Name, String Adress,String Program,int Year,double Fee){
        super(Name,Adress); 
        this.program = Program;
        this.year = Year;
        this.fee = Fee;
    }

    @Override
    public String toString(){
      return "Student[Person[name=" +this.getName()+", adress="+this.getAdress()+"], Program="+this.program+",Year="+this.year+",Fee="+this.year+"]";  
    }
    
    private String program;
    private int year;
    private double fee;
}
