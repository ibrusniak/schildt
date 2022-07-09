
public class WhatWasBeforeGenerics2 {

    public static void main(String[] args) {
        
        Generic raw1 = new Generic("foo");
        raw1.printInfo();
        Generic<String> raw2 = new Generic("bar");
        raw2.printInfo();
        raw1 = raw2;
        raw1.printInfo();
        Generic raw3 = raw2;
        Generic<?> raw4 = raw2;
    }
}

class Generic<T> {

    private T t;

    public Generic(T t) {
        this.t = t;
    }

    public void printInfo() {
        System.out.println(t.getClass().getName() + " : " + t);
    }
}

