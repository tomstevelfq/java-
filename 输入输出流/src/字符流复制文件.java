import java.io.*;

//FileReader  文件读取流 用于读文件
//FileWriter   文件写入流 用于写文件
//为了效率  需要用  BuffererReader  和  BufferedWriter  封装

public class 字符流复制文件 {
    public static void main(String[] args) throws IOException {
        File source=new File("source.txt");
        File dest=new File("dest.txt");

        FileReader frd=new FileReader(source);
        BufferedReader brd=new BufferedReader(frd);

        FileWriter fwt=new FileWriter(dest);
        BufferedWriter bwt=new BufferedWriter(fwt);
        String str;
        while((str=brd.readLine())!=null){
            System.out.println(str);
            bwt.write(str);
            bwt.newLine();//换行  关键
        }

        brd.close();
        frd.close();
        bwt.close();
        fwt.close();
        System.out.println("复制完成");
    }
}
