
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> list;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.list = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.list.add(points);
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
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int sum = 0;
        int count = 0;
        for (int i : grades) {
            sum += i;
            count += 1;
        }
        return 1.0*sum/count;
    }
    
    public double averageOfPoints() {
        if (this.list.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        int count = 0;
        
        for (int i : list) {
            sum += i;
            count += 1;
        }
        return 1.0*sum/count;
        
        
    }
}
