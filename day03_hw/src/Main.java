import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatString("ab"));
        System.out.println(repeatString2("a"));
        System.out.println(repeatString3("ab", 5));
        System.out.println("Tổng các số từ 0-100 chia hết cho 5 là: " + tong(0,100));
        System.out.println(theTich(3));
    }

    //bài 1
    public static String repeatString(String str) {
        String random = "";
        for (int i = 0; i < 10; i++) {
            random += str;
        }
        return random;
    }

    //bài 2
    public static String repeatString2(String str2){
        String random2 = "";
        for (int i = 0; i < 10; i++) {
            if (i > 0){
                random2 += "-";
            }
            random2 += str2;
        }
        return random2;
    }

    //bài 3
    public static String repeatString3(String str3, int count){
        String random3 = "";
        for (int i = 0; i < count; i++) {
            if (i > 0){
                random3 += "-";
            }
            random3 += str3;
        }
        return random3;
    }

    //bài 4
    public static int tong(int n, int m){
        int tongCong = 0;
        for (int i = n; i <= m; i++) {
            if (i % 5 == 0){
                tongCong += i;
            }
        }
        return tongCong;
    }

    //bài 5
    public static double theTich(double r){
        double a = 4f;
        double b = 3f;
        double theTichHinhCau = (a/b)*Math.PI*Math.pow(r,3);
        return theTichHinhCau;
    }

    //bài 6
    public static void a1(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if(i%3 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }


        }

    }
}