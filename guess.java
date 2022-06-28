import java.util.Scanner;
public class guess 
{
    public static void main(String[] args)
    {
      float num = (float)Math.random();
      num *=1000.0f;

      int num2 = (int)num;

      Scanner scanner = new Scanner(System.in);
      DeadLoop:
      while(true)
      {
        int say = scanner.nextInt();

        if(say > num2)
        {
          System.out.println("猜大了!");
        }
        else if(say < num2)
        {
          System.out.println("猜小了!");
        }
        else
        {
            System.out.println("猜對了，你好棒!");
            break DeadLoop;
      }
    scanner.close();
  }
    }
}
