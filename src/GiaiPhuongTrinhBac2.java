

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh giai phuong tinh bac 2 dang 'ax2+bx+c=0'");
        System.out.println("nhap vao he so a:");
        double a = scanner.nextInt();
        System.out.println("nhap vao he so b:");
        double b = scanner.nextInt();
        System.out.println("nhap vao he so c:");
        double c = scanner.nextInt();
        if(a==0){
            if(b!=0){
                System.out.println("phuong trinh voi b khac 0 co nghiem duy nhat x = "+(c/b));
            }
            else if(c!=0) System.out.println("phuong trinh co dang 0x+b=0 vo nghiem!");
            else System.out.println("phuong trinh co dang 0x + 0 = 0 vo so nghiem");
        }
        else{
            double delta = b*b-4*a*c;
            System.out.println(Math.sqrt(delta));
            if(delta > 0){
                System.out.println("phuong trinh co 2 nghiem phan biet x1 ="+(-b+Math.sqrt(delta))/(2*a)+" x2 = "+(-b-Math.sqrt(delta))/(2*a));
            }
            else if(delta == 0) System.out.println("phuong trinh co 1 nghiem kep x ="+(-b/2*a));
            else System.out.println("phuong trinh vo nghiem");
        }
    }
}