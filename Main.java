import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();

        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        int max = 12345678;
        boolean[] primeArray = new boolean[max];
        Arrays.fill(primeArray, true);
        primeArray[0] = false;
        primeArray[1] = false;
        String output = "";

        for(int i = 0; primes.size()>=i-1; i++){
            int current = primes.get(i);

                for (int j = current * 2; j < max; j += current) {
                    primeArray[j] = false;
                }

            boolean lastPrimeFound = true;
            int k;
            for(k = current+1; k<max;k++){
                if(primeArray[k]){
                    lastPrimeFound = false;
                    break;
                }
            }
            int nextPrime = k;
            if(lastPrimeFound){
                break;
            }
            primes.add(nextPrime);
        }

        long primeTime = System.currentTimeMillis();
        double primeDeltaSeconds = (primeTime - startTime)/1000.0;

        for(Integer i: primes)
            System.out.println(i);
        long endTime = System.currentTimeMillis();
        double deltaTime = (endTime - primeTime)/1000.0;

        System.out.println("Printing them took " + deltaTime + "seconds");
        /*
        int[] distance = new int[primes.size()-1];


        int distantNotPrimeNeighbor = 0;
        for(int i = 0; i<primes.size()-2; i++){
            int d = primes.get(i+1) - primes.get(i);
            distance[i] = d;
            boolean oneFromPrime = primeArray[d-1]||primeArray[d+1]||primeArray[d+3]||primeArray[d-3];
            if(!oneFromPrime){
                System.out.println(d);
                distantNotPrimeNeighbor++;
            }
        }
        System.out.println();
        System.out.println(distantNotPrimeNeighbor + " not primal distanced neighbor.");
        */
        System.out.println("Finding " + primes.size() + " primes took " + primeDeltaSeconds + " seconds.");

    }
}
