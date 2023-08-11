package br.com.uniamerica.lembretespessoa.service;

import br.com.uniamerica.lembretespessoa.entity.LembreteEntity;
import br.com.uniamerica.lembretespessoa.repository.LembreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class LembreteService {

    @Autowired
    private LembreteRepository lembreteRepository;

    public void validaLembrete (LembreteEntity lembrete){
        Assert.isTrue(!lembrete.getNomeLembrete().equals(""), "Nome do lembrete não pode ser nulo");

        lembreteRepository.save(lembrete);
    }

    public void deletaLembrete (LembreteEntity lembrete){
        lembreteRepository.delete(lembrete);
    }
}
