package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Аффилированность по руководителю
 */
@Getter
@Setter
public class AffiliationByHead {
    /**
     * ФИО руководителя
     */
    private String headName;

    /**
     * Все участия руководителей в виде списка
     */
    private List<AffiliationCompany> companies;
}
