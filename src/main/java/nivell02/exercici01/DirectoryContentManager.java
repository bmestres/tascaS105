package nivell02.exercici01;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;

public class DirectoryContentManager {

    public static void loadProperties(){

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        String appConfigPath = String.format("%sapp.properties", rootPath);
        String catalogConfigPath = String.format("%scatalog.properties", rootPath);

        Properties appProps = new Properties();
        Properties catalogProps = new Properties();

        try{
            FileInputStream fis01 = new FileInputStream(appConfigPath);
            appProps.load(fis01);
            fis01.close();

            FileInputStream fis02 = new FileInputStream(catalogConfigPath);
            catalogProps.load(fis02);
            fis02.close();

            String outputFileName = appProps.getProperty("outputFile");
            String outputDir = appProps.getProperty(("outputDir"));
            String dir = catalogProps.getProperty("c1");

            String outputPath = String.format("%s%s%s", outputDir, File.separator, outputFileName);

            writeDirectoryTreeInOrder(dir, outputPath);

        }catch(IOException e){
            System.out.println("Unable to read the file");
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



