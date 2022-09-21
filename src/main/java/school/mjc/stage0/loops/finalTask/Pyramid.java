package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
//        for (int x = 1; x <= cathetusLength; x++) {
//            for (int y = cathetusLength; y > 0; y--) {
//                if (y <= x) {
//                    System.out.print(y);
//                    continue;
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int x = 1; x <= cathetusLength; x++) {
//            for (int y = 1; y <= cathetusLength; y++) {
//                if (y <= x) {
//                    System.out.print(y);
//                    continue;
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j > -cathetusLength; j--) {
                int modJ = Math.abs(j);
                if (j <= i && j > 0) {
                    System.out.print(j);
                    continue;
                }
                if (j == 0) {
                    continue;
                }
                if (j < 0 && modJ < i) {
                    System.out.print(Math.abs(j) + 1);
                    continue;
                }
                if (j < 0) {
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
