package 자바기초2;

import java.util.Arrays;

public class 배열평균 {
    static int[] arr = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        System.out.println("변경 전 : "+ ((double) getHap()/arr.length));
        change(2,5);
        change(9,2);
        System.out.println("변경 후 : "+ ((double) getHap()/arr.length));

    }

    static int getHap() {
        int hap = 0;
        for(int i : arr) {
            hap += i;
        }
        return hap;
    }

    static void change(int index, int value) {
        arr[index] = value;
    }
}
