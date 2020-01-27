package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.abstractions.TodoList;
import pl.luxoft.todolist.implementations.TodoItemImpl;
import pl.luxoft.todolist.implementations.TodoListImpl;
import pl.luxoft.todolist.matchers.IsEmptyTodoList;

import static org.hamcrest.MatcherAssert.assertThat;
import static pl.luxoft.todolist.matchers.IsEmptyTodoList.isAnEmptyTodoList;

public class TodoListTest extends BaseTodoListTest {

    TodoList todoList;
    TodoItem todo = new TodoItemImpl("Task 1");

    @BeforeEach

    public void setUp(){
        todoList = new TodoListImpl();
    }

    @Test
    public void todCanBeAddedToList(){

        todoList.add(todo);
        Assertions.assertEquals(1,todoList.getLength());

    }

    @Test
    public void todCanBeDeletedFromList(){
    todoList.add(todo);
    todoList.delete(todo);
   // Assertions.assertTrue(todoList.delete(todo));
    assertThat(todoList, isAnEmptyTodoList());

}
}
