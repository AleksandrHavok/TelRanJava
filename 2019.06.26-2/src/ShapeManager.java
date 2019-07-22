public class ShapeManager {
    private IShape[] arr;
    private int count=0;

    public ShapeManager() {
        arr = new IShape[10];
    }

    public boolean add(IShape s) {
        if (s == null) {
            return false;
        }
        if (count == arr.length) {
            IShape[] tmp = new IShape[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        arr[count++]=s;
        return true;
    }

    public void display() {
        double totalArea = 0;
        double totalPer=0;
        for (int i = 0; i < count; i++) {
            totalPer += arr[i].getPer();
            totalArea += arr[i].getArea();
        }
        System.out.println("Total Perimeter: "+totalPer+" Total Area: "+totalArea);
    }
}
