package com.rpoladia.thread.lock.deadlock;

public class Task1 implements Runnable {
    private Pen pen;

    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}
