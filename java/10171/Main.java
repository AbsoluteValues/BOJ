import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("\\    /\\\n" + //
                        " )  ( ')\n" + //
                        "(  /  )\n" + //
                        " \\(__)|");
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}