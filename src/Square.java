import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float canh = scanner.nextFloat();
        tinhVaHienThiChuVi(canh);
        tinhVaHienThiDienTich(canh);
        hienThiTatCaCacThongTinTrenCungLuc(canh);

    }
    public static void tinhVaHienThiChuVi(float canh){
        float chuvi = canh*4;
        System.out.println("hinh vuong canh: " +canh+",co chu vi la:"+chuvi);
    }

    public static void tinhVaHienThiDienTich(float canh){
        float dientich = canh*canh;
        System.out.println("hinh vuong canh: "+canh+",co dien tich la:"+dientich);
    }

    public static void hienThiTatCaCacThongTinTrenCungLuc(float canh){
        tinhVaHienThiChuVi(canh);
        tinhVaHienThiDienTich(canh);
    }
}
