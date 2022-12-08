import java.util.Arrays;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten cua ban: ");
        String name = sc.nextLine();
        String[] nameArray = name.split("=");
        System.out.println(Arrays.toString(nameArray));

        for (int i = 0; i < nameArray.length; i++) {
          nameArray[i] = nameArray[i].substring(0,1).toUpperCase() + nameArray[i].substring(1).toLowerCase();
        }


        String nameString = String.join(" ",nameArray);
        System.out.println("ten toi la: " + nameString);
    }
}
