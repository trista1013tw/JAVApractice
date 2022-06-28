import java.util.Scanner;

public class slef 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        String word = scanner.nextLine();
            //如果用next，遇到空白或tab會沒辦法印出後面的字樣；用nextLine會連同空白印出
        System.out.println(word);

        /*
        int num = scanner.nextInt();
        System.out.println(num);
        則只能輸入整數，若用float只能輸入數字(會有小數點)*/

        boolean bool = true;
        System.out.println(bool);
        int price = 100;
        if(price < 100)
        {
            System.out.println("buy!!");
        }
        else
        {
            if(price == 100)
            {
                System.out.println("R U sure?");
            }
            else
            {
                System.out.println("Don't buy!!");
            }
        }
    }
    

}
