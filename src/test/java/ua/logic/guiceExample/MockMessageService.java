package ua.logic.guiceExample;

public class MockMessageService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String receipient) {
        return true;
    }
}
