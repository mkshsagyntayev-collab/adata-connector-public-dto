package kz.jysan.business.gov.connector.adata.dto.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import kz.jysan.business.gov.connector.adata.dto.entrepreneur.v2.EntrepreneurData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchEntrepreneurResponsePayload {
    /**
     * Данные
     */
    @JsonProperty(required = true)
    private EntrepreneurData data;
}
