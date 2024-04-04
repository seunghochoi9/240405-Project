package com.example.demo.common.command;

public interface CommandService<T> {

    String save(T t);
    String insertMany();
    String delete(T t);
}
