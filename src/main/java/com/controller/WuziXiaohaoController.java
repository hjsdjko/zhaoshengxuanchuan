
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 物资消耗
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/wuziXiaohao")
public class WuziXiaohaoController {
    private static final Logger logger = LoggerFactory.getLogger(WuziXiaohaoController.class);

    private static final String TABLE_NAME = "wuziXiaohao";

    @Autowired
    private WuziXiaohaoService wuziXiaohaoService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChatService chatService;//客服聊天
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private JihuaService jihuaService;//招生计划
    @Autowired
    private SingleSeachService singleSeachService;//单页数据
    @Autowired
    private WuziService wuziService;//物资
    @Autowired
    private XinxiService xinxiService;//信息公开
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private ZhaoshengrenyuanService zhaoshengrenyuanService;//招生人员
    @Autowired
    private ZhengceService zhengceService;//招生政策
    @Autowired
    private ZixunjiluService zixunjiluService;//咨询记录
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("招生人员".equals(role))
            params.put("zhaoshengrenyuanId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = wuziXiaohaoService.queryPage(params);

        //字典表数据转换
        List<WuziXiaohaoView> list =(List<WuziXiaohaoView>)page.getList();
        for(WuziXiaohaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WuziXiaohaoEntity wuziXiaohao = wuziXiaohaoService.selectById(id);
        if(wuziXiaohao !=null){
            //entity转view
            WuziXiaohaoView view = new WuziXiaohaoView();
            BeanUtils.copyProperties( wuziXiaohao , view );//把实体数据重构到view中
            //级联表 物资
            //级联表
            WuziEntity wuzi = wuziService.selectById(wuziXiaohao.getWuziId());
            if(wuzi != null){
            BeanUtils.copyProperties( wuzi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "zhaoshengrenyuanId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setWuziId(wuzi.getId());
            }
            //级联表 招生人员
            //级联表
            ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(wuziXiaohao.getZhaoshengrenyuanId());
            if(zhaoshengrenyuan != null){
            BeanUtils.copyProperties( zhaoshengrenyuan , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "zhaoshengrenyuanId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setZhaoshengrenyuanId(zhaoshengrenyuan.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WuziXiaohaoEntity wuziXiaohao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,wuziXiaohao:{}",this.getClass().getName(),wuziXiaohao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("招生人员".equals(role))
            wuziXiaohao.setZhaoshengrenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<WuziXiaohaoEntity> queryWrapper = new EntityWrapper<WuziXiaohaoEntity>()
            .eq("wuzi_id", wuziXiaohao.getWuziId())
            .eq("zhaoshengrenyuan_id", wuziXiaohao.getZhaoshengrenyuanId())
            .eq("wuzi_xiaohao_name", wuziXiaohao.getWuziXiaohaoName())
            .eq("wuzi_xiaohao_address", wuziXiaohao.getWuziXiaohaoAddress())
            .eq("wuzi_xiaohao_types", wuziXiaohao.getWuziXiaohaoTypes())
            .eq("wuzi_xiaohao_kucun_number", wuziXiaohao.getWuziXiaohaoKucunNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WuziXiaohaoEntity wuziXiaohaoEntity = wuziXiaohaoService.selectOne(queryWrapper);
        if(wuziXiaohaoEntity==null){
            WuziEntity wuziEntity = wuziService.selectById(wuziXiaohao.getWuziId());
            if(wuziEntity == null)
                return R.error("查不到物资");
            int balance = wuziEntity.getWuziKucunNumber() - wuziXiaohao.getWuziXiaohaoKucunNumber();
            if(balance<0){
                return R.error("消耗数量大于库存数量");
            }
            wuziEntity.setWuziKucunNumber(balance);
            wuziService.updateById(wuziEntity);

            wuziXiaohao.setInsertTime(new Date());
            wuziXiaohao.setCreateTime(new Date());
            wuziXiaohaoService.insert(wuziXiaohao);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WuziXiaohaoEntity wuziXiaohao, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,wuziXiaohao:{}",this.getClass().getName(),wuziXiaohao.toString());
        WuziXiaohaoEntity oldWuziXiaohaoEntity = wuziXiaohaoService.selectById(wuziXiaohao.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("招生人员".equals(role))
//            wuziXiaohao.setZhaoshengrenyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            wuziXiaohaoService.updateById(wuziXiaohao);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<WuziXiaohaoEntity> oldWuziXiaohaoList =wuziXiaohaoService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        wuziXiaohaoService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<WuziXiaohaoEntity> wuziXiaohaoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            WuziXiaohaoEntity wuziXiaohaoEntity = new WuziXiaohaoEntity();
//                            wuziXiaohaoEntity.setWuziId(Integer.valueOf(data.get(0)));   //物资 要改的
//                            wuziXiaohaoEntity.setZhaoshengrenyuanId(Integer.valueOf(data.get(0)));   //招生人员 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoUuidNumber(data.get(0));                    //物资消耗编号 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoName(data.get(0));                    //物资消耗标题 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoAddress(data.get(0));                    //消耗地点 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoTime(sdf.parse(data.get(0)));          //消耗时间 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoTypes(Integer.valueOf(data.get(0)));   //物资消耗类型 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoKucunNumber(Integer.valueOf(data.get(0)));   //消耗数量 要改的
//                            wuziXiaohaoEntity.setWuziXiaohaoContent("");//详情和图片
//                            wuziXiaohaoEntity.setInsertTime(date);//时间
//                            wuziXiaohaoEntity.setCreateTime(date);//时间
                            wuziXiaohaoList.add(wuziXiaohaoEntity);


                            //把要查询是否重复的字段放入map中
                                //物资消耗编号
                                if(seachFields.containsKey("wuziXiaohaoUuidNumber")){
                                    List<String> wuziXiaohaoUuidNumber = seachFields.get("wuziXiaohaoUuidNumber");
                                    wuziXiaohaoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> wuziXiaohaoUuidNumber = new ArrayList<>();
                                    wuziXiaohaoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("wuziXiaohaoUuidNumber",wuziXiaohaoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //物资消耗编号
                        List<WuziXiaohaoEntity> wuziXiaohaoEntities_wuziXiaohaoUuidNumber = wuziXiaohaoService.selectList(new EntityWrapper<WuziXiaohaoEntity>().in("wuzi_xiaohao_uuid_number", seachFields.get("wuziXiaohaoUuidNumber")));
                        if(wuziXiaohaoEntities_wuziXiaohaoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(WuziXiaohaoEntity s:wuziXiaohaoEntities_wuziXiaohaoUuidNumber){
                                repeatFields.add(s.getWuziXiaohaoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [物资消耗编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        wuziXiaohaoService.insertBatch(wuziXiaohaoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = wuziXiaohaoService.queryPage(params);

        //字典表数据转换
        List<WuziXiaohaoView> list =(List<WuziXiaohaoView>)page.getList();
        for(WuziXiaohaoView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WuziXiaohaoEntity wuziXiaohao = wuziXiaohaoService.selectById(id);
            if(wuziXiaohao !=null){


                //entity转view
                WuziXiaohaoView view = new WuziXiaohaoView();
                BeanUtils.copyProperties( wuziXiaohao , view );//把实体数据重构到view中

                //级联表
                    WuziEntity wuzi = wuziService.selectById(wuziXiaohao.getWuziId());
                if(wuzi != null){
                    BeanUtils.copyProperties( wuzi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setWuziId(wuzi.getId());
                }
                //级联表
                    ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(wuziXiaohao.getZhaoshengrenyuanId());
                if(zhaoshengrenyuan != null){
                    BeanUtils.copyProperties( zhaoshengrenyuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setZhaoshengrenyuanId(zhaoshengrenyuan.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody WuziXiaohaoEntity wuziXiaohao, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,wuziXiaohao:{}",this.getClass().getName(),wuziXiaohao.toString());
        Wrapper<WuziXiaohaoEntity> queryWrapper = new EntityWrapper<WuziXiaohaoEntity>()
            .eq("wuzi_id", wuziXiaohao.getWuziId())
            .eq("zhaoshengrenyuan_id", wuziXiaohao.getZhaoshengrenyuanId())
            .eq("wuzi_xiaohao_uuid_number", wuziXiaohao.getWuziXiaohaoUuidNumber())
            .eq("wuzi_xiaohao_name", wuziXiaohao.getWuziXiaohaoName())
            .eq("wuzi_xiaohao_address", wuziXiaohao.getWuziXiaohaoAddress())
            .eq("wuzi_xiaohao_types", wuziXiaohao.getWuziXiaohaoTypes())
            .eq("wuzi_xiaohao_kucun_number", wuziXiaohao.getWuziXiaohaoKucunNumber())
//            .notIn("wuzi_xiaohao_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WuziXiaohaoEntity wuziXiaohaoEntity = wuziXiaohaoService.selectOne(queryWrapper);
        if(wuziXiaohaoEntity==null){
            wuziXiaohao.setInsertTime(new Date());
            wuziXiaohao.setCreateTime(new Date());
        wuziXiaohaoService.insert(wuziXiaohao);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

