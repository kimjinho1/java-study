package generic.method;

public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double x1 = ((Number)p1.getX()).doubleValue();
        double x2 = ((Number)p2.getX()).doubleValue();
        double y1 = ((Number)p1.getY()).doubleValue();
        double y2 = ((Number)p2.getY()).doubleValue();

        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);

        return width * height;
    }
}
