import java.util.ArrayList;

public class PrimeThread extends Thread{

    static ArrayList<Integer> primeList = new ArrayList<Integer>();

    private Integer number;

    public PrimeThread(){

    }

    public void run() {

    }


    public static boolean testPrimality(Integer i){
        return false;
    }

    public static boolean isPrime(Integer i){
        if(primeList.contains(i)){
          return true;
        }
        return testPrimality(i);
    }

}
