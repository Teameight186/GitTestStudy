import java.util.Scanner;

public class GitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Введите число: ");
            int num = sc.nextInt();
            String str = String.valueOf(num).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
            System.out.println(str);
        }
    }
}
