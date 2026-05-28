package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AffiliationByCompany {
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
     * Тип участия – Учреждаемая компания
     */
    private String type;
}
