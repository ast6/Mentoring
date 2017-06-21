package mentoring.demo5;

import java.time.LocalDateTime;

public class Client2 implements Observer {

    private LocalDateTime time1;
    private Subject subject;

    public Client2(Subject subject1) {
        this.subject = subject1;
        subject.attach(this);
    }

    public void notification() {
        System.out.println("Time is updated. New time of Client2 is " + time1);
    }

    @Override
    public void update() {
        this.time1 = subject.getTime();
        notification();
    }
}
