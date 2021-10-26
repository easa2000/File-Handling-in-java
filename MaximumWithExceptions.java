import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWithExceptions {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("maximum.txt"));
            int max = -1;
            String line = bufferedReader.readLine();
            while (line != null) {
                int n = Integer.parseInt(line);
                if(n > max){
                    max = n;
                }
                line = bufferedReader.readLine();
            }
            if(max == -1) {
                throw new Exception("File empty or all numbers < 0");
            }else {
                System.out.println("Maximum : " + max);
            }
        }catch (FileNotFoundException e){
            System.out.println("File doesn't exist");
        }catch (IOException e){
            System.out.println("The file cannot be read");
        }catch (NumberFormatException e){
            System.out.println("the file contain non numeric");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
