package lancamento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

     @RequestMapping("/")
     public String home(){
         return "Cielo Lancamento-conta-legado API. Acesse a URL /lancamentos para receber os dados";
     }
 }