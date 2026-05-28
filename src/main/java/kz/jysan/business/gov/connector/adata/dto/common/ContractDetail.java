package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class ContractDetail {
    /**
     * Период
     */
    private String year;

    /**
     * Количество контрактов
     */
    private Integer count;

    /**
     * Сумма контрактов
     */
    private BigInteger sum;
}
