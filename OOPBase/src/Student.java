public class Student {
    int id;
    String name;
    int age;
    Computer compute = new Computer();

    void study() {
        System.out.println("use computer: " + compute.brand);
    }

    Student() {
    }

    public static void main(String[] args) {
        Student lily = new Student();
        lily.name = "lily";
        lily.age = 20;
        Computer c1 = new Computer();
        c1.brand = "mi";
        lily.compute = c1;
        lily.study();
    }
}

class Computer {
    String brand;
}


