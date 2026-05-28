package kz.jysan.business.gov.connector.adata.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCompanyReportResponsePayload {

  private String location;
  private String filename;
  private String base64pdf;

}
