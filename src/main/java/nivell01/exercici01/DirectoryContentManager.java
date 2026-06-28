package nivell01.exercici01;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DirectoryContentManager {

    public static void listInOrder(String path){

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
