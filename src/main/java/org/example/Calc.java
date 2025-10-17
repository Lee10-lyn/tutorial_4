package org.example;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;  // 从错误的 return a + b; 修正为 return a - b;
    }
}
