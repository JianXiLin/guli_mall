package com.jianxi.gulimall_coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jianxi.gulimall_coupon.entity.MemberPriceEntity;
import com.jianxi.gulimall_coupon.service.MemberPriceService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.common.utils.R;



/**
 * 商品会员价格
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:00:13
 */
@RestController
@RequestMapping("gulimall_coupon/memberprice")
public class MemberPriceController {
    @Autowired
    private MemberPriceService memberPriceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberPriceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") Long id){
		MemberPriceEntity memberPrice = memberPriceService.getById(id);

        return R.ok().put("memberPrice", memberPrice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody MemberPriceEntity memberPrice){
		memberPriceService.save(memberPrice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody MemberPriceEntity memberPrice){
		memberPriceService.updateById(memberPrice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody Long[] ids){
		memberPriceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}