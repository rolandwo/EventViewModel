package com.rolandwo.eventviewmodel;

public class ViewModelEvent<T> {

    private final T content;
    private boolean m_wasHandled = false;

    ViewModelEvent(T content) {
        this.content = content;
    }

    public T getContentIfNotHandled() {
        if (m_wasHandled) {
            return null;
        } else {
            m_wasHandled = true;
            return content;
        }
    }

    public interface Handler<T> {
        void onEvent(T t);
    }
}
