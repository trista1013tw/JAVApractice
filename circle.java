public class circle 
{
 public static void main(String[] args)
 {
     int result = 0;
     int i = 1;
     while (i <= 100)
     {
         result += i;
         i++; //可以用 i +=1 替換
     }
     //如果條件為真，迴圈繼續，若是為假，跳脫迴圈
     System.out.println(result);
 }   
}
