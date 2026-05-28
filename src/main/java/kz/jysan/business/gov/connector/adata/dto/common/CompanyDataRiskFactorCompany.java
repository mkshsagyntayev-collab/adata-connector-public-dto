package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDataRiskFactorCompany {
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
     * True – задолженность по исполнительным производствам
     * false – проблем не найдено
     */
    private Boolean enforcementDebt;

    /**
     * Сумма задолженности
     */
    private Integer enforcementDebtSum;

    /**
     * True – в списке банкротов,
     * false – проблем не найдено
     */
    private Boolean bankrupt;

    /**
     * Степень риска налогоплательщика
     */
    private String taxRiskDegree;

    /**
     * True – в списке налогоплательщиков, сделки с которыми совершены без фактического выполнения работ,
     * false – проблем не найдено
     */
    private Boolean irresponsibleTaxpayer;

    /**
     * True – на стадии ликвидации,
     * false – проблем не найдено
     */
    private Boolean liquidatingTaxpayer;

    /**
     * True – арест на имущество,
     * false – проблем не найдено
     */
    private Boolean seizedProperty;

    /**
     * True – арест на банковский счет,
     * false – проблем не найдено
     */
    private Boolean seizedBankAccount;

    /**
     * True – запрет на регистрационные действия ЮЛ,
     * false – проблем не найдено
     */
    private Boolean banRegistrationActionsLegalEnt;

    /**
     * True – запрет на регистрационные действия ФЛ,
     * false – проблем не найдено
     */
    private Boolean banRegistrationActionsPhysicalEnt;

    /**
     * True – запрет на совершение нотариальных действий,
     * false – проблем не найдено
     */
    private Boolean banNotariusActions;

    /**
     * True – запрет на реализацию арестованного имущества,
     * false – проблем не найдено
     */
    private Boolean banSeizedPropertyActions;

    private Boolean bankruptcyDecision;

    private Boolean bankruptcyLiquidation;

    private Boolean bankruptcyRehabilitation;
}
