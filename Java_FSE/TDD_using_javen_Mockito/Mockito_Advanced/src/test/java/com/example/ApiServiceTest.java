package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {

        RestClient client = mock(RestClient.class);

        when(client.getResponse())
                .thenReturn("Mock Response");

        ApiService service = new ApiService(client);

        assertEquals("Fetched Mock Response",
                service.fetchData());

        verify(client).getResponse();
    }
}