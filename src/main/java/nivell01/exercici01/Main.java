package nivell01.exercici01;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import static nivell01.exercici01.DirectoryContentManager.listInOrder;

public class Main {

    public static void main(String[] args) {
        listInOrder("/Users/bernat");
    }
}
