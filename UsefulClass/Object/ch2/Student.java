package Object.ch2;

public class Student implements Cloneable{  //얘까지 해주어야 비로소 clone()을 호출하여 정상작동이 된다.

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return studentNum + "," + studentName + " 지금 내가 출력되었다면 이는 객체 -> toString()을 자동으로 호출하는것이다.";
    }

    @Override
    public boolean equals(Object obj) { //Object 는 모든 클래스를 상속하므로 자동타입변환.
        if (obj instanceof Student) {  //obj 의 탈을 쓰고있는 Hwang 이 원래는 Student 클래스타입이었으므로 참이다.
            Student std = (Student) obj; //강제타입변환.
            if (this.studentNum == std.studentNum) { //같은 클래스의 필드(물리적)를 비교하기위한, 너무나 당연한 절차.
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        //Jung 과 Hwang 은 다른 객체야. 그래서 해시코드도 달라. 둘은 물리적(주소값)으로 다르기때문에.
        //하지만 논리적(들어있는 값)으로 같으면 해시코드또한 같다고 해주고싶은거야. 그래서 둘다 20150115인 필드를 반환해서 비교한다.
        return this.studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

