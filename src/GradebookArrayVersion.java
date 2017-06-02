import java.util.Scanner;

/**
 * Created by Engineer on 5/30/2017.
 */
public class GradebookArrayVersion {
    public static void main(String[] args){
        int maxStudentNumber=30;
        String[] students=new String[maxStudentNumber];
        Double[] grades= new Double[maxStudentNumber];
        Scanner in=new Scanner(System.in);

        System.out.println("Enter students names(or press ENTER to finish)");
        //get names students
        String newStudent;
        int numberOfStudents=0;
        do{
            newStudent=in.nextLine();
            if (!newStudent.equals("")){
               students[numberOfStudents]=newStudent;
               numberOfStudents++;
            }
        }
        while(!newStudent.equals(""));

        //get students grades

        for (int i=0; i<=numberOfStudents;i++){
            System.out.println("Grade for "+students[i]+":");
            grades[i]=in.nextDouble();
        }

        //print class roster
        double sum=0.0;
        for (int i=0; i<=numberOfStudents;i++){
            sum+=grades[i];
        }

        double avg=sum/numberOfStudents;
        System.out.println("Average Grade: "+avg);

    }
}
