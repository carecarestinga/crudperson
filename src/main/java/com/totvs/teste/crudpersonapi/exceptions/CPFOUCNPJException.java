package com.totvs.teste.crudpersonapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CPFOUCNPJException extends RuntimeException {
    public CPFOUCNPJException(String msg) {
        super(msg);
    }
}
