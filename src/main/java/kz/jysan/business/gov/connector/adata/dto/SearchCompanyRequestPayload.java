package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchCompanyRequestPayload {
    /**
     * БИН
     * */
    private String bin;

    /**
     * Оптимизированный запрос
     * */
    private Boolean isOptimized;

    /**
     * Количество страниц судебных дел
     * */
    private Integer courtCasePages;
}
