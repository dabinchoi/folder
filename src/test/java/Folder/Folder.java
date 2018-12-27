package Folder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> folders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public long getLength(){
        return 0;
    }
    public void add(File file){
        files.add(file);
    }
    public void deleteFile(String fileName){

    }
    public Iterator<File> filseIterator(){
        return files.iterator();
    }
    public void add(Folder folder){
        folders.add(folder);
    }
    public void deleteFolder(String folderNmae){

    }
    public Iterator<Folder> folderIterator(){
        return folders.iterator();
    }

}
