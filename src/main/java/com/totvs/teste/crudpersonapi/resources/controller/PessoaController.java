package com.totvs.teste.crudpersonapi.resources.controller;

import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.exceptions.CPFOUCNPJException;
import com.totvs.teste.crudpersonapi.exceptions.PessoaNaoEncontrada;
import com.totvs.teste.crudpersonapi.resources.dto.PessoaDto;
import com.totvs.teste.crudpersonapi.services.PessoaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @ApiOperation(value = "Lista todas as pessoas cadastradas")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoas encontradas")
    })
    @GetMapping
    public ResponseEntity<List<PessoaEntity>> buscarPessoas(){
        return new ResponseEntity<>(this.pessoaService.listarPessoas(), HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna uma pessoa pelo seu id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoa encontrada", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @GetMapping(path = "/{id}")
    public ResponseEntity<PessoaEntity> buscarPessoaPorId(@PathVariable Long id){
        return new ResponseEntity<>(this.pessoaService.buscarPessoaporId(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Cria uma nova pessoa")
    @ResponseStatus(code = HttpStatus.CREATED)
    @ApiResponses({
            @ApiResponse(code = 201, message = "Pessoa criada com sucesso", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @PostMapping
    public ResponseEntity<PessoaEntity> salvarPessoa(@RequestBody PessoaEntity pessoaEntity){
        return new ResponseEntity<>(pessoaService.salvarPessoa(pessoaEntity), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Remove uma pessoa pelo seu id")
    @ApiResponses( {
            @ApiResponse(code = 204, message = "Pessoa removida com sucesso"),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @DeleteMapping(path = "/{id}")
    public void excluirPessoa(@PathVariable Long id){
        this.pessoaService.excluirPessoa(id);
    }

    @ApiOperation(value = "Altera uma pessoa")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoa criada com sucesso", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "CPFOUCNPJ já Existe", response = CPFOUCNPJException.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @PutMapping("/{id}")
    public ResponseEntity<PessoaEntity> atualizarPessoa(@RequestBody PessoaEntity pessoaEntity, @PathVariable Long id) {
        return new ResponseEntity<>(this.pessoaService.atualizarPessoa(pessoaEntity,id), HttpStatus.OK);
    }


}
