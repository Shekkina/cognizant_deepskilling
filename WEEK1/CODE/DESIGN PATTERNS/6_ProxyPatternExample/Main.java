public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();  // loading + displaying
        image.display();  // only displaying (cached)
    }
}