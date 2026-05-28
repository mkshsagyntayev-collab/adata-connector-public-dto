package kz.jysan.business.gov.connector.adata.dto.common;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyDataFounders {
    /**
     * Общее число учредителей компании
     */
    private Integer foundersCnt;

    /**
     * Данные об учредителях компании
     */
    private List<Object> foundersDtl;
}
