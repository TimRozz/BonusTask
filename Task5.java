import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Task5_2 simple = new Task5_2();
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            simple.isPrime(n);
            if(n==2006){
                break;
            }
        }
//        Task5_2 simple = new Task5_2();
//        int n = scanner.nextInt();
//        simple.isPrime(n);

    }
}
