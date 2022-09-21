class Person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
class Student extends Person{
    public void set(){
        //private 이기 때문에 weight = 82; 에러남
        setWeight(82); //private 멤버 접근을 위한 Setter!! 간접접근
        age = 30;
        name = "형섭리";
        height = 183;
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Student st = new Student();
        st.set();
        System.out.println(st.getWeight());
        System.out.println(st.name);
    }
}
