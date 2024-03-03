public class Task4_2 {
    int[] arr;
    public Task4_2(){
        //this.arr=arr;
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp = 0;
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
