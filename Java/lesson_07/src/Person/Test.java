package Person;

public class Test {
    public static void main(String[] args) {
        //tạo ra các đối tượng
        Person person = new Person();

        System.out.println(person.name); //null (default value của String)
        System.out.println(person.age);

        person.name = "Nguyễn văn A";
        person.email = "dab@gmail.com";
        person.age = 20;
        person.address = "Hanoi";

        //in ra thông tin của đối tượng
        System.out.println(person.name + " - " + person.email + " - "
        + person.email + " - " + person.address);

        //gọi ra phương thức
        person.showInfo();
        person.eat();
        person.play("Bóng đá");

        System.out.println(person);

        //khởi tạo đối tượng phone
        Phone phone = new Phone();
        phone.name = "iPhone 13 pro max";
        phone.brand = "Apple";

        person.usePhone(phone);

        Calculator calculator = new Calculator();
        calculator.number1 = 2.3;
        calculator.number2 = 2.1;
        calculator.printInfo();
        System.out.println(calculator.addition());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multi());
        System.out.println(calculator.division());

        System.out.println("Code continue ...");

        //khởi tạo đối tượng person với Constructor
        Person person1 = new Person("Trần Văn B", "b@gmail.com");
        System.out.println(person1);

        Person person2 = new Person("Sò", "sosss@gmail.com", 23, "Hanoi");
        System.out.println(person2);
    }
}
