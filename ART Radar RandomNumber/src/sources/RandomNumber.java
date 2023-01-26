package sources;
import java.util.Random;

public  class  RandomNumber {
    private int number;

    public RandomNumber(){
        Random random = new Random();
        this.number = random.nextInt(5)+1;
    }

    public int getNumber(){
        return number;
    }
}