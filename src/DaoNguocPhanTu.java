import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int size;
        int temp;


        do {
            System.out.println("Insert size: ");
            size = input1.nextInt();
            if (size >20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);


        int[] arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            Scanner input2 = new Scanner(System.in);
            arr[i] = input2.nextInt();
            i++;
        }
        System.out.println("Arrays: "+Arrays.toString(arr));

        for (int j = 0; j < arr.length/2 ; j++) {

            temp = arr[j] ;
            arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;

        }
        System.out.println("New arrays: "+Arrays.toString(arr));


    }
}
