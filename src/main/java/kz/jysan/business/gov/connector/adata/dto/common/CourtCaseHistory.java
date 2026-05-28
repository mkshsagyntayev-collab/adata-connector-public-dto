package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Событие истории судебного дела (payload)
 */
@Getter
@Setter
public class CourtCaseHistory {

    /**
     * Дата события
     */
    private String eventDate;

    /**
     * Наименование события
     */
    private String name;
}
