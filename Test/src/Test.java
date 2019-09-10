import java.util.*;
import java.lang.*;
import java.io.*;

class HW2_P3 {
    public int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}

class DriverMain {
    public static void main(String args[]){
        HW2_P3 hw  = new HW2_P3();
        int[] array = hw.getArray();

        //Print the result array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}