package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMocking() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        assertEquals("Mock Data", service.fetchData());
    }

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getDataById(anyInt()))
                .thenReturn("Employee Data");

        MyService service = new MyService(mockApi);

        assertEquals("Employee Data", service.fetchById(101));

        verify(mockApi).getDataById(anyInt());
        System.out.println("testArgumentMatching Testing done!!");
    }

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).saveData(anyString());

        MyService service = new MyService(mockApi);

        service.save("Mockito");

        verify(mockApi).saveData("Mockito");
    }

    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());

        assertEquals("Second", service.fetchData());

        assertEquals("Third", service.fetchData());
    }

    @Test
    void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();

        mockApi.saveData("ABC");

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).getData();

        order.verify(mockApi).saveData("ABC");
    }

    @Test
    void testVoidException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete Failed"))
                .when(mockApi)
                .deleteData();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.delete();
        });

        verify(mockApi).deleteData();
    }
}