package config.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "CityIO参数说明",description = "CityIO参数说明")
public class CityIO {
    @ApiModelProperty(value = "城市id")
    private String id;
    @ApiModelProperty(value = "城市位于南方北方 1/南方 2/北方")
    private String position;
}