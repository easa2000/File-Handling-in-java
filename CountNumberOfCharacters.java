import java.io.*;

public class CountNumberOfCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\msg.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line;
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 0;
        int whiteSpaceCount = 0;

        while((line = reader.readLine()) != null ) {
            if(line.equals("")) {
                paragraphCount++;
            }
            if(!(line.equals(""))) {
                characterCount += line.length();
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
                whiteSpaceCount += countWord - 1;
                String[] sentenceList = line.split("[!?.:]+");
                sentenceCount += sentenceList.length;
            }
        }
        System.out.println("Total Word count = " + countWord);
        System.out.println("Total number of sentence = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraph = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whiteSpaceCount);
    }
}
