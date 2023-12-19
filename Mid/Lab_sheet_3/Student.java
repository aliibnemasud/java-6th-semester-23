package Lab_sheet_3;

import java.util.ArrayList;
import java.util.List;

class Student {
    String Name, Id, Address, Cgpa;

    public Student (String name, String Id, String Address, String Cgpa){
        this.Name = name;
        this.Id = Id;
        this.Address = Address;
        this.Cgpa = Cgpa;
    }

    public String getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    
}

class StudentRecord{
    public List <Student> StudentArray;

    public StudentRecord() {
        this.StudentArray = new ArrayList<>();
    }


    public void addRecord (Student student){
        StudentArray.add(student);
    }

    public Student printRecord(String id){
        for(Student student : StudentArray){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    } 

    public Student removeStudent(String id){
        for(Student student: StudentArray){
            if(student.getId().equals(id)){
                StudentArray.remove(student);                
            }
        }
        System.out.println("Student with Id '" + id + "' not found.");
        return null;
    }

    public static void main (String [] arg){
        StudentRecord students = new StudentRecord();

        Student siyam = new Student("Siyam", "1", "Uttara", "3.75");
        Student siyam2 = new Student("Siyam2", "2", "Uttara", "3.75");
        Student siyam3 = new Student("Siyam3", "3", "Uttara", "3.75");
        Student siyam4 = new Student("Siyam4", "4", "Uttara", "3.75");

        students.addRecord(siyam);
        students.addRecord(siyam2);
        students.addRecord(siyam3);
        students.addRecord(siyam4);

        Student foundStudent = students.printRecord("4");
        System.out.println(foundStudent.getName());        
    }

}
