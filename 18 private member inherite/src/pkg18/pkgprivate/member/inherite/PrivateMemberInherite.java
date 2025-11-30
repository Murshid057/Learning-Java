/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.pkgprivate.member.inherite;

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }   
}

class Teacher extends Person{                //inheritance
    //name, age;
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}

public class PrivateMemberInherite {

    public static void main(String[] args) {
        
        Teacher h1 = new Teacher();
        h1.setName("Mizanur Rahman");
        h1.setAge(25);
        h1.setQualification("Bsc in CSE");
        h1.display();
    }
    
}

//private variabel direct inherite kora jay na. Setter & getter method use kore inherite korte hoy.