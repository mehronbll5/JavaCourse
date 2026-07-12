package lesson03_loops;

public class Task3_Multiplication_Table {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
