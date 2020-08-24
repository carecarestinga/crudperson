package com.totvs.teste.crudpersonapi.resources.controller;

import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.exceptions.CPFOUCNPJException;
import com.totvs.teste.crudpersonapi.exceptions.PessoaNaoEncontrada;
import com.totvs.teste.crudpersonapi.resources.dto.PessoaDto;
import com.totvs.teste.crudpersonapi.resources.mapper.PessoaMapper;
import com.totvs.teste.crudpersonapi.services.PessoaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    private PessoaService pessoaService;
    private PessoaMapper pessoaMapper;
    @Autowired
    public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper) {
        this.pessoaService = pessoaService;
        this.pessoaMapper = pessoaMapper;
    }

    @ApiOperation(value = "Lista todas as pessoas cadastradas")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoas encontradas")
    })
    @GetMapping
    public ResponseEntity<List<PessoaEntity>> buscarPessoas(){
        return new ResponseEntity<>(this.pessoaService.listarPessoas(), HttpStatus.OK);
    }

    @ApiOperation(value = "Busca uma pessoa pelo seu id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoa encontrada", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> buscarPessoaPorId(@PathVariable Long id){
        return new ResponseEntity<>(this.pessoaService.buscarPessoaporId(id), HttpStatus.OK);
    }
    @ApiOperation(value = "Cria uma nova pessoa")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Pessoa criada com sucesso", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @PostMapping
    public ResponseEntity<?> salvarPessoa(@RequestBody PessoaDto pessoaDto){
        return new ResponseEntity<>(pessoaService.salvarPessoa(
                pessoaService.salvarPessoa(pessoaMapper.pessoaEntityToPessoaDto(pessoaDto))), HttpStatus.CREATED);
    }
//    public ResponseEntity<PessoaDto> salvarPessoa(@RequestBody PessoaDto pessoaDto) throws URISyntaxException {
//        PessoaEntity pessoaCriada = pessoaService.salvarPessoa(pessoaMapper.pessoaEntityToPessoaDto(pessoaDto));
//        return ResponseEntity.created(new URI("/pessoas/" + pessoaCriada.getId()))
//                .body(pessoaMapper.pessoaDtoToPessoaEntity(pessoaCriada));
//    }

    @ApiOperation(value = "Exclui uma pessoa pelo seu Id")
    @ApiResponses( {
            @ApiResponse(code = 204, message = "Pessoa removida com sucesso"),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> excluirPessoa(@PathVariable Long id){
        this.pessoaService.excluirPessoa(id);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Edita uma pessoa pelo Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Pessoa criada com sucesso", response = PessoaDto.class),
            @ApiResponse(code = 404, message = "CPFOUCNPJ já Existe", response = CPFOUCNPJException.class),
            @ApiResponse(code = 404, message = "Pessoa não encontrada", response = PessoaNaoEncontrada.class)
    })
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PessoaDto> atualizarPessoa(@RequestBody PessoaDto pessoaDto, @PathVariable Long id)
            throws URISyntaxException {
        PessoaEntity pessoaEditada = pessoaService.atualizarPessoa(pessoaMapper.pessoaEntityToPessoaDto(pessoaDto), id);
        return ResponseEntity.created(new URI("/pessoas/" + pessoaEditada.getId()))
                             .body(pessoaMapper.pessoaDtoToPessoaEntity(pessoaEditada));
    }


}
