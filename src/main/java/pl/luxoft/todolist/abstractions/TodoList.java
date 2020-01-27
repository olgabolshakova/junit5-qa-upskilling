package pl.luxoft.todolist.abstractions;

import pl.luxoft.todolist.interfaces.Obtainable;

public abstract class TodoList implements Obtainable {



    public abstract void add(TodoItem todo);

    public abstract int getLength();

    public abstract boolean delete(TodoItem todo);
}
