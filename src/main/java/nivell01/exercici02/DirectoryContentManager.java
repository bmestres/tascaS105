package nivell01.exercici02;
import java.io.File;
import java.util.Arrays;

    public class DirectoryContentManager {

        public static void listDirectoryTreeInOrder_rec(String dirPath, int level) {

            File dir = new File(dirPath);
            File[] firstLevelFiles = dir.listFiles();

            if (firstLevelFiles != null && firstLevelFiles.length > 0) {
                Arrays.sort(firstLevelFiles);
                for (File elemFile : firstLevelFiles) {
                    for (int i = 0; i < level; i++) {
                        System.out.print("\t");
                    }
                    if (elemFile.isDirectory()) {
                        System.out.printf("(D) %s\n", elemFile.getName());
                        listDirectoryTreeInOrder_rec(elemFile.getAbsolutePath(), level + 1);
                    } else {
                        System.out.printf("(F) %s\n", elemFile.getName());
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
