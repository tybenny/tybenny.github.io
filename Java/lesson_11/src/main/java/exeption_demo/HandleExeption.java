package exeption_demo;

public class HandleExeption {
    public static void main(String[] args) {
        try {
            methodOne();
            methodTwo();
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("lỗi không chia được số 0");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
//        catch (NullPointerException e){
//            System.out.println("xử lý lỗi NullPointer");
//        }

        System.out.println("code continue...");
    }

    public static void methodOne(){
        int number = 8;
        int zero = 1;
        System.out.println(number/zero);
    }

    public static void methodTwo(){
        String str = "icoa";
        System.out.println(str.length());
    }
}
