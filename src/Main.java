import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        System.out.print("Enter width: ");
        String line;

        try {
            line = bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Exception during reading line", e);
        }
        int width = Integer.parseInt(line);

        System.out.print("Enter heigh: ");
        try {
            line = bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Exception during reading line", e);
        }
        int heigh = Integer.parseInt(line);
        paintRectangle(width, heigh);

    }

    public static void paintRectangle(int width, int height){
        upLeftAngle();
        for (int i = 0; i < width; i++) {
            horizontalLine();
        }
        upRightAngle();
        for (int i = 0; i < height - 2; i++) {
            verticalLine();
            for (int j = 0; j <width; j++) {
                System.out.print(" ");
            }
            verticalLine();
            System.out.println();
        }
        downLeftAngle();
        for (int i = 0; i < width; i++) {
            horizontalLine();
        }
        downRightAngle();
    }

    public static void upLeftAngle(){
        System.out.print('\u250F');
    }

    public static void horizontalLine(){
        System.out.print('\u2501');
    }

    public static void upRightAngle(){
        System.out.println('\u2513');
    }

    public static void verticalLine(){
        System.out.print('\u2503');
    }

    public static void downLeftAngle(){
        System.out.print('\u2517');
    }

    public static void downRightAngle(){
        System.out.print('\u251B');
    }
}
