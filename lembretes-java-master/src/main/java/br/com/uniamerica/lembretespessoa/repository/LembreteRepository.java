package br.com.uniamerica.lembretespessoa.repository;

import br.com.uniamerica.lembretespessoa.entity.LembreteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LembreteRepository extends JpaRepository <LembreteEntity, Long> {
}
