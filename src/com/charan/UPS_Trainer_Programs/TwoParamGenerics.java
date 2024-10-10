package com.charan.UPS_Trainer_Programs;

class TwoParamGenerics<K, V> {
    private K keyval;
    private V val;

    // Default constructor
    TwoParamGenerics() {
        // Initialize with default values (null in this case)
        this.keyval = null;
        this.val = null;
    }

    // Parameterized constructor
    TwoParamGenerics(K keyval, V val) {
        this.keyval = keyval;
        this.val = val;
    }

    // Getter for keyval
    public K getKeyval() {
        return keyval;
    }

    // Setter for keyval
    public void setKeyval(K keyval) {
        this.keyval = keyval;
    }

    // Getter for val
    public V getVal() {
        return val;
    }

    // Setter for val
    public void setVal(V val) {
        this.val = val;
    }

    public static void main(String[] args) {
        // Create an instance of the class with specific types
        TwoParamGenerics<String, Integer> pair = new TwoParamGenerics<>("Key", 123);

        // Print the key and value
        System.out.println("Key: " + pair.getKeyval());
        System.out.println("Value: " + pair.getVal());
    }
}
