package br.com.cartorio.cartorio.controller;

import br.com.cartorio.cartorio.domain.Cartorio;
import br.com.cartorio.cartorio.service.CartorioService;
import br.com.cartorio.cartorio.to.RegistroCartorioTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/cartorios")
public class CartorioController {

    @Autowired
    private CartorioService cartorioService;

    // Listar Cartorios
    @GetMapping
    public String listarCartorio(Model model){                                         // Aqui estamos utilizando a
        final List<Cartorio> listarCartorio = this.cartorioService.listarCartorios();   // interface Model para possibilitar
        model.addAttribute("listarCartorio", listarCartorio);                        // que a interface de usuário possa
        return "cartorios";                                                             // ser concretizada.
    }

    // Cadastrar novo Cartório
    @GetMapping("/registroCartorio")
    public String exibirRegistroCartorio(Model model){return "registroCartorio";} // Interface que liga com o registroCartorio.html

    @PostMapping("/registroCartorio")
    public String salvarRegistroCartorio(@Valid RegistroCartorioTO registroCartorioTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return exibirRegistroCartorio(model);
        }

        final Cartorio cartorio = new Cartorio(registroCartorioTO);
        this.cartorioService.salvar(cartorio);
        return "redirect:/cartorios";
    }


    // Atualizar Cartorios
    @GetMapping("/atualizarCartorio/{id}")
    public String atualizarRegistroCartorio(@PathVariable("id")Long id, Model model){ // PathVariable foi usado para fazer
        final Cartorio cartorio = this.cartorioService.buscarCartorioById(id);        // a manipulação das variáveis passadas
        model.addAttribute("cartorio", cartorio);                                  // por parâmetro via URL
        model.addAttribute("atualizarRegistro", true);
        return "registroCartorio";
    }

    @PostMapping("/atualizarCartorio")                                                          // Aqui usamos o verbo "POST"
    public String atualizarRegistroCartorio(RegistroCartorioTO registroCartorioTO){     // para realizar as atualizações
        this.cartorioService.atualizar(registroCartorioTO);                             // do nosso banco
        return "redirect:/cartorios";                                                    //
    }

    // Deletar Cartorio
    @GetMapping("/deletarCartorio/{id}")
    public String deletarRegistroCartorio(@PathVariable("id") Long id){
        this.cartorioService.deletar(id);
        return "redirect:/cartorios";
    }
}
