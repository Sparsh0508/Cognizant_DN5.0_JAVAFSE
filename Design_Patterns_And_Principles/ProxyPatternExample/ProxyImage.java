public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Image not loaded. Creating RealImage...");
            realImage = new RealImage(fileName);
        } else {
            System.out.println("Using cached image...");
        }
        realImage.display();
    }
}
