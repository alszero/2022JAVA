public class TrimExam {
    public static void main(String[] args) {
        String strData1 = "I love You ";
        String strData2;
        strData2 = strData1.trim();
        System.out.println("strData2.trim()->" + strData2);
        if(strData1.equals(strData2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
