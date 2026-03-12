public class File {
    private String name;
    private String type;
    private String path;

    public File(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public String getType() { return type; }
    public String getName() { return name; }
}