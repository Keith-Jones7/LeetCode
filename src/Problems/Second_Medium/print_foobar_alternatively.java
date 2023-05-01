package Problems.Second_Medium;

import java.util.concurrent.atomic.AtomicInteger;

//1115 交替打印FooBar
public class print_foobar_alternatively {
    private int n;
    AtomicInteger count = new AtomicInteger(0);
    public print_foobar_alternatively(int n) {
        this.n = n;
    }
    public void foo(Runnable printFoo) throws InterruptedException {
        for(int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            if(count.get() % 2 == 0) {
                printFoo.run();
                count.getAndIncrement();
            }
        }
    }
    public void bar(Runnable printBar) throws InterruptedException {
        for(int i = 0; i < n; i++) {
            // printBar.run() outputs "bar". Do not change or remove this line.
            if(count.get() % 2 == 1) {
                printBar.run();
                count.getAndIncrement();
            }
        }
    }
}
