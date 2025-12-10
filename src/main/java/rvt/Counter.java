package rvt;

public class Counter {
    
    private int count;


    public Counter(int startValue) {
        this.count = startValue;
    }

    public Counter() {
        this.count = 0;
    }


    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        this.count--;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.count += increaseBy; 
        }
    }

    
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.count -= decreaseBy; 
        }
    }
}
