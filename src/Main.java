import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDienTieuThu = scanner.nextInt();
        System.out.println("So tien dien phai tra:"+tinhTienDien(soDienTieuThu));
    }

    private static int tinhTienDien(int soDienTieuThu) {
        int total = 0;
        if(soDienTieuThu>0 && soDienTieuThu <25){
            total += 1000*soDienTieuThu;
        }
        if(soDienTieuThu>=25 && soDienTieuThu<75){
            total += 1250*soDienTieuThu;
        }
        if(soDienTieuThu>=75 && soDienTieuThu<150){
            total += 1800*soDienTieuThu;
        }
        if(soDienTieuThu>= 150){
            total += 2500*soDienTieuThu;
        }
        return total;
    }
}
