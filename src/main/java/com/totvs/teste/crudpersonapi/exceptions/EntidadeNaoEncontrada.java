package com.totvs.teste.crudpersonapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontrada extends RuntimeException {

    public EntidadeNaoEncontrada(String msg) {
        super(msg);
    }

}
