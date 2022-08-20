package com.rolandwo.eventviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventViewModel<T> extends ViewModel {

    private final MutableLiveData<ViewModelEvent<T>> event;

    protected EventViewModel() {
        event = new MutableLiveData<>();
    }

    public LiveData<ViewModelEvent<T>> getEvent() {
        return event;
    }

    protected void emit(T t) {
        event.setValue(new ViewModelEvent<>(t));
    }
}
