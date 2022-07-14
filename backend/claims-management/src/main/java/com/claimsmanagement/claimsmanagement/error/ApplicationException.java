package com.claimsmanagement.claimsmanagement.error;

public class ApplicationException extends RuntimeException{
    public ApplicationException(){
        super();
    }
    public ApplicationException(String message){
        super(message);
    }
    public ApplicationException(String message,Throwable cause){
        super(message,cause);
    }
}
