package kz.jysan.business.gov.connector.adata.dto.individual;

import lombok.Getter;
import lombok.Setter;

/**
 * Документ физического лица (payload)
 */
@Getter
@Setter
public class IndividualDocument {

    /**
     * Тип документа
     */
    private String type;

    /**
     * Серия и номер
     */
    private String number;

    /**
     * Дата начала действия
     */
    private String beginDate;

    /**
     * Дата окончания действия
     */
    private String endDate;

    /**
     * Орган выдачи
     */
    private String issueOrganization;

    /**
     * Статус документа
     */
    private String status;
}
