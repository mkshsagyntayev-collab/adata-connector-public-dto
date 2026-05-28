package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class LeavingRestriction {

    private Integer count;

    private BigDecimal amount;

    private List<LeavingRestrictionDetail> detail;
}
