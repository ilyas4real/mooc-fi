/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.Scanner;

public class UIInterface {
    private Points points;
    private Scanner scanner;
    
    public UIInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
 
            if (point >= 0 && point <= 100) {
                this.points.add(point);
                this.points.addGradeBasedOnPoints(point);
            }
            
        }
        System.out.println("Point average (all): " + points.avg());
        if (points.avgPassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + points.avgPassing());
        }
        System.out.println("Pass percentage: " + 100*(1.0*points.passingParticipants())/points.participants());
        printGradeDistribution();
        
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
 
            grade = grade - 1;
        }
        
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
}
