import java.io.*;
import java.util.Base64;

public class EncodingWithFiles implements EncodingModule {

    public String inputFile = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
    public String outputFile = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";

    @Override
    public void encode() throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new FileReader(inputFile));
            writer = new BufferedWriter(
                    new FileWriter(outputFile));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
}