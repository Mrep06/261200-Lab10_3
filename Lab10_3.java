public class Lab10_3 {
    public static void main(String[] args) {
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocumentFileHandler("Document Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        // ลำดับ: TextFileHandler --> DocumentFileHandler --> ImageFileHandler
        textHandler.setNext(docHandler);
        docHandler.setNext(imageHandler);

        File textFile = new File("README.txt", "text", "/home/docs");
        File docFile = new File("Document.doc", "document", "/home/docs");
        File imageFile = new File("Picture.jpg", "image", "/home/images");
        File audioFile = new File("Song.mp3", "audio", "/home/audio");

        // กฎสำคัญ: ต้องเริ่มส่งให้ "ตัวแรกของ Chain" (textHandler) เสมอ
        System.out.println("Processing text file:");
        textHandler.process(textFile);

        System.out.println("\nProcessing document file:");
        textHandler.process(docFile);

        System.out.println("\nProcessing image file:");
        textHandler.process(imageFile);

        System.out.println("\nProcessing audio file:");
        textHandler.process(audioFile);
    }
}