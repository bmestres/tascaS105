package nivell01.exercici01;

import java.io.File;
import java.util.Arrays;

public class DirectoryContentManager {

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
