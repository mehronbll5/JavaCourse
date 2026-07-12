package lesson03_loops;

public class Task2_SumOfNumbers {
    public static void main(String[] args){
        int sum =0;
        int number=1;
        while (number<=100){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);
    }
}
