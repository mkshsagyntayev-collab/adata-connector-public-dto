package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Аффилированность учредителей
 */
@Getter
@Setter
public class AffiliationByFounder {
    /**
     * Наименование учредителя
     */
    private String founderName;

    /**
     * БИН учредителя
     * */
    private String founderBiin;

    /**
     * Список учредителей, которые принимают участие
     * */
    private List<AffiliationCompany> companies;
}
