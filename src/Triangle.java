public class Triangle {
    int a;
    int b;
    int c;

    public double area() {
        double s = (a + b + c) / 2.0;
        return  (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
