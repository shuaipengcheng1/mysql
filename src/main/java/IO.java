import java.io.*;

public class IO {
//    InputStream OutPutStream
//    public static void main(String[] args) throws IOException {
//        FileInputStream fileReader = new FileInputStream("D:\\mysql\\src\\main\\java\\a.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\mysql\\src\\main\\java\\a_copy.txt");
//        char[] chars = new char[10];
//        try {
//            while (true){
//                int a=  fileReader.read();
//                if(a!=-1){
//                    System.out.println((char)a);
//                    fileOutputStream.write(a);
//                }else {
//                    break;
//                }
//            }
//            fileOutputStream.flush();
//
//        }catch (IOException exception){
//          exception.printStackTrace();
//        }finally {
//            fileReader.close();
//            fileOutputStream.close();
//        }
//
//    }
public static void main(String[] args) throws IOException {
    FileReader fileReader = null;
            FileWriter fileWriter = null;
    int c ;
            try {
             fileReader=   new FileReader("D:\\mysql\\src\\main\\java\\a.txt");
              fileWriter=  new FileWriter("D:\\mysql\\src\\main\\java\\a_t.txt");

              while ((c=fileReader.read())!=-1){
                  System.out.println("读取的值"+(char)c);
                  fileWriter.write(c);
              }

              fileWriter.flush();
            }catch (IOException exception){
                exception.printStackTrace();
            }finally {
                fileReader.close();
                fileWriter.close();
            }

}
}
