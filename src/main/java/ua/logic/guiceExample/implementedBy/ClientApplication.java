package ua.logic.guiceExample.implementedBy;

import com.google.inject.*;

//https://www.journaldev.com/2403/google-guice-dependency-injection-example-tutorial
public class ClientApplication {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector();

        MyApplication app = injector.getInstance(MyApplication.class);

        app.sendMessage("Hi Pankaj", "pankaj@abc.com");
    }
}
