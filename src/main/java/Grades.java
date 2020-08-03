/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATEO
 */
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private int sum;

    public Grades() {
        this.grades = new ArrayList<>();
        this.sum = 0;
    }
    
    public void add(int element) {
        if ((element >= 0) && (element <= 100)) {
            this.grades.add(element);
            this.sum += element;
        }
    }
    
    public double getAverage() {
        if (this.grades.isEmpty()) {
            return 0;
        }
        return (double)this.sum / this.grades.size();
    }
    
    public int getListSize() {
        return this.grades.size();
    }
    
    public void printGradeStars() {
        if (!(this.grades.isEmpty())) {
            for (int i = 0; i < this.grades.size(); i++) {
                System.out.print("*");
            }
            System.out.println("");
        } else {
            System.out.println("");
        }
    }
}
