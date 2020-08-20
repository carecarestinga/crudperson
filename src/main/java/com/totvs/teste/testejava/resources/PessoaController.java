package com.totvs.teste.testejava.resources;

import com.totvs.teste.testejava.domain.model.Pessoa;
import com.totvs.teste.testejava.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> buscarPessoas(){
        return new ResponseEntity<>(this.pessoaService.listarPessoas(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pessoa> buscarPessoaPorId(@PathVariable Long id){
        return new ResponseEntity<>(this.pessoaService.buscarPessoaporId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvarPessoa(@RequestBody Pessoa pessoa){
        return new ResponseEntity<>(pessoaService.salvarPessoa(pessoa), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public void excluirPessoa(@PathVariable Long id){
        this.pessoaService.excluirPessoa(id);
    }

    @PutMapping
    public ResponseEntity<Pessoa> atualizaPessoa(@RequestBody Pessoa pessoa, @PathVariable Long id){
        return new ResponseEntity<>(this.pessoaService.atualizarPessoa(pessoa,id), HttpStatus.OK);
    }


}
