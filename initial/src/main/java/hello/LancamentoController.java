package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LancamentoController {

    @RequestMapping("/lancamento")
    public LancamentoContaLegado greeting() {
        ObjectMapperDemo mapper = new ObjectMapperDemo();
        return mapper.readJsonWithObjectMapper();
    }
}