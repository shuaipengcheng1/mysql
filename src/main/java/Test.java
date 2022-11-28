public class Test {
   private static int count=0;
    public static int getConut(){
        return count;
    }
    private  int a =0;
    public  int c =1;
    public Test(){
        count++;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test();
        Test t2= new Test();
        Test t3 = new Test();
        System.out.println(Test.getConut());
        T t4 = new T();
        System.out.println(t4.c);
    }

}

class T extends  Test{
    public T(){

    }
    public static void main(String[] args) {
        System.out.println();
    }
}