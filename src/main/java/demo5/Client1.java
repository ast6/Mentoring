package demo5;

import java.time.LocalDateTime;

public class Client1 implements Observer {

    private LocalDateTime time;
    private Subject subject;

    public Client1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void notification() {
        System.out.println("Time is updated. New time of Client1 is " + time);
    }

    @Override
    public void update() {
        this.time = subject.getTime();
        notification();
    }
}
