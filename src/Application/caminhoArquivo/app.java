package Application.caminhoArquivo;

import java.io.File;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String srcPath = sc.nextLine();

        File file = new File(srcPath);

        System.out.println("Getname: " + file.getName());
        System.out.println("GetParent: " + file.getParent());
        System.out.println("GetPath: " + file.getPath());
    }
}
