package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueExeption;

public class TodoItemImpl extends TodoItem {

    private String title;
    public Boolean complete;

    public TodoItemImpl(String title) {
        super();
        this.title = title;
        complete = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String newTitle) {
        if (newTitle.isEmpty())
            throw new CannotPassEmptyValueExeption("Title cannot be empty");
        this.title = newTitle;
    }

    public boolean isCompleted() {
        return complete;
    }


    public void complete() {
        if(complete) {
            this.complete = false;
        } else{
            this.complete = true;}

    }

}
