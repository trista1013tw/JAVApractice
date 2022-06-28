public class forloop 
{
    public static void main(String[] args)
    {
        int j = 2;
        int i;
        while(j < 10)
        {
            for(i =0;i <= 10;i++) //int i也可以放到第一個初始條件，但是到了迴圈外面會無法使用
            {
                System.out.println(j+"x"+ i+"="+i*j);
            }
            System.out.println();
            j++;
        }
    }    
}
