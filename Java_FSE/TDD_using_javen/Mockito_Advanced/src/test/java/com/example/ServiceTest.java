package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        Repository repository = mock(Repository.class);

        when(repository.getData())
                .thenReturn("Mock Data");

        Service service = new Service(repository);

        String result = service.processData();

        assertEquals("Processed Mock Data", result);

        verify(repository).getData();
    }
}