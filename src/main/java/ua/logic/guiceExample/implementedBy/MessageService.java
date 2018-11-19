package ua.logic.guiceExample.implementedBy;

import com.google.inject.*;

@ImplementedBy(EmailService.class)
public interface MessageService {
    boolean sendMessage(String msg, String receipient);
}
