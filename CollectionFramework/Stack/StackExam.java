package Stack;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {

        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(500));

        System.out.println("맨 위에있는 동전 바라보기만 하자: " + coinBox.peek().getValue());

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}

// last out first in. peek()은 바라보기만하고, pop()은 실제로 빼낸다. 스택클래스