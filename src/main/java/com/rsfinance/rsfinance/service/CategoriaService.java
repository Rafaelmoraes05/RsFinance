package com.rsfinance.rsfinance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rsfinance.rsfinance.model.Categoria;
import com.rsfinance.rsfinance.repository.CategoriaRepository;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    
    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias(Long Id) { //aqui pode ser usuarioId
        return categoriaRepository.findByUsuarioId(Id);
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    public List<Categoria> listarPorUsuario(Long usuarioId) {
        return categoriaRepository.findByUsuarioId(usuarioId);
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
