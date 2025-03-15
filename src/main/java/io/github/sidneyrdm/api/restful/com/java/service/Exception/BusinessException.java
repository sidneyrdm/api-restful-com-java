package io.github.sidneyrdm.api.restful.com.java.service.Exception;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
