import java.sql.SQLOutput;
// Java Code -> ByteCode -> Mã máy -> Thực thi


public class Main {
    //phạm vi global: biến khai báo bên ngoài method
    public static String globalVar = "Global  variable";

    //Phạm vi method: khai báo bên trong method


    //Phạm vi block: khai báo bên trong {}
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        //khai báo biến
        String firstName;
        String lastName;
        String email = "tybenny@gmail.com";

        //gán giá trị cho biến
        firstName = "Vuong";
        lastName = "Minh Thang";
        String fullName = firstName + " " + lastName;
        int age = 23;
        String address = "Hà Nội";

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);
        System.out.println("Xin chào, tên tôi là " + fullName + ". Năm nay tôi " + age + " tuổi." + " Quê tôi ở " + address + ".");

        //Khai báo các kiểu dữ liệu
        long salary = 1_000_000_000L;
        double height = 1.7;
        float weight = 60.5f;
        boolean isExist = true;
        boolean isMarried = false;

        char characterA = 'A';
        char characterB = 66; //tra bảng mã ASCII

        System.out.println(characterA);
        System.out.println(characterB);
        System.out.println(salary);
        System.out.println(height);
        System.out.println(isExist);
        System.out.println(isMarried);

        //Ép kiểu
        //Ép kieu ngầm định (nhỏ sang lớn)
        int number = 10;
        long numberOne = number;

        System.out.println(numberOne);

        //Ép kiểu tưởng minh
        short numberTwo = (short) number;

        //gọi biến global
        System.out.println(globalVar);

        //Phạm vi block
        {
            String blockVar = "block variable";
            System.out.println(blockVar);
        }
//        System.out.println(blockVar); ngoai phạm vi sử dụng --> error
    }
}


