package ua.logic.mockitoExample;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.doReturn;

public class MyClassTest {
    @Mock
    private MyClass myClass;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test1() {
        // would work fine
        doReturn("test").when(myClass).anotherMethodInClass();
    }

    @Test
    public void test2() {
        // would throw a NullPointerException
//        when(myClass.anotherMethodInClass()).thenReturn("test");
        String a = myClass.anotherMethodInClass();
        System.out.println(a);
    }
}
