package ua.logic.guiceExample.withInjector;

import com.google.inject.*;

public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
        //bind the service to implementation class
        //bind(MessageService.class).to(EmailService.class);

        //bind MessageService to Facebook Message implementation
        bind(MessageService.class).to(EmailService.class);
    }
}
