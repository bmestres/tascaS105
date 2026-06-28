package nivell01.exercici05;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryContentManager {

    public static Object objectDeserialize(String fileName){

        try{
            FileInputStream fileReader = new FileInputStream(fileName);
            ObjectInputStream binaryToObject = new ObjectInputStream(fileReader);

            return binaryToObject.readObject();

        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }catch(IOException e){
            System.out.println("Could not read object from file");
        }catch(ClassNotFoundException e){
            System.out.println("Could not read object");
        }
        return null;
    }

    public static void objectSerialize(String fileName, Object object){

        ObjectOutputStream objectToBinary = null;
        try{
            FileOutputStream fileWriter = new FileOutputStream(fileName);
            objectToBinary = new ObjectOutputStream(fileWriter);

            objectToBinary.writeObject(object);
            System.out.println("Success");

        }catch(FileNotFoundException e){
            System.out.println("Unable to find the file path");
        }catch(IOException e){
            System.out.println("Unable to write the file");
        } finally {
            if(objectToBinary != null){
                try{
                    objectToBinary.close();
                }catch(IOException e){
                    System.out.println("Unable to close file");
                }

            }
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

    public static void listInOrder(String path){

        File file = new File(path);

        if(file.isDirectory()){
            String[]arr = file.list();

            if(arr != null){
                Arrays.sort(arr);

                for(String elem : arr){
                    System.out.format("%s\n", elem);
                }
            } else {
                System.out.println("Error accessing file");
            }
        }
    }
}
