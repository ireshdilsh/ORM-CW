package org.example.ormhibernatefinalcw.exceptions;

public class PaymentException extends RuntimeException{
    public PaymentException(String msg){
        super(msg);
    }
}
