public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Fitri");
        employee.sayHello("Budi");

        employee = new Manager("anisa");
        employee.sayHello("away");

        employee = new VicePresident("Yuyun");
        employee.sayHello("aceng");

        //  call Method polymorphism
        sayHello(new Employee("Yuyun"));
        sayHello(new Manager("Fitri"));
        sayHello(new VicePresident("Nazwar"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name); // method polymorphism
    }
}
