package LAB_8;

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        File file = new File("sjd.txt");

        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line.replaceAll("\\bhis\\b", "her"))
                        .append("\n");
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            bw.close();

            System.out.println("Replacement done successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
