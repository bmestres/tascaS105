package nivell01.exercici04;

public class Main {

    public static void main(String[] args) {

        String fileName = "directoriesTree.txt";

        DirectoryContentManager.writeDirectoryTreeInOrder(".", fileName);

        DirectoryContentManager.readAndShowTxt(fileName);
    }
}
