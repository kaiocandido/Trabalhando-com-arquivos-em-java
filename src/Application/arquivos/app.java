package Application.arquivos;

import java.io.File;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma pasta: ");
        String srcPath = sc.nextLine();

        File path = new File(srcPath);

        System.out.println("====================");
        System.out.println("Pastas:");
        File[] folders = path.listFiles(File::isDirectory);
        assert folders != null;
        for (File folder : folders){
            System.out.println(folder);
        }
        System.out.println("====================");
        System.out.println("Arquivos:");
        File[] files = path.listFiles(File::isFile);
        assert files != null;
        for (File file : files){
            System.out.println(file);
        }
        System.out.println("====================");
        System.out.println("Criando pasta:");
        boolean sucess = new File(srcPath + "\\subdir").mkdir();
        System.out.println("Directory created sucess");


        sc.close();
    }
}
