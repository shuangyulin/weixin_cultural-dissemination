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

import com.entity.YuejufenleiEntity;
import com.entity.view.YuejufenleiView;

import com.service.YuejufenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 粤剧分类
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
@RestController
@RequestMapping("/yuejufenlei")
public class YuejufenleiController {
    @Autowired
    private YuejufenleiService yuejufenleiService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuejufenleiEntity yuejufenlei,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuejufenleiEntity> ew = new EntityWrapper<YuejufenleiEntity>();


        //查询结果
		PageUtils page = yuejufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuejufenlei), params), params));
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
    public R list(@RequestParam Map<String, Object> params,YuejufenleiEntity yuejufenlei, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuejufenleiEntity> ew = new EntityWrapper<YuejufenleiEntity>();

        //查询结果
		PageUtils page = yuejufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuejufenlei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuejufenleiEntity yuejufenlei){
       	EntityWrapper<YuejufenleiEntity> ew = new EntityWrapper<YuejufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuejufenlei, "yuejufenlei")); 
        return R.ok().put("data", yuejufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuejufenleiEntity yuejufenlei){
        EntityWrapper< YuejufenleiEntity> ew = new EntityWrapper< YuejufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuejufenlei, "yuejufenlei")); 
		YuejufenleiView yuejufenleiView =  yuejufenleiService.selectView(ew);
		return R.ok("查询粤剧分类成功").put("data", yuejufenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuejufenleiEntity yuejufenlei = yuejufenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuejufenlei,deSens);
        return R.ok().put("data", yuejufenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuejufenleiEntity yuejufenlei = yuejufenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuejufenlei,deSens);
        return R.ok().put("data", yuejufenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuejufenleiEntity yuejufenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuejufenleiService.selectCount(new EntityWrapper<YuejufenleiEntity>().eq("yuejufenlei", yuejufenlei.getYuejufenlei()))>0) {
            return R.error("粤剧分类已存在");
        }
        //ValidatorUtils.validateEntity(yuejufenlei);
        yuejufenleiService.insert(yuejufenlei);
        return R.ok().put("data",yuejufenlei.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuejufenleiEntity yuejufenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuejufenleiService.selectCount(new EntityWrapper<YuejufenleiEntity>().eq("yuejufenlei", yuejufenlei.getYuejufenlei()))>0) {
            return R.error("粤剧分类已存在");
        }
        //ValidatorUtils.validateEntity(yuejufenlei);
        yuejufenleiService.insert(yuejufenlei);
        return R.ok().put("data",yuejufenlei.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuejufenleiEntity yuejufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuejufenlei);
        //验证字段唯一性，否则返回错误信息
        if(yuejufenleiService.selectCount(new EntityWrapper<YuejufenleiEntity>().ne("id", yuejufenlei.getId()).eq("yuejufenlei", yuejufenlei.getYuejufenlei()))>0) {
            return R.error("粤剧分类已存在");
        }
        //全部更新
        yuejufenleiService.updateById(yuejufenlei);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuejufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
