import java.util.StringTokenizer;

public class Bai2 {
    public static void main(String[] args) {
        stringTest("toi that dep zai 456 oooo");
    }

    public static void stringTest(String text){
        System.out.println("Chuỗi đã nhập là: " + text);

        StringTokenizer stringTokenizer = new StringTokenizer(text);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("Số từ có trong chuỗi là: " + soTuTrongChuoi);

        char kyTu = 'o';
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi là: " + count);

    }
}

