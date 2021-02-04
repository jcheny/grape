package com.grape.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Bgm对象", description="")
public class Bgm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String author;

    private String name;

    @ApiModelProperty(value = "播放地址")
    private String path;


}
