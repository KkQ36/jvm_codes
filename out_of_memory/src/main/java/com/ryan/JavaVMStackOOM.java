package com.ryan;

/**
 * @author kq
 * 2024-08-16 15:40
 * VM Args: -Xss2m
 **/
@SuppressWarnings("all")
public class JavaVMStackOOM {

    private void donotStop() {
        while (true) {}
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    donotStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
