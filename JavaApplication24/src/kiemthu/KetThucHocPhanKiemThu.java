package kiemthu;

import java.util.Scanner;

public class KetThucHocPhanKiemThu {

    public static void main(String[] args) {
        String xeploai;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem sinh vien");
        double diemTB = sc.nextDouble();
        xeploai = xepLoai(diemTB);
        System.out.println(xeploai);
    }

    public static String xepLoai(double diemTB) {
        String loaiHocLuc = null;
        if (diemTB > 9.5) {
            loaiHocLuc = "Xuất Sắc";
        }
        if (diemTB <= 9.5 && diemTB >= 8.6) {
            loaiHocLuc = "Giỏi";
        }
        if (diemTB <= 8.6 && diemTB >= 6.6) {
            loaiHocLuc = "Khá";
        }
        if (diemTB <= 6.5 && diemTB >= 5) {
            loaiHocLuc = "Trung Bình";
        }
        if (diemTB < 5.0) {
            loaiHocLuc = "Yếu";
        }
        return loaiHocLuc;
    }

}
