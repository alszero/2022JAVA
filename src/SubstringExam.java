public class SubstringExam {
    public static void main(String[] args) {
        String strData1 = "I love You";
        String strData3;

        strData3 = strData1.substring(7); //You
        System.out.println("strData3.substirng(7)->" + strData3);
        strData3 = strData1.substring(2,5); //lov
        System.out.println("strData1.substring(2,5)->" + strData3);
    }
}
