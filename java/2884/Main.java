import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int alarm = 45;

        if (minute < alarm) {
            hour -= 1;
            minute += 60 - alarm;
            if (hour < 0) hour = 23;
        } else {
            minute -= alarm;
        }

        bw.write(String.valueOf(hour) + " " + String.valueOf(minute));

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}