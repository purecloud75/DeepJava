package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "셜록"));
        messageQueue.offer(new Message("sendCall", "왓슨"));
        messageQueue.offer(new Message("sendWhatsUp", "허드슨"));

        System.out.println(messageQueue.peek().to);

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "에게 메일 보내야지");
                    break;
                case "sendCall":
                    System.out.println(message.to + "에게 전화 때려야지");
                    break;
                case "sendWhatsUp":
                    System.out.println(message.to + "에게 왓츠업으로 걸어야지");
                    break;
            }
        }
    }
}

//first in first out. 큐인터페이스이고 얘의 대표적인 구현클래스가 링크드리스트클래스이다.