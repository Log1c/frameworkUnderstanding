package ua.logic.javaRx;

import rx.Observable;

//implement never, empty, range using only create(...)
public class Page54 {
    public static void main(String[] args) {
//        example();
        never();
        empty();
        range(1, 4);
    }

    private static void never() {
        Observable<Integer> ints = Observable.create(subscriber -> {
        });

        ints.subscribe(i -> log("item: " + i));
    }

    private static void range(int start, int inc) {
        Observable<Integer> ints = Observable.create(subscriber -> {
            for (int i = start; i < start + inc; i++) {
                subscriber.onNext(i);
            }

            subscriber.onCompleted();
        });

        ints.subscribe(i -> log("item: " + i));
    }

    private static void empty() {
        Observable<Integer> ints = Observable.create(subscriber -> {
            subscriber.onCompleted();
        });

        ints.subscribe(i -> log("item: " + i));
    }

    private static void example() {
        Observable<Integer> ints = Observable.create(subscriber -> {
            subscriber.onNext(5);
            subscriber.onNext(6);
            subscriber.onNext(7);
            subscriber.onCompleted();
        });

        ints.subscribe(i -> log("item: " + i));
    }

    private static void log(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}