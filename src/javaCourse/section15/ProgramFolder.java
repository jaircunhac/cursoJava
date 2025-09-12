package javaCourse.section15;

import java.io.File;
import java.util.Scanner;

public class ProgramFolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\testing").mkdir();
        System.out.println("Directory created? " + success);

        System.out.print("Enter a file path: ");
        String strPath2 = sc.nextLine();

        File path2 = new File(strPath2);

        // Only shows the name of the file
        System.out.println("getName: " + path2.getName());
        // Only shows the path of the file
        System.out.println("getParent: " + path2.getParent());
        // Shows the entire path
        System.out.println("getPath: " + path2.getPath());

        sc.close();
    }
}
