package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * Основные сведения о компании
 */
@Getter
@Setter
public class CompanyDataBasic {
    /**
     * Полное наименование компании на русском языке
     */
    private String nameRu;

    /**
     * БИН компании или ИИН индивидуального предпринимателя
     */
    private String biin;

    /**
     * Юридический адрес
     */
    private String legalAddress;

    /**
     * Код основного ОКЭД
     */
    private String okedId;

    /**
     * Наименование основного ОКЭД
     */
    private String oked;

    /**
     * Номер КАТО
     */
    private Integer idKato;

    /**
     * Номер КРП
     */
    private Integer idKrp;

    /**
     * ФИО директора
     */
    private String fullnameDirector;

    /**
     * ИИН директора
     */
    private String directorIin;

    /**
     * Дата регистрации(формат: 25-12-2010)
     */
    private LocalDate dateRegistration;

    /**
     * Размер предприятия
     */
    private String krp;

    /**
     * Имеются проблемы у предприятия
     * <p>
     * true – имеются проблемы у предприятия,
     * false – проблем не найдено
     */
    private Boolean companyProblems;

    /**
     *  Имеются проблемы с финансами
     * <p>
     *  true – имеются проблемы с финансами,
     *  false – проблем не найдено
     */
    private Boolean financialProblems;

    /**
     * Cостоит в реестре недобросовестных участников закупок
     * <p>
     * true – состоит в реестре недобросовестных участников закупок,
     * false – не состоит в реестре недобросовестных
     */
    private Boolean unreliableZakup;

    /**
     * Имеются проблемы у руководителя
     */
    private Boolean headProblems;

    /**
     * Company – юридическое лицо
     * enterprise - ИП
     */
    private String counterpartyType;

    /**
     * Плательщик НДС
     */
    private Boolean isNdsPayer;

    /**
     * ОКЭДы в виде массива
     */
    private List<CompanyDataBasicOked> okeds;

    /**
     * Вторичные ОКЭДЫ в виде массива
     */
    private List<CompanyDataBasicOked> secondaryOkeds;

    /**
     * Cсылка на карточку контраганта в adata.kz
     */
    private String sourceLink;

    /**
     * Форма собственности
     */
    private String typeOfOwnership;

    /**
     * Правовая форма компании
     */
    private String legalForm;
}
