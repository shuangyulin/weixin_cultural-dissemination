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

import com.entity.DiscussyueyuwenhuaEntity;
import com.entity.view.DiscussyueyuwenhuaView;

import com.service.DiscussyueyuwenhuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 粤语文化评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
@RestController
@RequestMapping("/discussyueyuwenhua")
public class DiscussyueyuwenhuaController {
    @Autowired
    private DiscussyueyuwenhuaService discussyueyuwenhuaService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyueyuwenhuaEntity discussyueyuwenhua,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<DiscussyueyuwenhuaEntity> ew = new EntityWrapper<DiscussyueyuwenhuaEntity>();


        //查询结果
		PageUtils page = discussyueyuwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyueyuwenhua), params), params));
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
    public R list(@RequestParam Map<String, Object> params,DiscussyueyuwenhuaEntity discussyueyuwenhua, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<DiscussyueyuwenhuaEntity> ew = new EntityWrapper<DiscussyueyuwenhuaEntity>();

        //查询结果
		PageUtils page = discussyueyuwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyueyuwenhua), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyueyuwenhuaEntity discussyueyuwenhua){
       	EntityWrapper<DiscussyueyuwenhuaEntity> ew = new EntityWrapper<DiscussyueyuwenhuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyueyuwenhua, "discussyueyuwenhua")); 
        return R.ok().put("data", discussyueyuwenhuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyueyuwenhuaEntity discussyueyuwenhua){
        EntityWrapper< DiscussyueyuwenhuaEntity> ew = new EntityWrapper< DiscussyueyuwenhuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyueyuwenhua, "discussyueyuwenhua")); 
		DiscussyueyuwenhuaView discussyueyuwenhuaView =  discussyueyuwenhuaService.selectView(ew);
		return R.ok("查询粤语文化评论表成功").put("data", discussyueyuwenhuaView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyueyuwenhuaEntity discussyueyuwenhua = discussyueyuwenhuaService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(discussyueyuwenhua,deSens);
        return R.ok().put("data", discussyueyuwenhua);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyueyuwenhuaEntity discussyueyuwenhua = discussyueyuwenhuaService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(discussyueyuwenhua,deSens);
        return R.ok().put("data", discussyueyuwenhua);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyueyuwenhuaEntity discussyueyuwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyueyuwenhua);
        discussyueyuwenhuaService.insert(discussyueyuwenhua);
        return R.ok().put("data",discussyueyuwenhua.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyueyuwenhuaEntity discussyueyuwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyueyuwenhua);
        discussyueyuwenhuaService.insert(discussyueyuwenhua);
        return R.ok().put("data",discussyueyuwenhua.getId());
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussyueyuwenhuaEntity discussyueyuwenhua = discussyueyuwenhuaService.selectOne(new EntityWrapper<DiscussyueyuwenhuaEntity>().eq("", username));
        return R.ok().put("data", discussyueyuwenhua);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussyueyuwenhuaEntity discussyueyuwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyueyuwenhua);
        //全部更新
        discussyueyuwenhuaService.updateById(discussyueyuwenhua);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyueyuwenhuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussyueyuwenhuaEntity discussyueyuwenhua, HttpServletRequest request,String pre){
        EntityWrapper<DiscussyueyuwenhuaEntity> ew = new EntityWrapper<DiscussyueyuwenhuaEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
        // 组装参数
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussyueyuwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyueyuwenhua), params), params));
        return R.ok().put("data", page);
    }








}
