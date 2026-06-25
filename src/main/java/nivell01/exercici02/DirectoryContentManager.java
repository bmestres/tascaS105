package nivell01.exercici02;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;

    public class DirectoryContentManager {

        public static void listDirectoryTreeInOrder_rec(String dirPath, int level) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            File dir = new File(dirPath);
            File[] firstLevelFiles = dir.listFiles();

            if (firstLevelFiles != null && firstLevelFiles.length > 0) {
                Arrays.sort(firstLevelFiles);
                for (File elemFile : firstLevelFiles) {
                    for (int i = 0; i < level; i++) {
                        System.out.printf("\t");
                    }
                    if (elemFile.isDirectory()) {
                        System.out.printf("[%s]\n", elemFile.getName());
                        listDirectoryTreeInOrder_rec(elemFile.getAbsolutePath(), level + 1);
                    } else {
                        System.out.printf("%s\n", elemFile.getName());
                    }
                }
            }
        }
    }
