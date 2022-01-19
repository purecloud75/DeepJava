package Object.ch1;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
        //Object.Book@4eec7777 였는데 toString()을 메소드재정의 하니까    데미안, 헤르만 헤세    라고 출력이 된다.
        //해석을 System.out.println(book.toString())으로 하나보다 컴파일러가.

        String str = new String("test");
        System.out.println(str); //test
        System.out.println(str.toString()); //test.  위에가 사실상 이 줄과 같은의미다. .toString()이 생략되어있는건가?
    }
}

//객체의 정보를 String 으로 바꾸어서 사용할 때 쓸 것이다. toString()을.
