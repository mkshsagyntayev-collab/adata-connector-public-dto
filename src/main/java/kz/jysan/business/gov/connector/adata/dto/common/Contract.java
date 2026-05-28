package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
public class Contract {
    /**
     * Количество контрактов
     */
    private Integer totalCount;

    /**
     * Cумма контрактов
     */
    private BigInteger totalSum;

    /**
     * Детали контрактов в виде массива
     */
    private List<ContractDetail> details;
}
