package Person;

public class Calculator {
    //khởi tạo thuộc tính
    public double number1;
    public double number2;

    //khởi tạo phương thức
    public void printInfo(){
        System.out.println("2 số đã chọn là: " + number1 + " " + number2);
    }

    public double addition(){
        double tong = number1 + number2;
        return tong;
    }

    public double subtract(){
        double hieu = number1 - number2;
        return hieu;
    }

    public double multi(){
        double tich = number1 * number2;
        return tich;
    }

    public double division(){

        double result = 0;
        try {
            result = (double) (number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}