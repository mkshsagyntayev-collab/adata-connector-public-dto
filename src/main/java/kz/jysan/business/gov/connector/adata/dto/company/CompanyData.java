package kz.jysan.business.gov.connector.adata.dto.company;

import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataBasic;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataConnectedDiagram;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataFounders;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataLitigation;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataRiskFactor;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataStatus;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataTaxDeductions;
import kz.jysan.business.gov.connector.adata.dto.common.Contract;
import kz.jysan.business.gov.connector.adata.dto.common.CourtCase;
import kz.jysan.business.gov.connector.adata.dto.common.LicenseGeneral;
import kz.jysan.business.gov.connector.adata.dto.common.RehabilitationInfo;
import kz.jysan.business.gov.connector.adata.dto.common.TrustworthyAnalytics;
import kz.jysan.business.gov.connector.adata.dto.common.TrustworthyExtended;
import kz.jysan.business.gov.connector.adata.dto.common.KzCoTrustworthyPlus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Данные
 */
@Getter
@Setter
public class CompanyData {
    /**
     * Основные сведения о компании
     */
    private CompanyDataBasic basic;

    /**
     * Статус предприятия
     */
    private CompanyDataStatus status;

    /**
     * Факторы риска
     */
    private CompanyDataRiskFactor riskFactor;

    /**
     * Сведения по налоговым отчислениям
     */
    private CompanyDataTaxDeductions taxDeductions;

    /**
     * Сведения по судебным разбирательствам
     */
    private CompanyDataLitigation litigation;

    /**
     * Сведения по учредителям
     */
    private CompanyDataFounders founders;

    /**
     * Информация по аффилированности
     */
    private CompanyDataConnectedDiagram connectedDiagram;

    /**
     * Информация по лицензиям и прочим документам
     */
    private LicenseGeneral licenseGeneral;

    /**
     * Информация по контрактам
     * */
    private Contract contract;

    /**
     * Аналитика
     */
    private TrustworthyAnalytics trustworthyAnalytics;

    /**
     * Расширенные признаки благонадежности
     */
    private TrustworthyExtended trustworthyExtended;

    /**
     * Расширенные признаки благонадежности плюс
     */
    private KzCoTrustworthyPlus kzCoTrustworthyPlus;

    /**
     * Данные по реабилитации и банкротству
     */
    private RehabilitationInfo rehabilitation;

    /**
     * Массив судебных дел (только для юр. лиц), включая ссылки на PDF
     */
    private List<CourtCase> courtCases;
}
