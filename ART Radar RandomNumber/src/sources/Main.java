package sources;

import java.util.Random;

public class Main{
    public static void main (String [] args) throws Exception{
        int finalResult =0; int randomNumber =0; int randomAux =0; RandomNumber rn;
    	rn = new RandomNumber();
        randomNumber = rn.getNumber();
        Random random = new Random();
        randomAux = random.nextInt(3);
        finalResult =  randomNumber+randomAux;
        System.out.println("Numero aleatorio entre el 1 y el 7: "+finalResult);
    }
}