package com.grape.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户喜欢的/赞过的视频
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UsersLikeVideos对象", description="用户喜欢的/赞过的视频")
public class UsersLikeVideos implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "用户")
    private String userId;

    @ApiModelProperty(value = "视频")
    private String videoId;


}
