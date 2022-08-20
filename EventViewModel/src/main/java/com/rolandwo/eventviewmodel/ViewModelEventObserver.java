package com.rolandwo.eventviewmodel;

import androidx.lifecycle.Observer;

public class ViewModelEventObserver<T> implements Observer<ViewModelEvent<? extends T>> {

    private final ViewModelEventHandler<T> eventHandler;

    public ViewModelEventObserver(ViewModelEventHandler<T> eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public void onChanged(ViewModelEvent<? extends T> event) {
        if (event != null) {
            T result = event.getContentIfNotHandled();
            if (result != null && eventHandler != null) {
                eventHandler.onEvent(result);
            }
        }
    }
}
