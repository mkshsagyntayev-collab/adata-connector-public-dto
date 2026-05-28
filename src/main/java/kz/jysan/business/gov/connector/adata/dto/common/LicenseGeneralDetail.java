package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Детальная информация
 */
@Getter
@Setter
public class LicenseGeneralDetail {
    /**
     * Год
     */
    private String year;

    /**
     * Количество лицензий
     */
    private Integer licensesCount;

    /**
     * Другие документы
     */
    private Integer otherDocsCount;
}
