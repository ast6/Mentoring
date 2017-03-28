import demo4.OperationsOfCalculation;
import demo4.Person;

public class RunnerDemo4 {

    public static void main(String[] args) {
        //Initialize
        OperationsOfCalculation operationsOfCalculation = new OperationsOfCalculation();
        Person person = new Person();
        Person person1 = new Person("ol","ol","bla");


        //Calculation
        System.out.println(operationsOfCalculation.add(2,2));
        System.out.println(operationsOfCalculation.division(3,5));
        System.out.println(operationsOfCalculation.multiplication(1,5));
        System.out.println(operationsOfCalculation.subtraction(3,2));
        //Person

        System.out.println(person1.getName()); //comments

        person.setName("bla");
        person.setSurname("bla");
        person.setEmail("bla@com");

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getEmail());
    }

}
