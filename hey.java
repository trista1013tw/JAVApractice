public class hey 
{
    public static void main(String[] args)
    {
        char ch = 't';
        // \r迴車鑑換行，不過\n換行比較常見
        String num1 = "one \n";
        String num2 = "two \r\n";
        String num3 = "tres\r";
        System.out.println(num1+ch);
        System.out.println(num2);
        System.out.println(num3);
       
        /*多行註解
        舊式著個樣式
        很實用喔~*/

        //如果適用int計算(尤其除法)系統只會以整數計算，劉整數答案；若要小數店答案要使用float
        float number1 = 147;
        int number2 = 11;
        String ccc = "hey,yo man.";
        System.out.println(ccc+number1%number2);
        number1--;
        //number1減一的簡寫
        number2++;
        //number2加一的簡寫
        System.out.println(number1);
        System.out.println(number2);

    }
}
