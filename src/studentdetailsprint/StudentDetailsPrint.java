/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetailsprint;

/**
 * create object of student, store object in array,print the student details
 * @author srinivsi,hello
 * date: May 25th
 */
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student[] list = new Student[3]; //array of student object 
       Student s1 = new Student();
       s1.setName("john");
       s1.setAge(19);
       Student s2 = new Student();
       s2.setName("Peter");
       s2.setAge(19);
       Student s3 = new Student();
       s3.setName("Jain");
       s3.setAge(19);
       list[0]= s1;
       list[1]=s2;
       list[2]=s3;
       for(int i=0;i<list.length;i++)
       {
         System.out.println(list[i].getName() + " "+list[i].getAge());
         System.out.println("Learn Github operatiions");
        //commit and save
       }
       
    }
    
}
