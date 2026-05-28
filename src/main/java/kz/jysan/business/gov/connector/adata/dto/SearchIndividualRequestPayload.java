package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchIndividualRequestPayload {

    /**
     * ИИН физического лица
     */
    private String iin;

    /**
     * Количество страниц судебных дел
     * */
    private Integer courtCasePages;
}
