package ua.logic.guiceExample;

import com.google.inject.*;
import org.junit.*;

public class MyApplicationTest {
    private Injector injector;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(MessageService.class).to(MockMessageService.class);
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }

    @Test
    public void test() {
        MyApplication appTest = injector.getInstance(MyApplication.class);
        Assert.assertEquals(true, appTest.sendMessage("Hi Pankaj", "pankaj@abc.com"));
    }
}