package br.com.groger.livraria.controller;

import br.com.groger.livraria.model.livrariaModel;
import br.com.groger.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarLivro(livrariaModel livro){
        service.cadastrarLivro(livro);
        return "index";
    }

    @GetMapping("/livros")
    public ModelAndView listarLivros(){
        ModelAndView pagina = new ModelAndView("listarLivros");
        Iterable<livrariaModel> livros = service.listarLivros();
        pagina.addObject("livros", livros);
        return pagina;
    }

}
