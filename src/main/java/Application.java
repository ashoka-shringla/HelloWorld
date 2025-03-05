
public class Application {
    /**
     * This class contains a main method that allows you to manually test the Hello World lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.sayHello method should produce a value, "Hello, World!", which this class should be able to print
     * when you run the main method.
     */
    public static void main(String[] args) {
        System.out.println("This program will print out whatever is returned by the Lab.sayHello method.");
        System.out.println("The current lab output: ");
        System.out.println("Theia cloud IDE commit!")
        System.out.println("Using the ec2")

        System.out.println("Using the ec2 once again!")
        System.out.println("Using the ec2 once again again!")

        System.out.println("locally testing with the cloud services table!")
        System.out.println("ec2 testing with the cloud services table!")

        Lab hello = new Lab();
        String output = hello.sayHello();

        System.out.println(output);
    }
}
