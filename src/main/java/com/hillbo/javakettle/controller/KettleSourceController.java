package com.hillbo.javakettle.controller;


import com.hillbo.javakettle.dao.KettleSourceDao;
import com.hillbo.javakettle.info.Constants;
import com.hillbo.javakettle.info.ResultInfo;
import com.hillbo.javakettle.pojo.KettleSource;
import com.hillbo.javakettle.service.KettleSourceService;
import com.sdata.meta.commons.common.info.Constants;
import com.sdata.meta.commons.common.info.ResultInfo;
import dao.KettleSourceDao;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import pojo.KettleSource;
import service.KettleSourceService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Controller
@Path("/kettleSource")
public class KettleSourceController {

    @Autowired
    private KettleSourceService kettleSourceService;

    @Autowired
    private KettleSourceDao kettleSourceDao;

    /**
     * 添加纳管配置
     */
    @POST
    @Path("/addKettleSource")
    @Produces(MediaType.APPLICATION_JSON)
    public String addKettleSource(@RequestBody KettleSource kettleSource) {
        // 参数校验
        if (null == kettleSource) {
            return new ResultInfo(Constants.RespondStatus.ERROR, "参数不能为空", null).toString();
        }
        return kettleSourceService.addKettleSource(kettleSource);
    }

    /**
     * 修改kettle纳管配置
     */
    @POST
    @Path("/updateKettleSource")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateKettleSource(@RequestBody KettleSource kettleSource) {
        // 参数校验
        if (null == kettleSource) {
            return new ResultInfo(Constants.RespondStatus.ERROR, "参数不能为空", null).toString();
        }
        return kettleSourceService.updateKettleSource(kettleSource);
    }

    /**
     * 根据id查询kettle纳管配置
     */
    @GET
    @Path("/queryKettleSourceById")
    @Produces(MediaType.APPLICATION_JSON)
    public String queryKettleSourceById(@QueryParam("id") String id) {
        // 参数校验
        if (StringUtils.isEmpty(id)) {
            return new ResultInfo(Constants.RespondStatus.ERROR, "参数为空！", null).toString();
        }

        // 数据库查询
        KettleSource kettleSource = kettleSourceDao.queryKettleSourceById(id);
        return new ResultInfo(Constants.RespondStatus.SUCESS, "查询成功！", kettleSource).toString();
    }

    /**
     * 删除kettle纳管配置
     */
    @GET
    @Path("/deleteKettleSourceById")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteKettleSourceById(@QueryParam("id") String id) {
        // 参数校验
        if (StringUtils.isEmpty(id)) {
            return new ResultInfo(Constants.RespondStatus.ERROR, "参数不能为空", null).toString();
        }
        return kettleSourceService.deleteKettleSourceById(id);
    }
}