package uk.gov.ons.fwmt.census.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LatLong {
  private Double lat = null;
  @JsonProperty("long")
  private Double _long = null;
}

