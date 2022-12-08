package Event;

public class book {
    String title;
    String author;
    void show(){
        System.out.println(title+" "+author);
    }
    public book(){
        this(",");
        System.out.println("생성자 호출됨");
    }
    public book(String t){
        title = t; author="작자미상";
    }
    public book(String t, String a){
        title = t; author = a;
    }

    public static void main(String[] args) {
        book littlePrince = new book("어린왕자", "생텍쥐페리");
        book loveStory = new book("춘향전");
        book emptyBook = new book();
        loveStory.show();
        System.out.println(littlePrince.title+", "+littlePrince.author);
        System.out.println(loveStory.title+", "+loveStory.author);
    }
}
