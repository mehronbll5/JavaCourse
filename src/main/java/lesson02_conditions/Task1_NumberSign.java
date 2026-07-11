package lesson02_conditions;

public class Task1_NumberSign {
    public static void main(String[] args){
        int number =-5;
        if(number>0){
            System.out.println("Положительное");
        } else if (number<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
