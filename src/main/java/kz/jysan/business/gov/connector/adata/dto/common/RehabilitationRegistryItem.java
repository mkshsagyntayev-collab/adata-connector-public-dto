package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Элемент реестра реабилитации и банкротства (payload)
 */
@Getter
@Setter
public class RehabilitationRegistryItem {

    /**
     * Идентификатор реестра
     */
    private Integer registryId;

    /**
     * Количество записей
     */
    private Integer count;
}
