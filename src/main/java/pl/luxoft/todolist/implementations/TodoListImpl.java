package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.abstractions.TodoList;

import java.util.ArrayList;

public class TodoListImpl extends TodoList {

  // @Override
//    public  int addItemToList() {
//
//        ArrayList<TodoList> itemList = new ArrayList<TodoList);
//        itemList.add(TodoItem);
//
//    }

    private ArrayList<TodoItem> todos;

    public TodoListImpl() {
        this.todos = new ArrayList<TodoItem>() {
        };
    }

    @Override
  public void add(TodoItem todo) {
      todos.add(todo);

  }


  @Override
//  public void delete(TodoItem todo) {
//    if (todos.size()== 1) {
//      todos.remove(todo);
//    }else
//    {
//      todos.add(todo);
//      todos.remove(todo);
//    }

  public boolean delete(TodoItem todo) {
      return todos.remove(todo);
  }

    @Override
    public int getLength() {
      return todos.size();
    }
}
