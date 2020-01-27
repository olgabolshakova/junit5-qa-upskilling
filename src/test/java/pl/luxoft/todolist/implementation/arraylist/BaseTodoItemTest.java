package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.implementations.TodoItemImpl;

public class BaseTodoItemTest {

    TodoItem todo;
    String todoTitle;

    @BeforeEach
    public void setUp(){
        todoTitle = "Get familiar with Jnit 5 user guade";
        todo = new TodoItemImpl(todoTitle);
    };

    @BeforeAll
    public static void setUpAll() {

    }

    @AfterEach
    public void tearDown() {

    }

    @AfterAll
    public static void tearDownAll() {

    }


}
