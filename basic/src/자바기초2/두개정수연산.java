package 자바기초2;

import java.io.*;
import java.util.*;

public class 두개정수연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println("덧셈 : "+(a+b)+", 뺄셈 : "+(a-b));
    }
}
