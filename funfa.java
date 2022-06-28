public class funfa
{
    public static void main(String[] args)
    {
        int num = 7;
        System.out.println(square(num));
        print("alala");
    }
    public static int square(int input) //square是方法的名字
    {
        return input * input;
    }
    // int為型態，內容需與型態一致
    public static void print(String name) //void為空白，不回傳任何資料
    {
        System.out.println(name);
    }
}