package ru.otus.spring.Lesson1.Repository;

import ru.otus.spring.Lesson1.Model.Answer;
import ru.otus.spring.Lesson1.Model.Question;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class RepositoryImpl implements Repository{

    private final Map<Question, Answer> repo = new HashMap<>();
    private final String file;

    public RepositoryImpl(String file) {
        this.file = file;
    }

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
    public void print() {
        for (Question name: repo.keySet()){
            String key = name.toString();
            String value = repo.get(name).toString();
            System.out.println(key + " " + value);
        }
    }


}
