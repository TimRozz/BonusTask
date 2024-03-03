public class Task3_2 {
    int a;
    int b;
    static int result = 1;
    public Task3_2(){}
    public static int pow(int a,int b){
        while(b!=0){
            result = result * a;
            b--;
        }
        System.out.println(result);

        return a;
    }
}
