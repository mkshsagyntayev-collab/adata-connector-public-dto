package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kz.jysan.business.gov.connector.adata.dto.company.CompanyData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCompanyResponsePayload {
    /**
     * Данные о юридическом лице или индивидуальном предпринимателе
     */
    @JsonProperty(required = true)
    private CompanyData data;
}
