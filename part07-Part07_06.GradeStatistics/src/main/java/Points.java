/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> list;
    private ArrayList<Integer> grades;

    public Points() {
        this.list = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.list.add(points);
        this.grades.add(pointsToGrade(points));
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }

    public void add(int points) {
        this.list.add(points);
    }

    public double avg() {
        int count = 0;
        int sum = 0;
        for (int i : list) {
            sum += i;
            count += 1;
        }
        return 1.0 * sum / count;
    }

    public double avgPassing() {
        int count = 0;
        int sum = 0;
        for (int i : list) {
            if (i >= 50) {
                sum += i;
                count += 1;
            }
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }
    
    public int participants() {
        int count = 0;
        for (int i : list) {
            count += 1;
        }
        return count;
}
    public int passingParticipants() {
        int count = 0;
        for (int i : list) {
            if (i >= 50) {
                count += 1;
            }
        }
        return count;
}
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }
    
    
    
}
