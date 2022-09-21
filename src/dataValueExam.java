import java.util.StringTokenizer;

public class dataValueExam {
    public static void main(String[] args) {
        //String == 철가방  ==> double == wrrap랩을 벗겨야지 사용가능!!
        String line;
        String tmpStr = "hong 용산구 10.5 20.5";
        StringTokenizer parse = new StringTokenizer(tmpStr); // 띄어쓰기를 기준으로 Token 생성
        String name;
        String address;
        double math;
        double english;
        double total;
        double avg;
        // index 값이 없는 배열이라고 생각!!
        name = parse.nextToken();
        address = parse.nextToken();
        //valueOf가 String -> Wrapper
        //doubleValue Wrapper -> 기본타입
        math = Double.valueOf(parse.nextToken()).doubleValue();
        english = Double.valueOf(parse.nextToken()).doubleValue();
        total = math + english;
        avg = total/2.0;
        System.out.println(name + "\t" + address + "\t" + math + "\t" +
                english + "\t" + total + "\t" + avg);
    }
}
