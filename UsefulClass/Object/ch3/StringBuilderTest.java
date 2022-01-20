package Object.ch3;

public class StringBuilderTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");
        String isGood = new String("isGood");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer)); //2003749087

        buffer.append(android);
        System.out.println(System.identityHashCode(buffer)); //2003749087
        buffer.append(isGood);
        System.out.println(System.identityHashCode(buffer)); //2003749087. 기존 java 문자열 저장공간에 추가된것. 메모리 효율!

        String test = buffer.toString();  //문자열 반환메소드를 호출
        System.out.println(test); //javaandroidisGood
    }
}

//string 연결을 위해 권장되는 2가지유형 중 하나. 메모리절약가능. 단일쓰레드에서 특히 권장.
