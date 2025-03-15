package io.github.sidneyrdm.api.restful.com.java.service.Exception;

public class NotFoundException extends BusinessException{

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }
}
