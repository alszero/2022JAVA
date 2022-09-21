class Shape{ // 상위 클래스 슈퍼클래스 부모클래스
     public Shape next;

    public Shape() {
        next = null;
    }

    public void draw(){
        System.out.println("shape");
    }
}

class Line extends Shape {  //Shape p = line(업캐스팅) < --- Line line = new Line()
    @Override //@ <-- 컴파일러에게 다는 주석
    public void draw() {
        System.out.println("Line");
    }
}
public class OverridingEx {
    static void paint(Shape p){
        p.draw();   //line draw()
    }

    public static void main(String args[]){
        Line line = new Line();
        Circle1 circle = new Circle1();
        Rect rect = new Rect();
        Triangle tri = new Triangle();
        paint(line);
        paint(circle);
        paint(rect);
        paint(tri);
    }
}

//Circle1
class Circle1 extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
//Rext
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
//Triangle
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

