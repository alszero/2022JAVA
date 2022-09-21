



public class EqualExam {
    public static void main(String[] args) {
        String str1 = "mirim";
        String str2 = "mirim";
        String str3 = new String("highschool");
        String str4 = new String("highschool");

        //== -> 주소비교연산자 equals()문자열의 내용이 같은지를 비교하는 연산자
        if(str1 == str2) System.out.println("주소 같다");
        else System.out.println("주소 다르다");
        if(str3 == str4) System.out.println("주소 같다");
        else System.out.println("주소 다르다");
        if(str1.equals(str2)) System.out.println("내용 같다");
        else System.out.println("내용 다르다");
        if(str3.equals(str4)) System.out.println("내용 같다");
        else System.out.println("내용 다르다");
    }
}
