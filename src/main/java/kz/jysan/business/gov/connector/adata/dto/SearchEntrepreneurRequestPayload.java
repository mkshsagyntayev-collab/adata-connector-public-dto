package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEntrepreneurRequestPayload {
    /**
     * ИИН
     * */
    private String iin;

    /**
     * Оптимизированный запрос
     * */
    private Boolean isOptimized;

    /**
     * Исключить лицензию из ответа
     * */
    private Boolean isElicenseDataDisabled;

    /**
     * Количество страниц судебных дел
     * */
    private Integer courtCasePages;
}
