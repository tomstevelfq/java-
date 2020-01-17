import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流在处理中文时候容易乱码

//FileInputStream  文件输入流   进行读文件（输入）操作
//FileOutputStream  文件输出流  进行写文件（输出）操作


public class 字节流复制文件 {
    public static void main(String[] args) throws IOException {
        File copy=new File("source.txt");
        File dest=new File("dest.txt");
        System.out.println(copy.length());
        System.out.println(dest.length());
        if(!copy.exists()){
            if(!copy.createNewFile()){
                System.out.println("文件创建失败");
            }
        }

        if(!dest.exists()){
            if(!dest.createNewFile()){
                System.out.println("文件创建失败");
            }
        }

        FileInputStream fin=new FileInputStream(copy);
        FileOutputStream fout=new FileOutputStream(dest);

        byte[] buf=new byte[1024];

        while(fin.read(buf)!=-1){
            System.out.println(new String(buf));
            fout.write(buf);
        }

        fin.close();
        fout.close();

        System.out.println("复制完成");
    }

}
