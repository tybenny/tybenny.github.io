public class Bai1 {
    public static void main(String[] args) {
        printSquare(6);
        System.out.println();
        printTriangle(9);
    }

    public static void printSquare (int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle (int side2){
        for (int i = 0; i < side2; i++) {
            for (int j = 0; j < side2; j++) {
                if (j > i ) {
                    System.out.print("  ");
                } else if (i == j || j == 0 || i == side2 - 1 || i > j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
