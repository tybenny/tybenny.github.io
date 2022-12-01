public class SwitchCase {
    public static void main(String[] args) {
        int money = 18000;

        switch (money){

            //Gom trường hợp:
            case 12000:
            case 15000:
            case 18000:

            {
                System.out.println("cà phê sữa");
                break;
            }

            case 10000: {
                System.out.println("ca phe da");
                break;
            }

            case 8000: {
                System.out.println("sting dau");
                break;
            }

            case 2000: {
                System.out.println("tra da");
                break;
            }

            default: {
                System.out.println("Khong co do uong phu hop");
                break;
            }
        }

    }
}
