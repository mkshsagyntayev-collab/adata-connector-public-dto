package kz.jysan.business.gov.connector.adata.dto.entrepreneur;

import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataBasic;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataConnectedDiagram;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataFounders;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataLitigation;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataRiskFactor;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataStatus;
import kz.jysan.business.gov.connector.adata.dto.common.CompanyDataTaxDeductions;
import kz.jysan.business.gov.connector.adata.dto.common.Contract;
import kz.jysan.business.gov.connector.adata.dto.common.KzCoTrustworthyPlus;
import kz.jysan.business.gov.connector.adata.dto.common.LicenseGeneral;
import kz.jysan.business.gov.connector.adata.dto.common.CourtCase;
import kz.jysan.business.gov.connector.adata.dto.common.RehabilitationInfo;
import kz.jysan.business.gov.connector.adata.dto.common.TrustworthyAnalytics;
import kz.jysan.business.gov.connector.adata.dto.common.TrustworthyExtended;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntrepreneurData {
    private CompanyDataBasic basic;

    private CompanyDataStatus status;

    /**
     * Факторы риска
     */
    private CompanyDataRiskFactor riskFactor;

    private CompanyDataTaxDeductions taxDeductions;

    private CompanyDataLitigation litigation;

    private CompanyDataFounders founders;

    private CompanyDataConnectedDiagram connectedDiagram;

    private LicenseGeneral licenseGeneral;

    private Contract contract;

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

    private LicenseEnterpriseData licenseEnterprise;

    /**
     * Судебные дела (с детальной информацией и ссылками на PDF)
     */
    private java.util.List<CourtCase> courtCases;
}
