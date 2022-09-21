public class Circle {
    int radius;
    String name;

    public Circle(String n){
        name = n;
    }

    public Circle(int r){
        radius = r;
    }

    public Circle(){ // 사용자가 만든 매개변수없는 생성자
        radius = 1;
        name = "";
    }

    public Circle(int r, String n){// 매개변수가 있는 생성자자
       radius = r;
        name = n;
    }

    public double getArea(){// 원의 면적 계산 메소드
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        //pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();// 피자의 면적 계산
        System.out.println(pizza.name + "의 면적은" + area);

        Circle donut = new Circle(); //도넛 객체 생성
        //donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);

        Circle candy = new Circle(5);
        candy.name = "candy";
        area = candy.getArea();
        System.out.println(candy.name + "의 면적은 " + area);

        Circle nana = new Circle("nana");
        nana.radius = 5;
        area = nana.getArea();
        System.out.println(nana.name + "의 면적은 " + area);

    }
}
