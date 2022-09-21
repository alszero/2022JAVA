class Point2{
    private int x, y;

    public Point2(){
       this.x=this.y=0;
    }
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
class ColorP extends Point2{
    private String color;

    public ColorP(int x, int y, String color) {
        super(x, y); //Point2의 생성자를 호출
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
public class SuperEx {
    public static void main(String args[]){
        ColorP cp = new ColorP(5,6, "blue");
        cp.showColorPoint();
    }
}
