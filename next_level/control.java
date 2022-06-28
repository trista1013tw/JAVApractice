public class control 
{
    public static void main(String[] args)
    {
        //int s1 = 10, s2 = 20, s3 = 30,
        //    s4 = 40, s5 = 50, s6 = 60;  換行是可行的，但注意不可缺少分號及逗號
        
        //陣列第一種
        int[] x = new int[6];  //int[]"整數"陣列物件
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 50;
        x[4] = 80;
        x[5] = 60;
        
        for(int i =0;i<6;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println(x.length);
        System.out.println("---------------------");

        //第二種陣列
        int[] s = new int[]
        {1,3,5,2,4,6}; //在{大括號}裡面放陣列的子物件，不用再放全部物件數在[]
        for(int i =0;i<6;i++)
        {
            System.out.println(s[i]);
        }
        System.out.println(s.length);

        //int可以改成String(存字串)、float(只能存小數，記得小數最後要加f)、boolean(只能存true、false)等，皆可適用

    }    
}
