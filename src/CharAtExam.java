public class CharAtExam {
    public static void main(String[] args) {
        String str = "I love Korea";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(2)); //charAt 하는 역할: 첫번째 문자열인식을 0으로 인식함(배열이라고생각함)
        }
    }
}
