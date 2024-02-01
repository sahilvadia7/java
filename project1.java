// import java.util.Scanner;

/**
 * Jan 31 9:54
 * Student
 */
class Student {

    int rollno;
    String name;
    int mark;

    
}

public class project1 {
    public static void main(String[] args) {

        /*
        get data from user and store in array 
         
        int arr[]=new int[10];
        Scanner s=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
          
                System.out.print("enter number :");
                arr[i] = s.nextInt();    
            
        }

        for(int n:arr){
           System.err.print(n);
        }
        */

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student StudentArr[]=new Student[3];

        s1.rollno = 1;
        s1.name = "sahil";
        s1.mark = 50;

        s2.rollno = 2;
        s2.name = "Ankit";
        s2.mark = 80;
        
        s3.rollno = 3;
        s3.name = "nikhil";
        s3.mark = 60;

        StudentArr[0] = s1;
        StudentArr[1] = s2;
        StudentArr[2] = s3;

        System.out.println("Rn "+"Name "+"Marks");
        for(int i=0; i<StudentArr.length; i++){
            System.out.print(StudentArr[i].rollno+" "+StudentArr[i].name+" "+StudentArr[i].mark);
            System.out.println();

        }

        //for each loop
        for (Student student : StudentArr) {
            System.err.println(student.name +" : "+student.mark);
        }

        
        
    }
}
