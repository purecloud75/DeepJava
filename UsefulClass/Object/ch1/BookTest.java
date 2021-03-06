package Object.ch1;

class Book {  //extends Object 가 생략되어 있다.
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {  //Object 클래스의 toString()을 오버라이딩
        return title + ", " + author;
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
        //Object.Book@4eec7777 였는데 toString()을 메소드재정의 하니까    데미안, 헤르만 헤세    라고 출력이 된다.
        //원래 toString()은 클래스이름+@+객체의 주소값을 이용한 16진수들로 이루어진 값을 반환하는데 별로 의미가없으니 오버라이딩을 한다.
        //객체는 인스턴스변수들의 집합이므로 객체를 문자열로 바꾼다는것은 인스턴스변수의 값을 문자열로 바꾼다는것과 같다. 의미가 있다.
        //메소드 재정의 이후에 해석을 System.out.println(book.toString())으로 하나보다 컴파일러가.

        String str = new String("test");
        System.out.println(str);
        //이 메소드의 매개값이 바로 출력할 내용인데, 기본타입이 아닌 객체가 들어오면, 객체의 toString()을 호출해서 리턴값을 받아 출력한다.
        //Object 의 하위클래스인 String 클래스 내에 toString() 메소드가 오버라이딩 되어있어서 바로 객체출력하면 저장된 문자열이 출력!
    }
}

//객체의 정보를 String 으로 바꾸어서 사용할 때 쓸 것이다. toString()을.
