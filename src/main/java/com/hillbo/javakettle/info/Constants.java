package com.hillbo.javakettle.info;

/**
 * Restful使用的常量类
 *
 * @author williams
 * @Description
 * @date 2017年4月13日 上午10:29:32
 */
public class Constants {

    /**
     * @author Administrator
     * @Description 状态码
     * @date 2017年4月13日 下午5:55:37
     */
    public final static class RespondStatus {

        /**
         * 执行成功
         */
        public final static Integer SUCESS = 200;

        /**
         * 未登录
         */
        public final static Integer ERROR = 500;

        /**
         * 无权访问
         */
        public final static Integer FORBIDDEN = 403;

        /**
         * 用户请求的格式不可解析（比如用户请求JSON格式）。
         */
        public final static Integer DATA_NOT_ACCEPTABLE = 406;

        /**
         * 魔鬼数字
         */
        public final static Integer NUM = 1;
    }

    /**
     * @author dell
     * @Description 校验信息
     * @date 2017年4月17日 上午9:56:10
     */
    public static class ValidationInfo {
        /**
         * id长度
         */
        public static final Integer ID_LENGTH = 64;

        /**
         * 名称长度
         */
        public static final Integer NAME_LENGTH = 64;
    }


    /**
     * 标点符号
     *
     * @author Administrator
     * @Description
     * @date 2017年4月13日 下午5:11:37
     */
    public static class Symbol {

        public static final String STOP = "。";

        public static final String COMMA = "，";

    }

    /**
     * @author williams
     * @Description 返回信息描述
     * @date 2017年4月13日 下午5:08:22
     */
    public static class RespondMessage {

        public static final String SAVE_SUCCESS = "保存成功";

        public static final String INSERT_SUCCESS = "插入成功";

        public static final String DELETE_SUCCESS = "删除成功";

        public static final String UPDATE_SUCCESS = "更新成功";

        public static final String QUERY_SUCCESS = "查询成功";

        public static final String INSERT_ERROR = "插入失败";

        public static final String DELETE_ERROR = "删除失败";

        public static final String UPDATE_ERROR = "更新失败";

        public static final String QUERY_ERROR = "查询失败";

        public static final String LINK_SUCCESS = "连接成功";

        public static final String LINK_ERROR = "连接失败";

        public static final String LINK_INFO = "暂时只支持关系型数据库";

        public static final String PARAM_IS_NULL = "参数为空";

        public static final String JSON_ERROR = "字符串解析错误";

        public static final String ID_OR_NAME_EXIST = "id或者名称已存在";

        public static final String SOURCE_NOT_EXIST = "数据源不存在";

        public static final String PRIMARY_KET_ERROR = "主键冲突";

        public static final String USER_NOT_LOGIN = "用户未授权登录";

        public static final String COLUMN_NOT_NULL = "资产库结构不能为空";

        public static final String ID_UNEXIST = "id不存在，请输入正确的id";

        public static final String TABLE_UNEXIST = "该资产下没有表";

        public static final String SOURCE_TABLE_TYPE = "该资产的数据源类型不是关系型表结构";

        public static final String DATA_NOT_EXIST = "该id对应的数据不存在,查询失败";

        public static final String ID_AND_NAME_NULL_OR_LENGTH = "id/名称为空或者过长";

        public static final String ID_LENGTH_CODE = "ID长度范围1~37";

        public static final String NAME_LENGTH_CODE = "NAME长度范围1~64";

        public static final String ID_NOT_TRUE = "请输入正确的数据源ID";

        public static final String DATA_ERROR = "数据不存在，创建失败";

        public static final String SQL_NULL = "sql语句错误，创建表失败";

        public static final String ID_NULL = "id不能为空";

        public static final String LOGINNAME_OR_PASSWORD = "登录名或密码为空";

        public static final String LOGINNAME_EXIST = "登录名已存在";

        public static final String INSERT_TABLE = "在该数据源下新增表成功";

        public static final String STORAGE_ID_EXIST = "存储表中该id已存在";

