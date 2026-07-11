package lesson02_conditions;

public class Task3_Season {
    public static void main(String[] args){
        int month=1;
        String season = switch (month){
            case 12,1,2->"Zima";
            case 3,4,5->"Vesna";
            case 6,7,8 -> "Leto";
            case 9,10,11 -> "Osen";
            default ->"Error!";
        };
        System.out.println(season);
    }
}
