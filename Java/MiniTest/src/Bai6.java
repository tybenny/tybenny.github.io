import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email của bạn: ");
        String email = sc.nextLine();
        System.out.print("Nhập số điện thoại của bạn: ");
        String phoneNumber = sc.nextLine();

        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        if (Pattern.matches(EMAIL_PATTERN, email) == true){
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ !!");
        }

        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        boolean test = phoneNumber.matches(reg);
        if (test == false) {
            System.out.println("Số đện thoại không hợp lệ !!");
        } else {
            System.out.println("Số điện thoại hợp lệ!");
        }
    }
}
