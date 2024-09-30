package ErrorHandling;

import java.lang.ArithmeticException;

public class MyError {
    public static void main(String[] args){

        checkScore(2.15);
        checkScore(50);
        checkScore(92.02);
        checkScore(100.01);

    }
    public static void checkScore(double score){
        try {
            if(0 < score && score <= 50.0){
                System.out.println("Average score");
            }
            else if(50.00 < score &&  score <= 100.00){
                System.out.println("Very good score");
            }else{
                throw new ArithmeticException("Score is out of scale!");
            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}