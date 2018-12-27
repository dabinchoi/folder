package Folder;

public class FolderFileExam01 {
    public static void main(String[] args) {
        Folder myworkFolder = new Folder("c:\\mywork");
        Folder javaFolder = new Folder("java");
        Folder docFolder = new Folder("doc");
        myworkFolder.add(javaFolder);
        myworkFolder.add(docFolder);

        File hellFile = new File("hello");
        hellFile.setLength(500);
        myworkFolder.add(hellFile);

        File java1TxFile = new File("java1.txt");
        java1TxFile.setLength(900);
        File java2TxtFile = new File("java2.txt");
        java2TxtFile.setLength(800);
        javaFolder.add(java1TxFile);
        javaFolder.add(java2TxtFile);

        File readmeFile = new File("readme");
        readmeFile.setLength(700);
        docFolder.add(readmeFile);

        System.out.println(myworkFolder.getLength());
        System.out.println(javaFolder.getLength());
        System.out.println(docFolder.getLength());

    }
}
