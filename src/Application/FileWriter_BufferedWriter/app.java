package Application.FileWriter_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class app {
    public static void main(String[] args) {
        String [] lines = new String[] {"Good morning", "Good afertoon", "Good nigth"};
        String path = "C:\\in.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
