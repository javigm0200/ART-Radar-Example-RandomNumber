	package sources;

	import java.util.Random;


public class Test{
    public static void main (String [] args) throws Exception{
        int i=0; int finalResult =0; int randomNumber =0; int randomNumber2 =0; RandomNumber rn;
        int count_1s=0, count_2s=0, count_3s=0, count_4s=0, count_5s=0, count_6s=0, count_7s=0;
        while (i<1000) {
        	rn = new RandomNumber();
            randomNumber = rn.getNumber();
            Random random = new Random();
            randomNumber2 = random.nextInt(3);
            finalResult =  randomNumber+randomNumber2;
            if(finalResult==1) {
            	count_1s++;
            }else if(finalResult==2) {
        		count_2s++;
        	} else if(finalResult==3) {
        		count_3s++;
        	} else if(finalResult==4) {
        			count_4s++;
        	} else if(finalResult==5) {
            	count_5s++;
            } else if(finalResult==6) {
            	count_6s++;
            } else if(finalResult==7) {
            	count_7s++;
            } else {
				throw new Exception("Error, numero entre 1 y 7"); 
			}
			
            i++;
            
        }
        String one ="Ha habido "+count_1s+ " 1s \n";
        String two ="Ha habido "+count_2s+ " 2s \n";
        String three ="Ha habido "+count_3s+ " 3s \n";
        String four ="Ha habido "+count_4s+ " 4s \n";
        String five ="Ha habido "+count_5s+ " 5s \n";
        String six ="Ha habido "+count_6s+ " 6s \n";
        String seven ="Ha habido "+count_7s+ " 7s \n";
        String infome = one+two+three+four+five+six+seven;
        System.out.println(infome);
    }
}
