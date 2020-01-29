package br.com.groger.livraria.service;

import br.com.groger.livraria.model.livrariaModel;
import br.com.groger.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class livrariaService {
    @Autowired
    private livrariaRepository repository;

    public livrariaModel cadastrarLivro(livrariaModel livro) {
        return repository.save(livro);
    }

    public Iterable<livrariaModel> listarLivros(){
        return repository.findAll();
    }

    public livrariaModel listarLivro(int id){
        Optional<livrariaModel> livro = repository.findById(id);
        return livro.get();
    }
}
