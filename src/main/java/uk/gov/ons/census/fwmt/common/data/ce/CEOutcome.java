package uk.gov.ons.census.fwmt.common.data.ce;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString(callSuper = true)
public class CEOutcome extends CommonOutcome {

  @ApiModelProperty(notes = "Identifier to the field officer that accompanied the primary officer")
  private String accompanyingOfficerId;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

}
