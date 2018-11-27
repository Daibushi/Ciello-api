package lancamento;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
 import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ObjectMapperLancamento {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public LancamentoContaLegado readJsonWithObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        LancamentoContaLegado lanc = new LancamentoContaLegado();
        try{
        	lanc = objectMapper.readValue(new File("lancamento-conta-legado.json"), LancamentoContaLegado.class);
        	logger.info(lanc.toString());
        }catch(Exception e){
        	System.out.println(e);
        }
        
        return lanc;
    }
 
}