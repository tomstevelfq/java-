import java.io.*;

public class 各种类型数据流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("dat.dat");
        DataInputStream din=new DataInputStream(fin);
        FileOutputStream fout=new FileOutputStream("out.dat");
        DataOutputStream dout=new DataOutputStream(fout);

        dout.writeChars("hahahaah");
        dout.writeLong(326);
        dout.close();
        fout.close();
        din.close();
        fin.close();
    }
}
