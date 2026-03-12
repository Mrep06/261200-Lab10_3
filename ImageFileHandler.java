public class ImageFileHandler implements Handler {
    private Handler next;
    private String handlerName;

    public ImageFileHandler(String name) {
        this.handlerName = name;
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void process(File file) {
        if (file.getType().equals("image")) {
            System.out.println("Process " + file.getType() + " file by " + handlerName);
        } else if (next != null) {
            next.process(file);
        } else {
            System.out.println("File not supported");
        }
    }
}
