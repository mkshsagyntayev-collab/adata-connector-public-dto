package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyDataTaxDeductions {
    /**
     * Сумма
     */
    private String sum;

    /**
     * Налоговые отчисления
     */
    private List<Object> details;
}
