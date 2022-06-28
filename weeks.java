import java.util.Scanner; 
public class weeks 
{
    public static void main(String[] args)
    {
        System.out.println("請輸入1~7:");
        Scanner in = new Scanner(System.in);
        in.close();
        int day = in.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("星期一，猴子穿新衣");
                break;
            case 2:
                System.out.println("星期二，猴子肚子餓");
                break;
            case 3:
                System.out.println("星期三，猴子去爬山");
                break;
            case 4:
                System.out.println("星期四，猴子逛夜市");
                break;
            case 5:
                System.out.println("星期五，猴子學跳舞");
                break;
            case 6:
                System.out.println("星期六，猴子隨便遛");
                break;
            case 7:
                System.out.println("星期日，猴子被人日(笑)");
                break;
        }

        // 下面是新手方法(笨笨的):
        //if(day == 1)
        // {
        //     System.out.println("星期一，猴子穿新衣");
        // }
        // else if(day == 2)
        // {
        //     System.out.println("星期二，猴子肚子餓");
        // }
        // else if(day == 3)
        // {
        //     System.out.println("星期三，猴子去爬山");
        // }
        // else if(day == 4)
        // {
        //     System.out.println("星期四，猴子逛夜市");
        // }
        // else if(day == 5)
        // {
        //     System.out.println("星期五，猴子學跳舞");
        // }
        // else if(day == 6)
        // {
        //     System.out.println("星期六，猴子隨便遛");
        // }
        // else if(day == 7)
        // {
        //     System.out.println("星期日，猴子被人日(笑)");
        // }
        // else
        // {
        //     System.out.println("請輸入1~7啦!看不懂中文喔?");
        // }

    }
}
