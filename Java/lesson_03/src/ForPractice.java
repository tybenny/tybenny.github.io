public class ForPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("so", 5));
    }
    public static String repeatString(String str, int count){
        String rs = "";
        for (int i = 0; i < count; i++) {
            rs += str;
        }
        return rs;
    }
}
