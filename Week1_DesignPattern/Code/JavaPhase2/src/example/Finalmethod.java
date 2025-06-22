package example;

class Parent {
    final void showMessage() {
        System.out.println("This is a final method from the Parent class.");
    }
}

class Child extends Parent {
   
}

public class Finalmethod {
    public static void main(String[] args) {
        Parent p = new Child();
        p.showMessage();
    }
}
