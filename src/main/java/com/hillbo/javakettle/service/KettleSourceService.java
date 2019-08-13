package com.hillbo.javakettle.service;


import com.hillbo.javakettle.dao.KettleCarteDao;
import com.hillbo.javakettle.dao.KettleSourceDao;
import com.hillbo.javakettle.info.Constants;
import com.hillbo.javakettle.info.KettleConstants;
import com.hillbo.javakettle.info.ResultInfo;
import com.hillbo.javakettle.pojo.KettleCarte;
import com.hillbo.javakettle.pojo.KettleSource;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Service
@Log4j2
public class KettleSourceService {

    @Autowired
    private KettleCarteDao kettleCarteDao;

    @Autowired
    private KettleSourceDao kettleSourceDao;

    /**
     * 添加kettle纳管配置
     */
    @Transactional
    public String addKettleSource(KettleSource kettleSource) {

        Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();

        // carte信息补全
        List<KettleCarte> kettleCarteList = kettleSource.getKettleCarteList();
        if (CollectionUtils.isNotEmpty(kettleCarteList)) {

            // 判断是否是文件管理kettle，如果是，则carte的ip就是服务器的ip
            if (KettleConstants.KettleSourceType.FILE == kettleSource.getDb_type()) {
                // 服务器ip
                String serverIP = kettleSource.getServer_ip();
                for (KettleCarte kettleCarte : kettleCarteList) {
                    kettleCarte.setId(serverIP);
                }
            }
        }

        // 信息入库操作
        try {
            // 1、carte入库
            kettleCarteDao.addKettleCartes(kettleCarteList);
            // 2、资源配置入炉
            kettleSourceDao.addKettleSource(kettleSource);
        } catch (Exception e) {
            log.error(e);
            TransactionAspectSupport.currentTransactionStatus().releaseSavepoint(savePoint);
            return new ResultInfo(Constants.RespondStatus.ERROR, "kettle管理配置新增失败！", e).toString();
        }
        return new ResultInfo(Constants.RespondStatus.SUCESS, "kettle管理配置新增成功！", null).toString();
    }

    /**
     * 修改kettle纳管配置
     */
    @Transactional
    public String updateKettleSource(KettleSource kettleSource) {

        Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();

        try {
            // 更新数据库
            kettleSourceDao.updateKettleSource(kettleSource);
        } catch (Exception e) {
            log.error(e);
            TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);
            return new ResultInfo(Constants.RespondStatus.ERROR, "kettle纳管配置修改失败", e).toString();
        }
        return new ResultInfo(Constants.RespondStatus.SUCESS, "kettle纳管配置修改成功！", null).toString();
    }

    /**
     * 删除kettle纳管
     */
    @Transactional
    public String deleteKettleSourceById(String id) {

        Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();

        try {
            // 1、删除配置的carte
            kettleCarteDao.deleteKettleCarteByKettleSourceId(id);

            // 2、删除配置的KettleSource
            kettleSourceDao.deleteKettleSourceById(id);
        } catch (Exception e) {
            log.error(e);
            TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);
            return new ResultInfo(Constants.RespondStatus.ERROR, "kettle纳管删除失败！", null).toString();
        }
        return new ResultInfo(Constants.RespondStatus.SUCESS, "kettle纳管删除成功！", null).toString();
    }

}
