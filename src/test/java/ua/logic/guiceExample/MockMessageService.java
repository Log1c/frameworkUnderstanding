package ua.logic.guiceExample;

import ua.logic.guiceExample.implementedBy.*;

public class MockMessageService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String receipient) {
        return true;
    }
}
