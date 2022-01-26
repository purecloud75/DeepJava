package NewArrayList;

public class MyArray {

    int[] intArr;  //int 타입의 배열선언
    int count; //값이 들어있는 요소의 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -1;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {  //뒤에 순차적으로 붙여서 이어나감
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int index, int num) {

        if (count >= ARRAY_SIZE) {  //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }
        if (index < 0 || index > count) { //범위를 벗어난 경우. index == count 여도 마지막인덱스 바로 다음에 추가하는거라서 문제없음
            System.out.println("insert Error");
            return;
        }
        for (int i = count - 1; i >= index; i--) {  //count -1 = 마지막인덱스이다. 추가하고자하는 인덱스까지 한칸씩 뒤로 옮긴다
            intArr[i + 1] = intArr[i];
        }
        intArr[index] = num;
        count++;
    }

    public int removeElement(int index) {
        int returnValue = ERROR_NUM;
        if (isEmpty()) {
            System.out.println("There is no element");
        }
        if (index < 0 || index > count - 1) {
            System.out.println("remove Error. 범위를 벗어남");
        }

        returnValue = intArr[index];

        for (int i = index; i < count - 1; i++) {  //i가 count -2 까지 반복이네. (count-2)+1 == 마지막인덱스.
            intArr[i] = intArr[i + 1];
        }
        count--;
        return returnValue;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getElement(int index) {
        if (index < 0 || index > count - 1) {
            System.out.println("검색 위치오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[index];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(intArr[i]+" ");
        }
    }

    public void removeAll() {
        for (int i = 0; i < count; i++) {
            intArr[i] = 0;  //만약 int 가 아닌 보통의 Object 타입이었다면 0이 아니라 null 을 할당했을것이다.
        }
        count = 0;
    }
}
