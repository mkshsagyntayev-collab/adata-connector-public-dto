package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDataRiskFactor {
    /**
     * Факторы риска компании
     */
    private CompanyDataRiskFactorCompany company;

    /**
     * Факторы риска руководителя компании
     */
    private CompanyDataRiskFactorHead head;
}
