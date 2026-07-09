package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        MyFileReader reader = mock(MyFileReader.class);
        MyFileWriter writer = mock(MyFileWriter.class);

        when(reader.read())
                .thenReturn("Mock File Content");

        FileService service = new FileService(reader, writer);

        String result = service.processFile();

        assertEquals("Processed Mock File Content", result);

        verify(reader).read();

        verify(writer)
                .write("Processed Mock File Content");
    }
}