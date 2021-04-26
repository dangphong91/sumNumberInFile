import java.io.*;

public class SumNumberInFile {
    public static void main(String[] args) throws IOException {
        FileReader file = null;
        BufferedReader br = null;
        try {
            file = new FileReader("D:\\bai tap\\creatInt.txt");
            br = new BufferedReader(file);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng = " + sum);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (file != null) {
                file.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }
}
