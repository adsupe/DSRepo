package ultimate.java.progs;

import java.util.HashMap;
import java.util.Map;

class SingleA {

    private static Map<Class<? extends SingleA>, SingleA> instances = new HashMap<Class<? extends SingleA>, SingleA>();

    public SingleA() {
        synchronized (SingleA.class) {
            if (instances.containsKey(this.getClass())) {
                throw new IllegalStateException();
            }
            instances.put(getClass(), this);
        }
    }
    // code of class A
}

public class SingleB extends SingleA {

    public static void main(String[] args) {
        new SingleA(); // works fine. 
        new SingleA(); // causes an exception 
        new SingleB(); // works fine as this is the first instance of B 
        new SingleB(); // causes an exception.
    }
}

