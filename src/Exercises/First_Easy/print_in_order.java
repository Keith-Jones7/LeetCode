package Exercises.First_Easy;
//1114 按序打印
public class print_in_order {
    private volatile int order;
    public print_in_order() {
        order = 1;
    }
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        order = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (order != 2) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        order = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (order != 3) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
