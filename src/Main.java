import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        double width=sc.nextDouble();
        System.out.println("nhập chiều dài");
        double height=sc.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("diện tích hình CN:"+rectangle.getArea());
        System.out.println("chu vi hình CN:"+rectangle.getPerimeter());
    }


}
