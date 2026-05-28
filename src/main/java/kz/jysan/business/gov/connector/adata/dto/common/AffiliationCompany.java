package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Участие руководителя
 */
@Getter
@Setter
public class AffiliationCompany {
    /**
     * Наименование компании
     */
    private String name;

    /**
     * БИН компании
     */
    private String bin;

    /**
     * ФИО руководителя
     */
    private String director;

    /**
     * Тип участия
     */
    private String type;
}
