package Implementation구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.trim();

        if (str.equals("")) {
            System.out.println(0);
        } else {
            String[] words = str.split(" +");
            System.out.println(words.length);
        }
    }
}
