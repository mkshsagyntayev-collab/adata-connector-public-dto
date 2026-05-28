package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDataRiskFactorHeadCourtCase {
    /**
     * Период
     */
    private String year;

    /**
     * Количество гражданских дел
     */
    private Integer civilCount;

    /**
     * Количество уголовных дел
     */
    private Integer criminalCount;

    /**
     * Количество административных дел
     */
    private Integer administrativeCount;
}
