package ru.otus.spring.Lesson1;

import org.springframework.core.io.ClassPathResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoadFile {

    private final String file;

    public LoadFile(String file){
        this.file = file;
    }

    public void loadFile () throws IOException {
        InputStream resource = new ClassPathResource(file).getInputStream();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource)) ) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
