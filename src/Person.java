public class Person {
    String name;
    String Address;
    final String Country = "Indonesia";

    Person() {

    }

    Person(String paramName) {
         name = paramName;
    }
    Person(String name, String address) {
        this.name = name;
        this.Address = address;
    }


    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
