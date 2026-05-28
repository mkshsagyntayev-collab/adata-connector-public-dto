package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDataRiskFactorHead {
    /**
     * True – имеется запрет на выезд
     * false – проблем не найдено
     */
    private Boolean banLeaving;

    /**
     * Сумма задолженности
     */
    private Integer banLeavingSum;

    /**
     * True – связан с финансированием терроризма
     * false – проблем не найдено
     */
    private Boolean terrorist;

    /**
     * True – в базе педофилов
     * false – проблем не найдено
     */
    private Boolean pedophile;

    /**
     * True – в базе провавших без вести
     * false – проблем не найдено
     */
    private Boolean missing;

    /**
     * True – в базе должников по исполнительным документам
     * false – проблем не найдено
     */
    private Boolean debtorForExecutiveDocuments;

    /**
     * True – в базе граждан, скрывающихся от следствий
     * false – проблем не найдено
     */
    private Boolean citizenHidingFromInvestigation;

    /**
     * True – в базе алиментщиков
     * false – проблем не найдено
     */
    private Boolean alimonyPayer;

    /**
     * True – арест на имущество
     * false – проблем не найдено
     */
    private Boolean seizedProperty;

    /**
     * True – арест на банковский счет
     * false – проблем не найдено
     */
    private Boolean seizedBankAccount;

    /**
     * True – запрет на регистрационные действия ЮЛ
     * false – проблем не найдено
     */
    private Boolean banRegistrationActionsLegalEnt;

    /**
     * True – запрет на регистрационные действия ФЛ
     * false – проблем не найдено
     */
    private Boolean banRegistrationActionsPhysicalEnt;

    /**
     * Сумма задолженности по налогам и таможенным платежам
     */
    private String taxDebt;

    /**
     * True – имеются исполнительные производства
     * false – проблем не найдено
     */
    private Boolean enforcementDebt;

    /**
     * Сумма задолженности
     */
    private Integer enforcementDebtSum;

    /**
     * True – запрет на совершение нотариальных действий
     * false – проблем не найдено
     */
    private Boolean banNotariusActions;

    /**
     * True – запрет на реализацию арестованного имущества
     * false – проблем не найдено
     */
    private Boolean banSeizedPropertyActions;

    /**
     * Сведения по судебным разбирательствам руководителя
     */
    private CompanyDataRiskFactorHeadLitigation litigation;
}
