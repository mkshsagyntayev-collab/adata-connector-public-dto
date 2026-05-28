package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class LeavingRestrictionDetail {

    private String progressStatus;

    private Integer count;

    private BigDecimal amount;
}
