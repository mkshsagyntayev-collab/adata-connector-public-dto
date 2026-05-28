package kz.jysan.business.gov.connector.adata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kz.jysan.business.gov.connector.adata.dto.company.elicense.License;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchElicenseCompanyResponsePayload {
    @JsonProperty(required = true)
    private List<License> licenses;
}
