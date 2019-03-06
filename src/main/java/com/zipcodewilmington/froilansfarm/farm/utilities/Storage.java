package com.zipcodewilmington.froilansfarm.farm.utilities;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {
    private List<T> storedObjects = new ArrayList<>();

    public void store(T object) {
        if(object != null) {
            storedObjects.add(object);
        }
    }

    public List<T> get(int numberToGet) {
        List<T> getList = new ArrayList<>();
        for (int i = 0; i < numberToGet; i++) {
            getList.add(storedObjects.remove(getCount()));
        }
        return null;
    }

    public List<T> getAll() {
        return storedObjects;
    }

    public int getCount() {
        return storedObjects.size();
    }

    public T[] getArray(T[] array) {
        return storedObjects.toArray(array);
    }

    public void removeAll() {
        storedObjects.clear();
    }


    private static Storage anonymous = new Storage() {};

    public static Storage getAnonymous() {
        return anonymous;
    }
}
