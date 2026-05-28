package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrustworthyAnalyticsItemFactor {
    /**
     * Кодовое название фактора
     */
    private String code;

    /**
     * Описание фактора
     */
    private String name;

    /**
     * Группа к которой относится фактор
     */
    private String groupName;

    /**
     * Кодовое название количества очков
     */
    private String scoreCode;

}
