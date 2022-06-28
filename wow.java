import java.util.Scanner;
public class wow {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //String word1 = scanner.next();
        scanner.close();
        String word2 = scanner.nextLine();
        //System.out.println(word1);
        System.out.println(word2);
        //next只會印出空白或換行前面的字，若要打出空白要改成nextLine(L記得大寫)

        //數字也可以用，int跟float可以交替使用
        int num = scanner.nextInt();
        System.out.println(num);
    }
}
