package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Документ судебного дела (payload)
 */
@Getter
@Setter
public class CourtCaseDocument {

    /**
     * Название файла
     */
    private String fileName;

    /**
     * Ссылка на документ (PDF)
     */
    private String docLink;
}
