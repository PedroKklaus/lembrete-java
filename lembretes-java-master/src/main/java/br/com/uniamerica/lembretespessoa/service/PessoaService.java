package br.com.uniamerica.lembretespessoa.service;

import br.com.uniamerica.lembretespessoa.entity.PessoaEntity;
import br.com.uniamerica.lembretespessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void validaPessoa (PessoaEntity pessoa){
        Assert.isTrue(!pessoa.getNome().equals(""), "Nome não pode ser nulo");

        pessoaRepository.save(pessoa);
    }

    public void deletaPessoa (PessoaEntity pessoa){

        pessoaRepository.delete(pessoa);
    }
}
