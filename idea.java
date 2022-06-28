public class idea 
{
    public static void main(String[] args)
    {
        student A = new student(); //有new就有創造新物件(動態)，非靜態變數要搭配使用
        student B = new student();
        student C = new student();
        A.hight = 160.0f;
        A.weight = 65.0f;
        B.hight = 158.2f;
        B.weight = 55.6f;
        C.hight = 178.3f;
        C.weight = 70.2f;

        student.x = 10.0f; //靜態變數使用適用檔名

        System.out.println(A.hight);
        System.out.println(B.hight);
        System.out.println(C.hight);
    }
}
