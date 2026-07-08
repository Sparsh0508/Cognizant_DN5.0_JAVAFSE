package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        NetworkClient client = mock(NetworkClient.class);

        when(client.connect())
                .thenReturn("Mock Connection");

        NetworkService service = new NetworkService(client);

        assertEquals("Connected to Mock Connection",
                service.connectToServer());

        verify(client).connect();
    }
}