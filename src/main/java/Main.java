
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades grades = new Grades();
        Grades passingGrades = new Grades();
        Grades failingGrades = new Grades();
        Grades grades1 = new Grades();
        Grades grades2 = new Grades();
        Grades grades3 = new Grades();
        Grades grades4 = new Grades();
        Grades grades5 = new Grades();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            grades.add(points);
            if (points >= 50) {
                passingGrades.add(points);
            }
            if (points < 50) {
                failingGrades.add(points);
            } else if (points < 60) {
                grades1.add(points);
            } else if (points < 70) {
                grades2.add(points);
            } else if (points < 80) {
                grades3.add(points);
            } else if (points < 90) {
                grades4.add(points);
            } else {
                grades5.add(points);
            }
        }
        
        System.out.println("Point average (all): " + grades.getAverage());
        if (passingGrades.getAverage() == 0) {
            System.out.println("Point average(passing): -");
        } else {
            System.out.println("Point average (passing): " + passingGrades.getAverage());
        }
        double passPercentage = 100 * ((double)passingGrades.getListSize() / grades.getListSize());
        System.out.println("Pass percentage: " + passPercentage);
        System.out.println("Grade distribution:");
        System.out.print("5:");
        grades5.printGradeStars();
        System.out.print("4:");
        grades4.printGradeStars();
        System.out.print("3:");
        grades3.printGradeStars();
        System.out.print("2:");
        grades2.printGradeStars();
        System.out.print("1:");
        grades1.printGradeStars();
        System.out.print("0:");
        failingGrades.printGradeStars();
    }
}
