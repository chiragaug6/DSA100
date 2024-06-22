
/**
 * Create array of object of class Student_Detail with attributes,Enrollment_No,
 * Name, Semester, CPI for 5 students, scan their information and print it.
 */
import java.util.Scanner;

public class PRO35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail studentdata[] = new Student_Detail[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Student details for Student " + (i + 1));
            System.out.print("Enter Enrollment No:");
            long enrollmentNo = sc.nextLong();
            sc.nextLine(); // Consumes the leftover newline character
            System.out.print("Enter Name :");
            String name = sc.nextLine();
            System.out.print("Enter Semester :");
            int sem = sc.nextInt();
            System.out.print("Enter CPI :");
            float cpi = sc.nextFloat();
            Student_Detail std = new Student_Detail(enrollmentNo, name, sem, cpi);
            studentdata[i] = std;
        }

        for (Student_Detail std : studentdata) {
            std.printDetails();
        }

        sc.close();
    }
}

class Student_Detail {
    long enrollmentNo;
    String name;
    int semester;
    float cpi;

    Student_Detail(long enrollmentNo, String name, int semester, float cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    public void printDetails() {
        System.out.println("-------------------------------------");
        System.out.println("enrollmentNo :" + enrollmentNo);
        System.out.println("Student name :" + name);
        System.out.println("semester :" + semester);
        System.out.println("Student CPI :" + cpi);
    }
}
