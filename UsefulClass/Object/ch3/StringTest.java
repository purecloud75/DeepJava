package Object.ch3;

public class StringTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(java);
        java = java.concat(android);
        //java 와 android 를 합쳐서 저장할 수 있는 또다른 메모리공간을 잡아서 그 주소값을 할당하기에 총 3개의 공간이 생긴다.
        //메모리낭비의 우려가 있기에, 또 문자열을 한번 할당하면 final 이기때문에 다시 못바꾼다. 즉 새로운 메모리를 잡아야하는 단점이..
        System.out.println(java); //javaandroid
    }
}
