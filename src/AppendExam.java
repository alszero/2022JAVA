public class AppendExam {
    public static void main(String[] args) {
        //서로 주소값을 전달하기 때문
        StringBuffer sb1 = new StringBuffer("JAVA Programming");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null; //문자열은 반드시 초기화 해야 한다.
        StringBuffer str2 = null;
        str1 = sb1.append(" Project"); //sb1 = JAVA Programming Project
        System.out.println("str1 = " + str1);
        str2 = sb1.append(sb2); //str2 = JAVA Programming Project Project
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        System.out.println("str1 = " + str1); // append()메소드는 주소값을 전달
        System.out.println("str2 = " + str2);
        System.out.println();
    }
}
