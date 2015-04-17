import sun.jvm.hotspot.HelloWorld;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by sergii on 11.04.15.
 */
public class CodeJamMain {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sergii/Documents/projects/internal/GroupSpringProject/src/main/java/A-small-practice.in"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            System.out.println(everything);
        }


    }
}
