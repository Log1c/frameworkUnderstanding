package ua.logic.guiceExample.withInjector;

import com.google.inject.*;

//https://www.journaldev.com/2403/google-guice-dependency-injection-example-tutorial
public class ClientApplication {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());

        MyApplication app = injector.getInstance(MyApplication.class);

        app.sendMessage("Hi Pankaj", "pankaj@abc.com");
    }
}
