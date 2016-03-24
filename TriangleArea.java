import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        int aX,aY,bX,bY,cX,cY, area;

        Scanner input = new Scanner(System.in);
        aX = input.nextInt();
        aY = input.nextInt();
        bX = input.nextInt();
        bY = input.nextInt();
        cX = input.nextInt();
        cY = input.nextInt();

        areaTriangle = (aX * (bY-cY) +  bX * (cY-aY) + cX * (aY-bY))/2;

                System.out.println(Math.abs(areaTriangle));
    }
}
