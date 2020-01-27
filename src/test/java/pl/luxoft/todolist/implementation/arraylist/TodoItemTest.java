package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueExeption;
import pl.luxoft.todolist.implementations.TodoItemImpl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.notNullValue;


@Tag("all")
    public class TodoItemTest extends BaseTodoItemTest {

        @Test
        public void todoItemNeedToHaveATitle() {
           TodoItem todo = new TodoItemImpl("This is our first todo item");
            assertThat(todo.getTitle(), is(notNullValue())); //assertion from hamcrest
            //Assertions.assertNotNull(todo.getTitle()); //usual assertion
        }

        @Test
        //@Disabled
        public void todoItemTitileAsTheSameAsAssignedWhileCreating() {
            TodoItem todo = new TodoItemImpl(todoTitle);
            Assertions.assertEquals(todoTitle, todo.getTitle());

        }

      @ParameterizedTest
      @CsvFileSource(resources = "/todos.csv")
      public void importTodoFromCsvFileTest(String todoItemName){
          TodoItem todo = new TodoItemImpl(todoItemName);
          assertThat(todoItemName, equalToIgnoringCase(todo.getTitle()));

      }

        @Test
        public void todoListTitleCanBeChanged() {
            String newTitle = "New todo title name";
            todo.setTitle(newTitle);
            Assertions.assertEquals(newTitle, todo.getTitle());

        }

        @Test
        public void todoItemCannotHaveEmptyTitle() {
            Assertions.assertThrows(CannotPassEmptyValueExeption.class, ()->todo.setTitle(""));
        }

        @Test
        public void todoItemCanBeMarkedCompleted(){
            todo.complete();
            Assertions.assertTrue(todo.isCompleted());
        }

        @Test
        public void todoItemIsNotCompletedAfterCreation(){
            Assertions.assertFalse(todo.isCompleted());
        }

        @Test
        public void todoItemIsNotCompletedAfterTogging(){
            todo.complete();
            todo.complete();
            Assertions.assertFalse(todo.isCompleted());
        }



    }
