package com.rsfinance.rsfinance.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsfinance.rsfinance.model.TipoTransacao;
import com.rsfinance.rsfinance.model.Transacao;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByUsuarioId(Long usuarioId);
    List<Transacao> findByTipo(TipoTransacao tipo);

}
