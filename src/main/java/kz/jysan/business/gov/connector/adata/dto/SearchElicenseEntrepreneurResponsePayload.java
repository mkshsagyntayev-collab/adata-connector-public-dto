package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kz.jysan.business.gov.connector.adata.dto.entrepreneur.LicenseEnterpriseData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchElicenseEntrepreneurResponsePayload {
    /**
     * Данные о лицензиях ИП
     * */
    @JsonProperty(required = true)
    private LicenseEnterpriseData licenseEnterprise;
}
