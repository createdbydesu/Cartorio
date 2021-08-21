package br.com.cartorio.cartorio.service;

import br.com.cartorio.cartorio.domain.Cartorio;
import br.com.cartorio.cartorio.repository.CartorioRepository;
import br.com.cartorio.cartorio.to.RegistroCartorioTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Aqui estará nossa regra de negócio
@Service
public class CartorioService {

    @Autowired // Declarando uma injeção de dependência
    private CartorioRepository cartorioRepository;


    public Cartorio salvar(Cartorio cartorio) {return this.cartorioRepository.save(cartorio);}

    // Criando uma lista (array) com todos os Cartorios salvos no banco, e para exibir usamos a função
    // findAll que basicamente vai percorrer cada linha do nosso repositorio "Procurando Todos"
    public List<Cartorio> listarCartorios() {return this.cartorioRepository.findAll();}

    // Aqui iremos deletar o campo utilizando a primary key definida na nossa Tabela
    public void deletar(Long id) {this.cartorioRepository.deleteById(id);}

    // Aqui iremos atualizar o dado da tabela
    public void atualizar(RegistroCartorioTO registroCartorioTO) {
        Cartorio registroCartorioAntigo = this.cartorioRepository.findById(registroCartorioTO.getId()).get();

        final Cartorio cartorio = new Cartorio(registroCartorioTO);   // Criei um dado constante na tabela e instanciei
        registroCartorioAntigo = cartorio;                            // um objeto do "RegistroCartorioTO" para que fosse
        this.cartorioRepository.save(registroCartorioAntigo);         // possível sobrescrever o dado da tabela
    }

    public Cartorio buscarCartorioById(Long id) {return this.cartorioRepository.findById(id).get();}

}
