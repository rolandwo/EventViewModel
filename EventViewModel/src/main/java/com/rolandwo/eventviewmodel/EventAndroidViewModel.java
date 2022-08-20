package com.rolandwo.eventviewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public abstract class EventAndroidViewModel<T> extends AndroidViewModel {

    private final MutableLiveData<ViewModelEvent<T>> event;

    protected EventAndroidViewModel(@NonNull Application application) {
        super(application);
        event = new MutableLiveData<>();
    }

    public LiveData<ViewModelEvent<T>> getEvent() {
        return event;
    }

    protected void emit(T t) {
        event.setValue(new ViewModelEvent<>(t));
    }
}
