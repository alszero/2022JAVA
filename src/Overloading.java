class Add{
    int plus(int x, int y){
        int result = x+y;
        return  result;
    }

    double plus(double x, double y){
        double result = x+y;
        return result;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Add sum = new Add();
        System.out.println(sum.plus(10,20));
        System.out.println(sum.plus(10.0, 20.0));
    }
}
