package br.com.uniamerica.lembretespessoa.repository;

import br.com.uniamerica.lembretespessoa.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <PessoaEntity, Long> {

    PessoaEntity findByNome(String nome);
}
