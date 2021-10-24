import java.io.*;
public class DataInputOutputStream {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // Writing primitive data types
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(786);
            dataOutputStream.writeDouble(25.67);
            dataOutputStream.writeChar('A');
            dataOutputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fileOutputStream!= null){
                    fileOutputStream.close();
                }
                if(dataOutputStream!= null) {
                    dataOutputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readChar());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(fileInputStream != null) {
                    fileInputStream.close();
                }
                if(dataInputStream != null){
                    dataInputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
