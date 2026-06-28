package nivell01.exercici03;

import java.io.*;
import java.util.Arrays;

public class DirectoryContentManager {

    public static void writeDirectoryTreeInOrder(String dirPath, String textFileName){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(textFileName));
            listDirectoryTreeInOrder_rec(dirPath, 0, writer);
            writer.close();
        }catch( java.io.IOException e){
            System.out.println("Error writing file");
        }
    }

    private static void listDirectoryTreeInOrder_rec(String dirPath, int level, BufferedWriter writer) {

        File dir = new File(dirPath);
        File[] firstLevelFiles = dir.listFiles();

        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            Arrays.sort(firstLevelFiles);
            for (File elemFile : firstLevelFiles) {
                for (int i = 0; i < level; i++) {
                    try{
                        writer.write("\t");
                    }catch(IOException e){
                        System.out.println("Error writing file");
                    }
                }
                if (elemFile.isDirectory()) {
                    try{
                        writer.write(String.format("(D) %s\n", elemFile.getName()));
                        listDirectoryTreeInOrder_rec(elemFile.getAbsolutePath(), level + 1, writer);
                    }catch(IOException e){
                        System.out.println("Error writing file");
                    }

                } else {
                    try{
                        writer.write(String.format("(F) %s\n", elemFile.getName()));
                    }catch(IOException e){
                        System.out.println("Error writing file");
                    }

                }
            }
        }
    }

    public static void listInOrder(String path){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(path);

        if(file.isDirectory()){
            String arr[] = file.list();
            Arrays.sort(arr);

            int n = arr.length;

            for(int i = 0; i < n; i++){
                System.out.format("%s\n", arr[i]);
            }
        }
    }
}
