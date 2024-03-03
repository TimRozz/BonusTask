import java.math.BigInteger;

public class Task5_2 {
    int x;
    public Task5_2(){}
    public static boolean isPrime(int x){
        Integer integer = x;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        if(probablePrime == true){
            System.out.println(" YES");
        }
        else{
            System.out.println(" NO");
        }
        //System.out.println(probablePrime);
        return false;
    }
}
