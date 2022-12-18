package ru.otus.spring.Lesson2.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import ru.otus.spring.Lesson2.Model.Answer;
import ru.otus.spring.Lesson2.Model.Question;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Component
@PropertySource("classpath:application.properties")
public class RepositoryImpl implements Repository{

    private final Map<Question, Answer> repo = new HashMap<>();
    @Value("${resourceName}")
    private String file;



    @Override
    public Map<Question, Answer> loadCsv() {

        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(getClass().getResourceAsStream("/" + file)))) {
            while(reader.ready()) {
                String s = reader.readLine();
                String[] arr = s.split(";");
                Question question = new Question(arr[0]);
                Answer answer = new Answer(arr[1]);
                repo.put(question, answer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return repo;
    }


    @Override
    public Map<Question, Answer> getRepo() {
        return repo;
    }


}
