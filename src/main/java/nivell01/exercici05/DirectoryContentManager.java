package nivell01.exercici05;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DirectoryContentManager {

    public static void orderSerialize(String fileName){

        try{
            Order order = new Order();

            FileOutputStream fileWriter = new FileOutputStream(fileName);
            ObjectOutputStream objectoBinary = new ObjectOutputStream(fileWriter);

            objectoBinary.writeObject(order);
            System.out.println("Success");

            objectoBinary.close();
            fileWriter.close();
        }catch(FileNotFoundException e){
            System.out.println("Unable to write the file");
        }catch(IOException e){
            System.out.println("Unable to write the file");
        }
    }

    public static void readAndShowTxt(String filePath){
        Scanner scanner = null;
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(filePath)));

            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch(FileNotFoundException e){
            System.out.println("Error reading file");
        }finally{
            if(scanner != null){
                scanner.close();
            }
        }
    }

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
}
