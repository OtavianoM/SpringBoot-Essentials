package br.com.devdojo.awesome.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component // Class que vai ser scaneada pelo componetScan
//@Service -- Camada de servico
//@Repository -- Utilizada quando estiver trabalhando com DAO, ajuda na verificação de exceção
public class DateUtil {
    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }

}
