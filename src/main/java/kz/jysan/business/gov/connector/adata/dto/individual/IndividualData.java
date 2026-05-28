package kz.jysan.business.gov.connector.adata.dto.individual;

import kz.jysan.business.gov.connector.adata.dto.common.CourtCase;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Основные данные физического лица (payload — исходящий DTO)
 */
@Getter
@Setter
public class IndividualData {

    private String iin;
    private String name;
    private String sourceLink;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private Integer age;
    private Boolean alive;
    private Boolean hasEnterprise;
    private Boolean isPublicOfficial;

    /**
     * Судебные дела (с детальной информацией и ссылками на PDF)
     */
    private List<CourtCase> courtCases;
}
