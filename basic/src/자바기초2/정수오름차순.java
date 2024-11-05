package 자바기초2;

import java.io.*;
import java.util.*;

public class 정수오름차순 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
