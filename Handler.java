public interface Handler {
    void setNext(Handler nextHandler);
    void process(File file);
}