package demo.observer;

public interface Observer<T> {
    void update(T model);
}
