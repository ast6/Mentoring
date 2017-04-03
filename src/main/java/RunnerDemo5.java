import demo5.Client1;
import demo5.Client2;
import demo5.Subject;

import java.time.LocalDateTime;

public class RunnerDemo5 {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Client1 client1 = new Client1(subject);
        Client2 client2 = new Client2(subject);

        subject.setTime(LocalDateTime.now());
        subject.setTime(LocalDateTime.now());



    }
}
