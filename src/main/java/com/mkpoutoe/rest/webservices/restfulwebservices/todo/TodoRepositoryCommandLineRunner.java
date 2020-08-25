package com.mkpoutoe.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TodoRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo(10001,"mkpoutoe", "Get an IT job", new Date(),false);
        todoRepository.save(todo);

        todoRepository.save(new Todo(10002,"mkpoutoe", "Master NodeJS", new Date(),false));
        todoRepository.save(new Todo(10003,"mkpoutoe", "Master microservices", new Date(),false));

    }
}
