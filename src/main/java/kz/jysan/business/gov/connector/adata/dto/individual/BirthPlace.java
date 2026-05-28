package kz.jysan.business.gov.connector.adata.dto.individual;

import lombok.Getter;
import lombok.Setter;

/**
 * Место рождения физического лица (payload)
 */
@Getter
@Setter
public class BirthPlace {

    private String country;

    private String region;

    private String district;
}
