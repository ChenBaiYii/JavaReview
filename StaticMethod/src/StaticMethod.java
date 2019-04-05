public class StaticMethod {
    int id;
    int age;
    String name;

    static void some() {
        System.out.println("in some");
    }

    public void login() {
        System.out.println("in login");
        say();
        some();
        this.id = 9527;
    }


    static void say() {
        // login();  error
        // this.name = "lily";  error

    }



    public static void main(String[] args) {
        // login(); error
        // this.age = 20; error

    }


}
