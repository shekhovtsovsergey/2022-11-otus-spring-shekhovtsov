package ru.otus.spring.Lesson2.Service.Student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.spring.Lesson2.Model.Student;
import ru.otus.spring.Lesson2.Service.IOService.IOService;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final IOService ioService;

    @Override
    public Student getStudent() {
        ioService.outputString("Hello, please, enter your first name:");
        String firstName = ioService.inputString();
        return new Student(firstName);
    }

}
