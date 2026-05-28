package kz.jysan.business.gov.connector.adata.dto.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import kz.jysan.business.gov.connector.adata.dto.entrepreneur.v2.LicenseEnterpriseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchElicenseEntrepreneurResponsePayload {
    /**
     * Данные о лицензиях ИП
     * */
    @JsonProperty(required = true)
    private List<LicenseEnterpriseData> licenseEnterprise;
}
