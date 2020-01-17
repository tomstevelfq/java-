import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//System.in相当于一个文件

public class 控制台接受输入 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ird=new InputStreamReader(System.in);
        BufferedReader bfd=new BufferedReader(ird);

        System.out.println("输入姓名");
        String name=bfd.readLine();
        System.out.println("输入年龄");
        String age=bfd.readLine();
        System.out.println("姓名"+name+"年龄"+age);
    }
}
