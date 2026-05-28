package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LicenseGeneral {
    /**
     * Количество лицензий
     */
    private Integer totalLicensesCount;

    /**
     * Количество документов
     */
    private Integer totalOtherDocsCount;

    /**
     * Детальная информация
     */
    private List<LicenseGeneralDetail> details;
}
