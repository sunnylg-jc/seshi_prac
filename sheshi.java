class A {
    /**
     * Displays a message from class A.
     */
    public void display() {
        System.out.println("Hello from class A");
    }
}

class B {
    /**
     * Displays a message from class B.
     */
    public void display() {
        System.out.println("Hello from class B");
    }
}

class C {
    /**
     * Displays a message from class C.
     */
    public void display() {
        System.out.println("Hello from class C");
    }
}

public class sheshi {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.display();
        b.display();
        c.display();
        System.out.println("All classes have been displayed successfully.");
        //print sum of integers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of integers from 1 to 10 is: " + sum);  
    }
}