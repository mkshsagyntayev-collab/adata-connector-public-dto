package kz.jysan.business.gov.connector.adata.dto.company.elicense;

import lombok.Getter;
import lombok.Setter;

/**
 * Лицензия
 */
@Getter
@Setter
public class License {

    /**
     * Номер документа
     */
    private String licenseNumber;

    /**
     * Уникальный номер документа
     */
    private String documentUniqueNumber;

    /**
     * НИКАД
     */
    private String documentNaeadNumber;

    /**
     * НИКАД заявления
     */
    private String applicationNaeadNumber;

    /**
     * Лицензор
     */
    private String licensor;

    /**
     * Ссылка к документу
     */
    private String documentPath;

    /**
     * Лицензиат
     */
    private String licensee;

    /**
     * Вид деятельности
     */
    private String activity;

    /**
     * Статус
     */
    private String status;

    /**
     * Начало периода действия лицензии
     */
    private String validityStartDate;

    /**
     * Окончание периода действия лицензии
     */
    private String validityEndDate;

    /**
     * Дата выдачи. Формат: 2016-06-21
     */
    private String issueDate;

    /**
     * true – лицензия
     * false – другой документ
     */
    private Boolean isLicense;

}
