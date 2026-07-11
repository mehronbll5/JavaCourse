package lesson02_conditions;

public class Task2_GradeCalculator {
    public static void main (String[] args){
        int score=89;
        if(score>=90){
            System.out.println("A");
        } else if (score>=75) {
            System.out.println("B");
        }else if (score>=60){
            System.out.println("C");
        }else {
            System.out.println("F");
        }
    }}
