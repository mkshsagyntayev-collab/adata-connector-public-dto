package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TrustworthyAnalyticsItem {
    private Integer count;
    private List<TrustworthyAnalyticsItemFactor> factors;

}
