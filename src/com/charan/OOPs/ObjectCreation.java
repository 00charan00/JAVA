package com.charan.OOPs;

// Base Class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
    void show2() {
        System.out.println("Parent's show2()");
    }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show() {
        System.out.println("Child's show()");
    }

    // Additional method specific to Child
    void childSpecificMethod() {
        System.out.println("Child-specific method");
    }
}

// Driver class
public class ObjectCreation {
    public static void main(String[] args) {
        // 1. Creating an object of Parent
        Parent obj1 = new Parent();
        obj1.show();  // Output: Parent's show()

        // 2. Creating an object of Child with Parent reference
        Parent obj2 = new Child();
        obj2.show();  // Output: Child's show()
        obj2.show2();
        //obj2.childSpecificMethod();  // Error: Cannot find symbol

        // 3. Creating an object of Child with Child reference
        Child obj3 = new Child();
        obj3.show();  // Output: Child's show()
        obj3.childSpecificMethod();  // Output: Child-specific method
        obj3.show2();

        // 4. Creating an object of Parent with Child reference (Invalid in Java)
        // Child obj4 = new Parent();  // Error: incompatible types: Parent cannot be converted to Child
    }
}
