package ua.logic.javaRx;

import rx.Observable;
import rx.Subscriber;
import ua.logic.javaRx.entity.Tweet;

import java.util.ArrayList;
import java.util.List;

//Нуркевич Т., Кристенсен Б. - Реактивное программирование с применением RxJava - 2017
public class Page51 {
    public static void main(String[] args) {
        List<Tweet> iterable = new ArrayList<Tweet>();
        Observable<Tweet> tweets = Observable.from(iterable);
        for (int i = 0; i < 20; i++) {
            iterable.add(new Tweet("" + i));
        }

        Subscriber<Tweet> subscriber = new Subscriber<Tweet>() {
            int i = 10;
            public void onCompleted() {
                System.out.println("finish");
            }

            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            public void onNext(Tweet tweet) {
                if (i <= 0) {
                    unsubscribe();
                }
                System.out.println(tweet.getText());
                i--;
            }
        };
        System.out.println("start");
        tweets.subscribe(subscriber);
    }
}
