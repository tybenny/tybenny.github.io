public class ForDemo {
    public static void main(String[] args) {
        // begin : Khởi tạo giá trị ban đầu cho vòng lặp
        // condition : Điều kiện để tiếp tục chạy vòng lặp
        // step : Cập nhật giá trị sau mỗi lần lặp

        //Thực hiện cv thức dậy lúc 5h sáng trong vòng 30 ngày
        //day = day + 1
        //day++
        //day += 1
//        for (int day = 1; day <= 30; day = day + 1){
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//        }

        //day = 1 => day <= 30 : true => Thực thi => Tăng day lên 1 (day = 2)
        //day = 2 => day <= 30 : true => Thực thi => Tăng day lên 1 (day = 3)
        // ...
        //day = 31 => day <= 30 : false => Kết thúc vòng lặp.

        //Ví dụ 2: Ngày chẵn dậy lúc 5h, ngày lẻ dậy lúc 7h
//        for (int day = 1; day <= 30; day = day + 1){
//            if (day % 2 == 0){
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            }
//            else {
//                System.out.println("Ngày " + day + " thức dậy lúc 7h");
//            }
//        }

        //ví dụ 3: thực hiện đến ngày 20 => chán không thực hiện nữa
//        for (int day = 1; day <= 30; day = day + 1){
//            if (day == 20) {
//                System.out.println("Chán quá, từ bỏ");
//                break;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//        }

        //ví dụ 4: vẫn dậy lúc 5h nhưng cuối tuần không thực hiện nữa
//        for (int day = 1; day <= 30; day = day + 1){
//            if (day % 7 == 0){
//                System.out.println("Nghỉ xả hơi đi nhậu");
//                continue;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//        }
//

        //Tính tổng tiền tiết kiệm
        //Tiết kiem trong 10 ngày, mỗi ngày 100.000

        int total = 0;
//        for (int day = 1; day <= 10; day++){
////            total = total + 100_000;
//            total += 100_000;
//        }

        //từ ngày thứ 5 trở đi, mỗi ngày tiết kiệm 200_000
        //đến ngày số 8, bạn rủ đi nhậu, lấy 500_000 trong tiết kiệm ra
        for (int day = 1; day <= 10; day++){
            if (day == 8){
                total -= 500_000;
            }
            if(day >= 5) {
                total += 200_000;
            } else {
                total += 100_000;
            }
        }

        System.out.println("Tổng tiền "+ total);
    }
}
