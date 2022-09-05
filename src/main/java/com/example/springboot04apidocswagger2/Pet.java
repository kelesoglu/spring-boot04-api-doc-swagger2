package com.example.springboot04apidocswagger2;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My PET object", description = "My PET description")
public class Pet {

    @ApiModelProperty(value = "Pet nesnesinin Tekil id alanı.")
    private int id;

    @ApiModelProperty(value = "Pet nesnesinin Tekil name alanı.")
    private String name;

    @ApiModelProperty(value = "Pet nesnesinin Tekil date alanı.")
    private Date date;
}
