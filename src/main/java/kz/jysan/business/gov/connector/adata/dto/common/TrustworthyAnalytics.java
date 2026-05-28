package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrustworthyAnalytics {
    /**
     * Влияние на рейтинг
     */
    private String shift;

    /**
     * Информация по отрицательным характеристикам
     */
    private TrustworthyAnalyticsNegPos negative;

    /**
     * Информация по положительным характеристикам
     */
    private TrustworthyAnalyticsNegPos positive;
}
