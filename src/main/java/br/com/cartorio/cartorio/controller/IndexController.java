package br.com.cartorio.cartorio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



// Aqui será como o Spring vai definir automaticamente a URL que quando for requisitada irá exibir o methodo

@Controller
@RequestMapping("/")
public class IndexController {

    // Resultado do nosso metodo "invocado", mais precisamente iremos exibir nossa página principal
    @GetMapping
    public String exibir() {return "index";}

}


