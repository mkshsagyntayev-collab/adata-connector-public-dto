package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KzCoTrustworthyPlus {

    private Boolean bankruptcyInitiationAndManagerCreditorClaims;

    private Boolean bankruptcyAndLiquidationInitiationNotices;

    private Boolean creditorsMeetingInBankruptcy;
}
