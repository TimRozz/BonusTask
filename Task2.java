import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int result = a.compareToIgnoreCase(b);
        if(result < 0 ){
            System.out.println("a less than b");
        }
        else if(result > 0){
            System.out.println("b less than a");
        }
        else{
            System.out.println("a equal to b");
        }
    }
}