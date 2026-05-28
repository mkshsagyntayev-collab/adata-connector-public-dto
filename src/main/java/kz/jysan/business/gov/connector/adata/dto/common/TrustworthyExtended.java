package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrustworthyExtended {

    private Boolean forceEntered;

    private Boolean finished;

    private Boolean rehabilitation;

    private Boolean restrictionOnLeaving;

    private Boolean taxArrears150;

    private LeavingRestriction leavingRestriction;
}
