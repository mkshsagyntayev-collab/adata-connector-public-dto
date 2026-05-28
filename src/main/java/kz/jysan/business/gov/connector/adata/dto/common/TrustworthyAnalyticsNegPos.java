package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Информация по характеристике
 */
@Getter
@Setter
public class TrustworthyAnalyticsNegPos {
    /**
     * Количество факторов
     */
    private Integer count;

    /**
     * Детали факторов в виде списка
     */
    private List<TrustworthyAnalyticsNegPosFactor> factors;

    /**
     * Количество баллов
     */
    private BigDecimal score;
}
