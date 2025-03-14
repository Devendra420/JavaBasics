public class Main {
    int b = 10;
    static int c = 4;

    public Main(int b){
        this.b = b;
    }

    public Main() {

    }

    void function4() {
        String name = "bimarsha ghimire";
        String firstname = name.substring(0, 9).toUpperCase();
        System.out.println(firstname);
        String[] fullname = name.split(" ");
        System.out.println(fullname[0]);
        System.out.println(fullname[1]);
    }

    void function1(){
        int a = 5;
        System.out.println("Hello World");
        System.out.println(a);
        System.out.println(b);
    }

    void function2(){
        System.out.println(b);
        function1();
    }
    public void function1(int c , int d){

        System.out.println(c);
        System.out.println(d);
    }
    void function3()
    {
        Example obj = new Example();
        obj.display();

    }

    class Example {
        void show(Example obj) {
            System.out.println("Method is called with object reference");
        }

        void display() {
            show(this);
        }
    }
    class Test {
        public  void main(String[] args) {
            Example obj = new Example();
            obj.display();

        }
    }



}