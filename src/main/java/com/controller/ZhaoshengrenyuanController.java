
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
 * 招生人员
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhaoshengrenyuan")
public class ZhaoshengrenyuanController {
    private static final Logger logger = LoggerFactory.getLogger(ZhaoshengrenyuanController.class);

    private static final String TABLE_NAME = "zhaoshengrenyuan";

    @Autowired
    private ZhaoshengrenyuanService zhaoshengrenyuanService;


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
    private WuziXiaohaoService wuziXiaohaoService;//物资消耗
    @Autowired
    private XinxiService xinxiService;//信息公开
    @Autowired
    private YonghuService yonghuService;//用户
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
        PageUtils page = zhaoshengrenyuanService.queryPage(params);

        //字典表数据转换
        List<ZhaoshengrenyuanView> list =(List<ZhaoshengrenyuanView>)page.getList();
        for(ZhaoshengrenyuanView c:list){
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
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(id);
        if(zhaoshengrenyuan !=null){
            //entity转view
            ZhaoshengrenyuanView view = new ZhaoshengrenyuanView();
            BeanUtils.copyProperties( zhaoshengrenyuan , view );//把实体数据重构到view中
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
    public R save(@RequestBody ZhaoshengrenyuanEntity zhaoshengrenyuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhaoshengrenyuan:{}",this.getClass().getName(),zhaoshengrenyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhaoshengrenyuanEntity> queryWrapper = new EntityWrapper<ZhaoshengrenyuanEntity>()
            .eq("username", zhaoshengrenyuan.getUsername())
            .or()
            .eq("zhaoshengrenyuan_phone", zhaoshengrenyuan.getZhaoshengrenyuanPhone())
            .or()
            .eq("zhaoshengrenyuan_id_number", zhaoshengrenyuan.getZhaoshengrenyuanIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhaoshengrenyuanEntity zhaoshengrenyuanEntity = zhaoshengrenyuanService.selectOne(queryWrapper);
        if(zhaoshengrenyuanEntity==null){
            zhaoshengrenyuan.setCreateTime(new Date());
            zhaoshengrenyuan.setPassword("123456");
            zhaoshengrenyuanService.insert(zhaoshengrenyuan);
            return R.ok();
        }else {
            return R.error(511,"账户或者招生人员手机号或者招生人员身份证号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaoshengrenyuanEntity zhaoshengrenyuan, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhaoshengrenyuan:{}",this.getClass().getName(),zhaoshengrenyuan.toString());
        ZhaoshengrenyuanEntity oldZhaoshengrenyuanEntity = zhaoshengrenyuanService.selectById(zhaoshengrenyuan.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(zhaoshengrenyuan.getZhaoshengrenyuanPhoto()) || "null".equals(zhaoshengrenyuan.getZhaoshengrenyuanPhoto())){
                zhaoshengrenyuan.setZhaoshengrenyuanPhoto(null);
        }

            zhaoshengrenyuanService.updateById(zhaoshengrenyuan);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhaoshengrenyuanEntity> oldZhaoshengrenyuanList =zhaoshengrenyuanService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        zhaoshengrenyuanService.deleteBatchIds(Arrays.asList(ids));

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
            List<ZhaoshengrenyuanEntity> zhaoshengrenyuanList = new ArrayList<>();//上传的东西
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
                            ZhaoshengrenyuanEntity zhaoshengrenyuanEntity = new ZhaoshengrenyuanEntity();
//                            zhaoshengrenyuanEntity.setUsername(data.get(0));                    //账户 要改的
//                            zhaoshengrenyuanEntity.setPassword("123456");//密码
//                            zhaoshengrenyuanEntity.setZhaoshengrenyuanName(data.get(0));                    //招生人员姓名 要改的
//                            zhaoshengrenyuanEntity.setZhaoshengrenyuanPhone(data.get(0));                    //招生人员手机号 要改的
//                            zhaoshengrenyuanEntity.setZhaoshengrenyuanIdNumber(data.get(0));                    //招生人员身份证号 要改的
//                            zhaoshengrenyuanEntity.setZhaoshengrenyuanPhoto("");//详情和图片
//                            zhaoshengrenyuanEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            zhaoshengrenyuanEntity.setZhaoshengrenyuanEmail(data.get(0));                    //招生人员邮箱 要改的
//                            zhaoshengrenyuanEntity.setCreateTime(date);//时间
                            zhaoshengrenyuanList.add(zhaoshengrenyuanEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //招生人员手机号
                                if(seachFields.containsKey("zhaoshengrenyuanPhone")){
                                    List<String> zhaoshengrenyuanPhone = seachFields.get("zhaoshengrenyuanPhone");
                                    zhaoshengrenyuanPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> zhaoshengrenyuanPhone = new ArrayList<>();
                                    zhaoshengrenyuanPhone.add(data.get(0));//要改的
                                    seachFields.put("zhaoshengrenyuanPhone",zhaoshengrenyuanPhone);
                                }
                                //招生人员身份证号
                                if(seachFields.containsKey("zhaoshengrenyuanIdNumber")){
                                    List<String> zhaoshengrenyuanIdNumber = seachFields.get("zhaoshengrenyuanIdNumber");
                                    zhaoshengrenyuanIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhaoshengrenyuanIdNumber = new ArrayList<>();
                                    zhaoshengrenyuanIdNumber.add(data.get(0));//要改的
                                    seachFields.put("zhaoshengrenyuanIdNumber",zhaoshengrenyuanIdNumber);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<ZhaoshengrenyuanEntity> zhaoshengrenyuanEntities_username = zhaoshengrenyuanService.selectList(new EntityWrapper<ZhaoshengrenyuanEntity>().in("username", seachFields.get("username")));
                        if(zhaoshengrenyuanEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhaoshengrenyuanEntity s:zhaoshengrenyuanEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //招生人员手机号
                        List<ZhaoshengrenyuanEntity> zhaoshengrenyuanEntities_zhaoshengrenyuanPhone = zhaoshengrenyuanService.selectList(new EntityWrapper<ZhaoshengrenyuanEntity>().in("zhaoshengrenyuan_phone", seachFields.get("zhaoshengrenyuanPhone")));
                        if(zhaoshengrenyuanEntities_zhaoshengrenyuanPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhaoshengrenyuanEntity s:zhaoshengrenyuanEntities_zhaoshengrenyuanPhone){
                                repeatFields.add(s.getZhaoshengrenyuanPhone());
                            }
                            return R.error(511,"数据库的该表中的 [招生人员手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //招生人员身份证号
                        List<ZhaoshengrenyuanEntity> zhaoshengrenyuanEntities_zhaoshengrenyuanIdNumber = zhaoshengrenyuanService.selectList(new EntityWrapper<ZhaoshengrenyuanEntity>().in("zhaoshengrenyuan_id_number", seachFields.get("zhaoshengrenyuanIdNumber")));
                        if(zhaoshengrenyuanEntities_zhaoshengrenyuanIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhaoshengrenyuanEntity s:zhaoshengrenyuanEntities_zhaoshengrenyuanIdNumber){
                                repeatFields.add(s.getZhaoshengrenyuanIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [招生人员身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhaoshengrenyuanService.insertBatch(zhaoshengrenyuanList);
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
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectOne(new EntityWrapper<ZhaoshengrenyuanEntity>().eq("username", username));
        if(zhaoshengrenyuan==null || !zhaoshengrenyuan.getPassword().equals(password))
            return R.error("账号或密码不正确");
        String token = tokenService.generateToken(zhaoshengrenyuan.getId(),username, "zhaoshengrenyuan", "招生人员");
        R r = R.ok();
        r.put("token", token);
        r.put("role","招生人员");
        r.put("username",zhaoshengrenyuan.getZhaoshengrenyuanName());
        r.put("tableName","zhaoshengrenyuan");
        r.put("userId",zhaoshengrenyuan.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody ZhaoshengrenyuanEntity zhaoshengrenyuan, HttpServletRequest request) {
//    	ValidatorUtils.validateEntity(user);
        Wrapper<ZhaoshengrenyuanEntity> queryWrapper = new EntityWrapper<ZhaoshengrenyuanEntity>()
            .eq("username", zhaoshengrenyuan.getUsername())
            .or()
            .eq("zhaoshengrenyuan_phone", zhaoshengrenyuan.getZhaoshengrenyuanPhone())
            .or()
            .eq("zhaoshengrenyuan_id_number", zhaoshengrenyuan.getZhaoshengrenyuanIdNumber())
            ;
        ZhaoshengrenyuanEntity zhaoshengrenyuanEntity = zhaoshengrenyuanService.selectOne(queryWrapper);
        if(zhaoshengrenyuanEntity != null)
            return R.error("账户或者招生人员手机号或者招生人员身份证号已经被使用");
        zhaoshengrenyuan.setCreateTime(new Date());
        zhaoshengrenyuanService.insert(zhaoshengrenyuan);

        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id, HttpServletRequest request) {
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(id);
        zhaoshengrenyuan.setPassword("123456");
        zhaoshengrenyuanService.updateById(zhaoshengrenyuan);
        return R.ok();
    }

	/**
	 * 修改密码
	 */
	@GetMapping(value = "/updatePassword")
	public R updatePassword(String  oldPassword, String  newPassword, HttpServletRequest request) {
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById((Integer)request.getSession().getAttribute("userId"));
		if(newPassword == null){
			return R.error("新密码不能为空") ;
		}
		if(!oldPassword.equals(zhaoshengrenyuan.getPassword())){
			return R.error("原密码输入错误");
		}
		if(newPassword.equals(zhaoshengrenyuan.getPassword())){
			return R.error("新密码不能和原密码一致") ;
		}
        zhaoshengrenyuan.setPassword(newPassword);
		zhaoshengrenyuanService.updateById(zhaoshengrenyuan);
		return R.ok();
	}



    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectOne(new EntityWrapper<ZhaoshengrenyuanEntity>().eq("username", username));
        if(zhaoshengrenyuan!=null){
            zhaoshengrenyuan.setPassword("123456");
            zhaoshengrenyuanService.updateById(zhaoshengrenyuan);
            return R.ok();
        }else{
           return R.error("账号不存在");
        }
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrZhaoshengrenyuan(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(id);
        if(zhaoshengrenyuan !=null){
            //entity转view
            ZhaoshengrenyuanView view = new ZhaoshengrenyuanView();
            BeanUtils.copyProperties( zhaoshengrenyuan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = zhaoshengrenyuanService.queryPage(params);

        //字典表数据转换
        List<ZhaoshengrenyuanView> list =(List<ZhaoshengrenyuanView>)page.getList();
        for(ZhaoshengrenyuanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhaoshengrenyuanEntity zhaoshengrenyuan = zhaoshengrenyuanService.selectById(id);
            if(zhaoshengrenyuan !=null){


                //entity转view
                ZhaoshengrenyuanView view = new ZhaoshengrenyuanView();
                BeanUtils.copyProperties( zhaoshengrenyuan , view );//把实体数据重构到view中

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
    public R add(@RequestBody ZhaoshengrenyuanEntity zhaoshengrenyuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhaoshengrenyuan:{}",this.getClass().getName(),zhaoshengrenyuan.toString());
        Wrapper<ZhaoshengrenyuanEntity> queryWrapper = new EntityWrapper<ZhaoshengrenyuanEntity>()
            .eq("username", zhaoshengrenyuan.getUsername())
            .or()
            .eq("zhaoshengrenyuan_phone", zhaoshengrenyuan.getZhaoshengrenyuanPhone())
            .or()
            .eq("zhaoshengrenyuan_id_number", zhaoshengrenyuan.getZhaoshengrenyuanIdNumber())
//            .notIn("zhaoshengrenyuan_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhaoshengrenyuanEntity zhaoshengrenyuanEntity = zhaoshengrenyuanService.selectOne(queryWrapper);
        if(zhaoshengrenyuanEntity==null){
            zhaoshengrenyuan.setCreateTime(new Date());
            zhaoshengrenyuan.setPassword("123456");
        zhaoshengrenyuanService.insert(zhaoshengrenyuan);

            return R.ok();
        }else {
            return R.error(511,"账户或者招生人员手机号或者招生人员身份证号已经被使用");
        }
    }

}

