public class GitTest {
    public static void main(String[] args) {
       int num = 12345678;
       String str = String.valueOf(num).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
        System.out.println(str);
    }
}
