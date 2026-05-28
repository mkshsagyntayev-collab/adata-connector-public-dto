package kz.jysan.business.gov.connector.adata.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchElicenseCompanyRequestPayload {
    /**
     * БИН
     * */
    private String bin;
}
