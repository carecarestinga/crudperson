package com.totvs.teste.crudpersonapi.resources.mapper;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;
import com.totvs.teste.crudpersonapi.domain.model.Endereco;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.domain.model.Telefone;
import com.totvs.teste.crudpersonapi.resources.dto.DependenteDto;
import com.totvs.teste.crudpersonapi.resources.dto.EnderecoDto;
import com.totvs.teste.crudpersonapi.resources.dto.PessoaDto;
import com.totvs.teste.crudpersonapi.resources.dto.TelefoneDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PessoaMapper {

    /**             DTO para ENTITY´s              **/

    public PessoaEntity pessoaEntityToPessoaDto(PessoaDto pessoaDto){
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setId(pessoaDto.getId());
        pessoaEntity.setNome(pessoaDto.getNome());
        pessoaEntity.setApelido(pessoaDto.getApelido());
        pessoaEntity.setCpfOuCnpj(pessoaDto.getCpfOuCnpj());
        List enderecosDto = new ArrayList();
        for (EnderecoDto enderecoDto: pessoaDto.getEnderecos()) {
            Endereco endereco= new Endereco();
//            endereco.setId_endereco(enderecoDto.getId_endereco());
            endereco.setTipo(enderecoDto.getTipo());
            endereco.setTipoLogradouro(enderecoDto.getTipoLogradouro());
            endereco.setNomeLogradouro(enderecoDto.getNomeLogradouro());
            endereco.setNumeroLogradouro(enderecoDto.getNumeroLogradouro());
            endereco.setComplemento(enderecoDto.getComplemento());
            endereco.setCep(enderecoDto.getCep());
            endereco.setBairro(enderecoDto.getBairro());
            endereco.setCidade(enderecoDto.getCidade());
            endereco.setEstado(enderecoDto.getEstado());
            endereco.setPais(enderecoDto.getPais());
            enderecosDto.add(endereco);
        }
        pessoaEntity.setEnderecos(enderecosDto);
        pessoaEntity.setProfissão(pessoaDto.getProfissão());
        pessoaEntity.setSalario(pessoaDto.getSalario());
        List dependentesDto = new ArrayList();
        for (DependenteDto dependenteDto : pessoaDto.getDependentes()) {
            Dependente dependente = new Dependente();
//            dependente.setId_dependente(dependenteDto.getId_dependente());
            dependente.setNomeCompleto(dependenteDto.getNomeCompleto());
            dependente.setTipoDependente(dependenteDto.getTipoDependente());
            dependentesDto.add(dependente);
        }
        pessoaEntity.setDependentes(dependentesDto);
        pessoaEntity.setDataNascimento(pessoaDto.getDataNascimento());
        List telefonesDto = new ArrayList();
        for (TelefoneDto telefoneDto : pessoaDto.getTelefones()) {
            Telefone telefone = new Telefone();
//            telefone.setId_telefone(telefoneDto.getId_telefone());
            telefone.setCodigoPais(telefoneDto.getCodigoPais());
            telefone.setDdd(telefoneDto.getDdd());
            telefone.setNumero(telefoneDto.getNumero());
            telefone.setTipo(telefoneDto.getTipo());
            telefonesDto.add(telefone);
        }
        pessoaEntity.setTelefones(telefonesDto);
        return pessoaEntity;
    }


    /**              ENTITY´s para DTO                   **/

    public PessoaDto pessoaDtoToPessoaEntity(PessoaEntity pessoaEntity){
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setId(pessoaEntity.getId());
        pessoaDto.setNome(pessoaEntity.getNome());
        pessoaDto.setApelido(pessoaEntity.getApelido());
        pessoaDto.setCpfOuCnpj(pessoaEntity.getCpfOuCnpj());
        List enderecos = new ArrayList();
        for (Endereco endereco: pessoaEntity.getEnderecos()) {
            EnderecoDto enderecoDto = new EnderecoDto();
//            enderecoDto.setId_endereco(endereco.getId_endereco());
            enderecoDto.setTipo(endereco.getTipo());
            enderecoDto.setTipoLogradouro(endereco.getTipoLogradouro());
            enderecoDto.setNomeLogradouro(endereco.getNomeLogradouro());
            enderecoDto.setNumeroLogradouro(endereco.getNumeroLogradouro());
            enderecoDto.setComplemento(endereco.getComplemento());
            enderecoDto.setCep(endereco.getCep());
            enderecoDto.setBairro(endereco.getBairro());
            enderecoDto.setCidade(endereco.getCidade());
            enderecoDto.setEstado(endereco.getEstado());
            enderecoDto.setPais(endereco.getPais());
            enderecos.add(enderecoDto);
        }
        pessoaDto.setEnderecos(enderecos);
        pessoaDto.setProfissão(pessoaEntity.getProfissão());
        List dependentes = new ArrayList();
        for (Dependente dependente: pessoaEntity.getDependentes()) {
            DependenteDto dependenteDto = new DependenteDto();
//            dependenteDto.setId_dependente(dependente.getId_dependente());
            dependenteDto.setNomeCompleto(dependente.getNomeCompleto());
            dependenteDto.setTipoDependente(dependente.getTipoDependente());
            dependentes.add(dependenteDto);
        }
        pessoaDto.setDependentes(dependentes);
        pessoaDto.setSalario(pessoaEntity.getSalario());
        pessoaDto.setDataNascimento(pessoaEntity.getDataNascimento());
        List telefones = new ArrayList();
        for (Telefone telefone: pessoaEntity.getTelefones()) {
            TelefoneDto telefoneDto = new TelefoneDto();
//            telefoneDto.setId_telefone(telefone.getId_telefone());
            telefoneDto.setCodigoPais(telefone.getCodigoPais());
            telefoneDto.setDdd(telefone.getDdd());
            telefoneDto.setNumero(telefone.getNumero());
            telefoneDto.setTipo(telefone.getTipo());
            telefones.add(telefoneDto);
        }
        pessoaDto.setTelefones(telefones);
        return pessoaDto;
    }
}
