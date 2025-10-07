package Application.FileReader_BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class app {
    public static void main(String[] args) {
        String path = "C:\\ANOTAÇÃO.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
