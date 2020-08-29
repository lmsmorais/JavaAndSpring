
package br.uniso;

// eh a nossa classe de controller
// ela pega a requisicao http vinda do browser
// e processa pra devolver uma resposta

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/uniso/")
public class UnisoController {

    @GetMapping
    @RequestMapping("hello")
    public String helloWorld(){
        return "Essa foi a primeira aulam expusemos uma API GET em Java com Spring Boot.";
    }

}