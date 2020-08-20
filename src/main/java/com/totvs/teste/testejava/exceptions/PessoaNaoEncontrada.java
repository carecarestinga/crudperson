package com.totvs.teste.testejava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNaoEncontrada extends RuntimeException {

    public PessoaNaoEncontrada(String msg) {
        super(msg);
    }

}
