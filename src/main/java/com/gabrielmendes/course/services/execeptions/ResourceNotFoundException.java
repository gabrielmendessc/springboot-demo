package com.gabrielmendes.course.services.execeptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id "+id);
    }

}
