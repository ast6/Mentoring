import org.junit.Test;
import sc.Steps.LogInTestSteps;

public class LoginPageTest {

    @Test
    public static void main(String[] args) throws Throwable {

        LogInTestSteps logInTestSteps = new LogInTestSteps();

        logInTestSteps.loggingSteps();
    }
}
