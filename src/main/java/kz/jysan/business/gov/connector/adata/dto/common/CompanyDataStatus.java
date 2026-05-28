package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

/**
 * Статус предприятия
 */
@Getter
@Setter
public class CompanyDataStatus {
    /**
     * True – действующее предприятие, false – бездействующее предприятие
     */
    private Boolean companyStatus;

    /**
     * True – в списке лжепредприятий, false – проблем не найдено
     */
    private Boolean pseudoCompany;

    /**
     * True – в списке банкротов, false – проблем не найдено
     */
    private Boolean bankcrupt;

    /**
     * True – бездействующее предприятие, false – проблем не найден
     */
    private Boolean inactive;

    /**
     * True – отсутствует по юридическому адресу, false – проблем не найдено
     */
    private Boolean absentAtAddress;

    /**
     * True – регистрация признана недействительной, false – проблем не найдено
     */
    private Boolean registrationInvalid;

    /**
     * True – в списке «Реорганизован с нарушением норм Налогового кодекса», false – проблем нет
     */
    private Boolean violationTax;

    /**
     * Cумма задолженности по налогам и таможенным платежам
     */
    private String taxDebt;
}
