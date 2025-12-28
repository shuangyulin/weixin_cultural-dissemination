package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import java.util.Collections;

import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YingshifenleiEntity;
import com.entity.view.YingshifenleiView;

import com.service.YingshifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 影视分类
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
@RestController
@RequestMapping("/yingshifenlei")
public class YingshifenleiController {
    @Autowired
    private YingshifenleiService yingshifenleiService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingshifenleiEntity yingshifenlei,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YingshifenleiEntity> ew = new EntityWrapper<YingshifenleiEntity>();


        //查询结果
		PageUtils page = yingshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingshifenlei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingshifenleiEntity yingshifenlei, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YingshifenleiEntity> ew = new EntityWrapper<YingshifenleiEntity>();

        //查询结果
		PageUtils page = yingshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingshifenlei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingshifenleiEntity yingshifenlei){
       	EntityWrapper<YingshifenleiEntity> ew = new EntityWrapper<YingshifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingshifenlei, "yingshifenlei")); 
        return R.ok().put("data", yingshifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingshifenleiEntity yingshifenlei){
        EntityWrapper< YingshifenleiEntity> ew = new EntityWrapper< YingshifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingshifenlei, "yingshifenlei")); 
		YingshifenleiView yingshifenleiView =  yingshifenleiService.selectView(ew);
		return R.ok("查询影视分类成功").put("data", yingshifenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingshifenleiEntity yingshifenlei = yingshifenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yingshifenlei,deSens);
        return R.ok().put("data", yingshifenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingshifenleiEntity yingshifenlei = yingshifenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yingshifenlei,deSens);
        return R.ok().put("data", yingshifenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingshifenleiEntity yingshifenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yingshifenleiService.selectCount(new EntityWrapper<YingshifenleiEntity>().eq("yingshifenlei", yingshifenlei.getYingshifenlei()))>0) {
            return R.error("影视分类已存在");
        }
        //ValidatorUtils.validateEntity(yingshifenlei);
        yingshifenleiService.insert(yingshifenlei);
        return R.ok().put("data",yingshifenlei.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingshifenleiEntity yingshifenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yingshifenleiService.selectCount(new EntityWrapper<YingshifenleiEntity>().eq("yingshifenlei", yingshifenlei.getYingshifenlei()))>0) {
            return R.error("影视分类已存在");
        }
        //ValidatorUtils.validateEntity(yingshifenlei);
        yingshifenleiService.insert(yingshifenlei);
        return R.ok().put("data",yingshifenlei.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YingshifenleiEntity yingshifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingshifenlei);
        //验证字段唯一性，否则返回错误信息
        if(yingshifenleiService.selectCount(new EntityWrapper<YingshifenleiEntity>().ne("id", yingshifenlei.getId()).eq("yingshifenlei", yingshifenlei.getYingshifenlei()))>0) {
            return R.error("影视分类已存在");
        }
        //全部更新
        yingshifenleiService.updateById(yingshifenlei);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingshifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
