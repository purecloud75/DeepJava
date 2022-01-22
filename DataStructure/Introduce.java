import java.util.ArrayList;
import java.util.LinkedList;

public class Introduce {
    public static void main(String[] args) {


    }
}
/*
int[] arr1 = new int[4];
int[] arr2 = new int[]{10, 20, 30, 40};
String[] arr3 = {"Jung", "Nam"};
과 같은 배열과, 리스트가 존재한다. 위와 같이 배열은 3가지 방식으로 선언이 된다!
배열은 arr2[2] = 100;이라 했을 때,기존의 30를 100으로 덮어씌우기 때문에 여전히 배열의 크기는 4이다.
각 데이터에 대한 인덱스는 여전히 그대로이다. 무슨말이냐면 arr2[3]은 여전히 40인 것이다. 주민번호겉음.

하지만
ArrayList arr22 = new ArrayList<>();
LinkedList arr11 = new LinkedList<>();
과 같은 리스트는 다르다. 중간에 삽입을 하거나 삭제를 하면 한 칸씩 밀려나거나 채워야하기에 빈틈없이 연결성이 유지되는 장점이 있다.
유동적인 크기설정 가능은 덤. 이렇게 자바는 배열리스트와 연결리스트, 2개의 리스트를 지원한다.
배열리스트는 데이터가 저장되어있는 인덱스를 안다면 빠르게 조회가 가능
연결리스트는 데이터를 빠르게 추가 및 삭제가 가능. 사용자는 그때그때 더 효율적인 자료구조를 직접 택해야 한다.
*/



