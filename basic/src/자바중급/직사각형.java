package 자바중급;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        Rectangle r = new Rectangle(w, h);
        System.out.println("둘레 :"+r.getSize()+", 넓이 :"+r.getArea());

    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getSize() {
        return (width+height)*2;
    }

    public int getArea() {
        return width*height;
    }
}
