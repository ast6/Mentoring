import sc.Steps.LogInTestSteps;
import sc.Steps.ToggleTestSteps;

public class InventoryPageActionsTest {

    public static void main(String[] args) throws Throwable {

        ToggleTestSteps toggleTestSteps = new ToggleTestSteps();
        LogInTestSteps logInTestSteps = new LogInTestSteps();

        logInTestSteps.loggingSteps();
        toggleTestSteps.leftOnOnlyCs();
    }

}
