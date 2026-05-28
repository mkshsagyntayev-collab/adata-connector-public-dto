package kz.jysan.business.gov.connector.adata.dto.individual;

import lombok.Getter;
import lombok.Setter;

/**
 * Адрес регистрации физического лица (payload)
 */
@Getter
@Setter
public class RegistrationAddress {

    private String street;

    private String building;

    private String flat;

    private String country;

    private String region;

    private String district;

    private String beginDate;
}
