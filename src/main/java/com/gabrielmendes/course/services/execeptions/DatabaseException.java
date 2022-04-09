package com.gabrielmendes.course.services.execeptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg){
        super(msg);
    }

}
