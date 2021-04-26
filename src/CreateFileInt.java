import java.io.*;

public class CreateFileInt {
    private static final String FILENAME = "D:\\bai tap\\creatInt.txt";

    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            char[] data = {'5','3','6','1','8'};
            File file = new File(FILENAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            for (char ch:
                 data) {
                bw.append(ch);
                bw.append("\r\n");
            }
            System.out.println("Success.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
