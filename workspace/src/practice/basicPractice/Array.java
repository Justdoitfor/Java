package practice.basicPractice;

import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        System.out.print("[");
        for (int i=0;i<array.length;i++){
            if (i ==array.length-1){
                System.out.println(array[i]+"] //自己手写结果");
            }
            else
                System.out.print(array[i]+", ");
        }
        System.out.println("===================");
        System.out.println(Arrays.toString(array)+" //面向对象，直接调用结果");

    }

}
