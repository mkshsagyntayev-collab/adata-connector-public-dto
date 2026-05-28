package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyDataRiskFactorHeadLitigation {
    /**
     * Количество гражданских дел
     */
    private Integer totalCivilCount;

    /**
     * Количество уголовных дел
     */
    private Integer totalCriminalCount;

    /**
     * Количество административных дел
     */
    private Integer totalAdministrativeCount;

    /**
     * Суды в виде массива
     */
    private List<CompanyDataRiskFactorHeadCourtCase> courtCases;
}
