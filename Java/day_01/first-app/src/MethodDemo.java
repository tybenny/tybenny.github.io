public class MethodDemo {
    public static void main(String[] args) {
        //Công việc A: tốn mất 20 dòng code
        //thực hiện công việc A 10 lần: tốn 200 dòng code
        //Có method: tốn thêm 10 dòng gọi method


        sayHello();

        //cách 2: Định nghĩa đối tượng -> gọi method của đối tuong (thể hiện, instance) đây
        //Class: khuôn bánh (chỉ có 1 khuôn)
        //object: bánh sinh ra từ khuôn (nhiêu bánh)
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.sayHello1("Minh Thang");
        methodDemo.sayHello1("sò");

    }

    //Tính tổng 2 số: trả về kết quả là tổng của 2 số a, b
    //Tham số: parameter (giá trị ảo chưa biet trước khi định nghĩa method)
    //Đối số: argument (giá trị thật khi gọi method
    public static int sumTwoNumber (int a, int b){
        int result = a + b;
        return  result;
    }

    public static void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    public void sayHello1(String name){
        System.out.println("Xin chào " + name);
    }

}
