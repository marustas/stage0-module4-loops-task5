package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if (i == sideLength / 2) {
                for (int j = 1; j < sideLength; j++) {
                    System.out.print(8);
                }
            } else {
                for (int j = 0; j < sideLength / 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(8);
        }
    }

    public static void main(String[] args) {
        printCross(7);
    }
}