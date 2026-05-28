package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

/**
 * Основные сведения о компании
 */
@Getter
@Setter
public class CompanyDataBasicOked {
    /**
     * Номер ОКЭД
     */
    private String i;

    /**
     * Наименование ОКЭД
     */
    private String nameRu;
}
