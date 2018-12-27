package Folder;

public class File {
    private String name;
    private long length;

    public File(String name) {
        this.name = name;
    }

    public void rename(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
