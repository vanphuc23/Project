import java.util.Arrays;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {45,44,39,48,37,46,53};
        int sum=0;
        int min=arr[0];
        int max=arr[0];
        int position=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Day "+ (i+1) +"'s high temp: "+arr[i]);
            if(max<arr[i]) {
                max=arr[i];
            }
            if(min>arr[i]) {
                min=arr[i];
            }
            if(arr[i]==44) {
                position=i;
            }
            sum+=arr[i];
        }
        int count=0;
        double avg = (double)sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=avg) {
                count++;
            }
        }
        String str = Arrays.toString(arr);
        System.out.println("Average temp = "+(double)Math.round((avg*10))/10);
        System.out.println(count+" days were above average");
        System.out.println("Temperatures: "+str);
        System.out.println("coldest days: "+min);
        System.out.println("hottest days: "+max);
        System.out.println("Vi tri "+position+" cp gia tri = 22");
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min) {
                temp=i;
            }
            if(arr[i] == max) {
                arr[i]=min;
                arr[temp] = max;
            }
        }
        System.out.println("Temperatures: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp2 = arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
