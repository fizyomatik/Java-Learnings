import java.util.Arrays;
public class AddArr {

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int n=my_array.length;
        int newarr[]= new int[n+1];
        for (int b=0;b<n;b++){
            newarr[b]=my_array[b];
        }

        System.out.println(Arrays.toString(my_array));
        int index=10;
        int value=34;

        for (int i=my_array.length-1;i>index;i--){
            newarr[i]=newarr[i-1];

        }
        newarr[index]=value;
        System.out.println(Arrays.toString(newarr));
    }
}
