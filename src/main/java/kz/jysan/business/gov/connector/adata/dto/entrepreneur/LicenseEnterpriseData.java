package kz.jysan.business.gov.connector.adata.dto.entrepreneur;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LicenseEnterpriseData {

    private String documentUniqueNumber;

    private String documentNaeadNumber;

    private String licensor;

    private String activity;

    private String issueDate;
}
