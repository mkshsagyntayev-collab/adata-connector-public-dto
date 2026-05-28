package kz.jysan.business.gov.connector.adata.dto;

import kz.jysan.business.gov.connector.adata.dto.individual.IndividualData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchIndividualResponsePayload {

    private IndividualData data;
}
