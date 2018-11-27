package lancamento;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LancamentoController {

    @RequestMapping("/lancamentos")
    public LancamentoContaLegado lancamento() {
        ObjectMapperLancamento mapper = new ObjectMapperLancamento();
        return mapper.readJsonWithObjectMapper();
    }
}