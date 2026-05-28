package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyDataConnectedDiagram {
    /**
     * Аффилированность компании
     */
    private List<AffiliationByCompany> affiliationByCompany;

    /**
     * Аффилированность по руководителю
     */
    private AffiliationByHead affiliationByHead;

    /**
     * Аффилированность учредителей в виде списка
     */
    private List<AffiliationByFounder> affiliationByFounder;
}
