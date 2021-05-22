package shaolim.learn.designpattern.prototype;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7, "Blue", 8, 10);
        Circle circle = new Circle(6, 9, "Green", 45);

        BundleShapeCache cache = new BundleShapeCache();
        cache.put("blue_rectangle", rectangle);
        cache.put("green_circle", circle);

        Shape blueRectangle = cache.get("blue_rectangle");
        Shape greenCircle = cache.get("green_circle");

        if (blueRectangle != rectangle) {
            System.out.println("Two rectangles is different object");
            if (blueRectangle.equals(rectangle)) {
                System.out.println("Two rectangles is identical");
            } else {
                System.out.println("Two rectangles is not identical");
            }
        } else {
            System.out.println("Two rectangles is same object");
        }

        if (greenCircle != circle) {
            System.out.println("Two circles is different object");
            if (greenCircle.equals(circle)) {
                System.out.println("Two circles is identical");
            } else {
                System.out.println("Two circles is not identical");
            }
        } else {
            System.out.println("Two circles is same object");
        }
    }
}
