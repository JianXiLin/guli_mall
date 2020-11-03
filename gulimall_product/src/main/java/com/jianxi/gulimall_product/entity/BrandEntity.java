package com.jianxi.gulimall_product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


import com.jianxi.common.valid.AddGroup;
import com.jianxi.common.valid.ListValue;
import com.jianxi.common.valid.UpdateGroup;
import com.jianxi.common.valid.UpdateStatusGroup;
import lombok.Data;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "brandId不能为空",groups = {AddGroup.class, UpdateGroup.class})
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotEmpty(message = "name不能为空",groups = {AddGroup.class, UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo需要为URL",groups={AddGroup.class, UpdateGroup.class})
	@NotNull(message = "logo不能为空",groups = {AddGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(groups = {AddGroup.class,UpdateStatusGroup.class})
	@ListValue(vals = {0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母",groups = {AddGroup.class, UpdateGroup.class})
	@NotEmpty(message = "检索首字母不能为空",groups = {AddGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(message = "sort不能为空",groups = {AddGroup.class})
	@Min(value = 0, message = "排序必须是一个正整数",groups = {AddGroup.class, UpdateGroup.class})
	private Integer sort;

}
