public class Bai3 {
    public static void main(String[] args) {
        usingMathClass();
    }

    public static void usingMathClass() {
        // in ra số ngẫu nhiên
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println("Số ngẫu nhiên là : " + randomInt);
        System.out.println(isPrimeNumber(randomInt));
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