        public static final String STORAGE_DATA_NULL_EXIST = "存储表中该id对应的数据不存在";

        public static final String PARENTID_CHANGED = "父组织不允许修改";

        public static final String SUCCESS_PAY = "支付成功";

        public static final String FAILED_PAY = "支付失败";

        public static final String WAITING_PAY = "等待支付";

        public static final String TIMEOUT_PAY = "订单超时";
        /**
         * 用于批量操作成功的名称汇总信息头
         */
        public static final String SUCESS_OPER_PREFIX = "操作成功 : ";

        /**
         * 用于批量操作失败的名称汇总信息头
         */
        public static final String ERR_OPER_PREFIX = "操作失败 : ";

        public static final String INCOMPELET_INFO_COUNT = "信息不全或参数错误的个数为: ";

        public static final String DATA_STREAM_NOT_FOUND = "数据流未找到.";
    }

    public static class AuthType {

        // String PUBLIC = "public";

        public static final String PRIVATE = "private";

        public static final String PARTIAL = "partial";

        public static final String MEETINGPUBLIC = "meetingpublic";

        public static final String CONFIG_KEY = "privilege.default";

        public static final String DEFAULT = PRIVATE;

    }

    public static class ResourceType

    {

        public static final String ASSET = "Asset";

        public static final String DATAFLOW = "Dataflow";

        public static final String ANALYSIS = "Analysis";

        public static final String CATALOG = "Catalog";

        public static final String DATASOURCE = "DataSource";

        public static final String DASHBOARD = "Dashboard";

        public static final String BIGSCREEN = "Bigscreen";

        public static final String DATAEXTRACTOR = "Dataextractor";

        public static final String LINEAGEMONITOR = "Lineagemonitor";

        public static final String DATAREPORTING = "Datareporting";

    }

    public static class InitialMeetingAssetId {

        public static final String REGISTEREDUSERSASSETID = "registeredUsersAssetId";

        public static final String MEETINGENTITYASSETID = "meetingEntityAssetId";

        public static final String TICKETINFORMATIONASSETID = "ticketInformationAssetId";

        public static final String GUESTINFORMATIONASSETID = "guestInformationAssetId";

    }

    public static class InitialMeetingAnalysisId {

        public static final String HISTORICALREGISTRATIONTOTAL = "historicalRegistrationTotal";

        public static final String HISTORICALATTENDEDTOTAL = "historicalAttendedTotal";

    }

    public static class InitialMeetingDashboardId {

        public static final String INITIALDASHBOARDID = "initialDashboardId";

    }

    public static class RoleType {

        public static final String SYSADMIN = "1";

        public static final String NORMAL = "2";
    }

    public static class UserType {

        public static final String PRODUCER = "1";

        public static final String CONSUMER = "2";
    }

    public static class PlatformType

    {

        public static final String BUSINESS = "business";

        public static final String CUSTOMER = "customer";
    }

    public static class CatalogType {

        public static final int ASSETS = 0;

        public static final int ASSETS_BASIC = 0;

        public static final int ASSETS_THEME = 9;

        public static final int ASSETS_EXTERNAL = 10;

        public static final int EXCHANGE = 1;

        public static final int ANALYSIS = 2;

        public static final int BIGSCREEN = 3;

        public static final int ASSETSQUALITY = 4;

        public static final int ASSETSSECURITY = 5;

        public static final int DASHBOARD = 6;

        public static final int CUSTOMAPP = 8;

        public static final int LINEAGEMONITOR = 12;
    }

    public static class CatalogLevel {

        public static final int DEFAULT = 0;

        public static final int CUSTOMIZE = 1;

        public static final int MEETING = 2;
    }

    public static class InitialCatalogId {

        public static final String DEFAULT = "default";

        public static final String MEETING = "meeting";

        public static final String DATAREPORTING = "data_reporting";
    }


    public static class AssetType {

        public static final Integer BASSE = 0;//基础

        public static final Integer THEME = 1;//主题

        public static final Integer EXTERNAL = 2;//外部

    }

}
