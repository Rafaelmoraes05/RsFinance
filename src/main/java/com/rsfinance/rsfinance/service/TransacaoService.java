package com.rsfinance.rsfinance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rsfinance.rsfinance.model.TipoTransacao;
import com.rsfinance.rsfinance.model.Transacao;
import com.rsfinance.rsfinance.repository.TransacaoRepository;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public List<Transacao> listarPorUsuario(Long usuarioId) {
        return transacaoRepository.findByUsuarioId(usuarioId);
    }
    
    public List<Transacao> listarTransacoes(Long Id) {
        return transacaoRepository.findAll();
    }
    
    public List<Transacao> listarPorTipo(TipoTransacao tipo) {
        return transacaoRepository.findByTipo(tipo);
    }
    
    public Optional<Transacao> buscarPorId(Long id) {
        return transacaoRepository.findById(id);
    }
    
    public Transacao salvar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }
    
    public void deletar(Long id) {
        transacaoRepository.deleteById(id);
    }
}