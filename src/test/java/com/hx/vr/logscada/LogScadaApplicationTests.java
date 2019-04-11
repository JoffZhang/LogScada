package com.hx.vr.logscada;


import com.hx.vr.logscada.modules.log.dao.BoxOperationLogMapper;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LogScadaApplicationTests {
   @Autowired
    private BoxOperationLogMapper boxOperationLogMapper;

    @Test
    public void test(){
        Random random = new Random();
        BoxOperationLog boxOperationLog = new BoxOperationLog();
        for (int i = 0; i < 10; i++) {
            short code = 0;
            String mac = "55:ab:3a:05:34:e6";
            if(random.nextInt(10) % 2 == 0){
                boxOperationLog.setSysType((byte) 10);
                code = NEWTV_WATCH_CODES[random.nextInt(3)];
            }else{
                boxOperationLog.setSysType((byte) 10);
                code = NEWTV_BEHAVIOR_CODES[random.nextInt(9)];
                //mac = "55:ab:3a:05:34:e6";
            }
            boxOperationLog.setStateCode(code);
            boxOperationLog.setSubCode((byte) random.nextInt(3));
            boxOperationLog.setBoxId(random.nextInt(2100000));
            boxOperationLog.setMacAddr(mac);
            boxOperationLog.setDeviceModel("HARDTYPE");
            boxOperationLog.setChannelId("channelId");
            boxOperationLog.setAppVersion("version");
            String label1 = "";
            String label2 = "";
            String label3 = "";
            String label4 = "";
            String label5 = "";
            String label6 = "";
            String json ="";
            if(code - 401 == 0){
                label1="家长ID";
                json="{\"pRoleName\":\"家长角色名称\"}";
            }
            if(code - 301 == 0){
                label1="节目集ID";
                label2="视频ID";
                label3="栏目ID";
                label4="页面ID";
                label5="1-手机点播 2-盒子点播 3-自动排播 4-盒子搜索 5-手机搜索";
                label6="视频开始时间点、视频结束时间点、视频总时长";
                json="{\"itemName\":\"节目集名称\",\"videoName\":\"视频名称\",\"multipleIntelligence\":\"多元智能\"}";
            }
            if(code - 302 == 0){
                label1="应用ID";
                json="{\"appName\":\"应用名称\"}";
            }
            if(code - 305 == 0){
                label1="课程包ID";
                label2="课程ID";
                label3="视频ID";
                label4="页面ID";
                label5="1-手机点播 2-盒子点播";
                label6="视频开始时间点、视频结束时间点、视频总时长";
                json="{\"coursePackageName\":\"节目集名称\",\"courseName\":\"视频名称\",\"videoName\":\"多元智能\",\"multipleIntelligence\":\"多元智能\"}";
            }
            if(code - 2204 == 0){
                label1="录音绘本ID";
                label2="家长ID";
                json="{\"dubbingName\":\"家长角色名称\",\"pRoleName\":\"家长角色名称\"}";
            }
            boxOperationLog.setJsonMsg(json);
            boxOperationLog.setLabel1(label1);
            boxOperationLog.setLabel2(label2);
            boxOperationLog.setLabel3(label3);
            boxOperationLog.setLabel4(label4);
            boxOperationLog.setLabel5(label5);
            boxOperationLog.setLabel6(label6);
            boxOperationLog.setOperateTime(randomDate("2018-01-01 00:00:00","2019-04-03 00:00:00"));
            boxOperationLogMapper.insert(boxOperationLog);

        }

    }

    @Test
    public void contextLoads() {
        Random random = new Random();
        BoxOperationLog boxOperationLog = new BoxOperationLog();
        for (int i = 0; i < 220; i++) {
            short code = 0;
            String mac = "55:ab:3a:05:34:e6";
            if(random.nextInt(10)%2 == 0){
                boxOperationLog.setSysType((byte) 10);
                code = NEWTV_WATCH_CODES[random.nextInt(3)];
            }else{
                boxOperationLog.setSysType((byte) 10);
                code = NEWTV_BEHAVIOR_CODES[random.nextInt(9)];
                //mac = "55:ab:3a:05:34:e6";
            }
            boxOperationLog.setStateCode(code);
            boxOperationLog.setSubCode((byte) random.nextInt(3));
            boxOperationLog.setBoxId(random.nextInt(2100000));
            boxOperationLog.setMacAddr(mac);
            boxOperationLog.setDeviceModel("HARDTYPE");
            boxOperationLog.setChannelId("channelId");
            boxOperationLog.setAppVersion("version");
            String label1 = "";
            String label2 = "";
            String label3 = "";
            String label4 = "";
            String label5 = "";
            String label6 = "";
            String json ="";
            if(code - 401 == 0){
                label1="家长ID";
                json="{\"pRoleName\":\"家长角色名称\"}";
            }
            if(code - 301 == 0){
                label1="节目集ID";
                label2="视频ID";
                label3="栏目ID";
                label4="页面ID";
                label5="1-手机点播 2-盒子点播 3-自动排播 4-盒子搜索 5-手机搜索";
                label6="视频开始时间点、视频结束时间点、视频总时长";
                json="{\"itemName\":\"节目集名称\",\"videoName\":\"视频名称\",\"multipleIntelligence\":\"多元智能\"}";
            }
            if(code - 302 == 0){
                label1="应用ID";
                json="{\"appName\":\"应用名称\"}";
            }
            if(code - 305 == 0){
                label1="课程包ID";
                label2="课程ID";
                label3="视频ID";
                label4="页面ID";
                label5="1-手机点播 2-盒子点播";
                label6="视频开始时间点、视频结束时间点、视频总时长";
                json="{\"coursePackageName\":\"节目集名称\",\"courseName\":\"视频名称\",\"videoName\":\"多元智能\",\"multipleIntelligence\":\"多元智能\"}";
            }
            if(code - 2204 == 0){
                label1="录音绘本ID";
                label2="家长ID";
                json="{\"dubbingName\":\"家长角色名称\",\"pRoleName\":\"家长角色名称\"}";
            }
            boxOperationLog.setJsonMsg(json);
            boxOperationLog.setLabel1(label1);
            boxOperationLog.setLabel2(label2);
            boxOperationLog.setLabel3(label3);
            boxOperationLog.setLabel4(label4);
            boxOperationLog.setLabel5(label5);
            boxOperationLog.setLabel6(label6);
            boxOperationLog.setOperateTime(randomDate("2018-01-01 00:00:00","2019-04-03 00:00:00"));
            boxOperationLogMapper.insert(boxOperationLog);
        }
    }
    private static Short[] NEWTV_WATCH_CODES ;
    private static Short[] NEWTV_BEHAVIOR_CODES ;
    @Before
    public void before(){
            NEWTV_WATCH_CODES = new Short[]{301,305,2204};
            NEWTV_BEHAVIOR_CODES = new Short[]{401,2500,2400,302,304,1010,1012,1013,1014};

    }
    /**
     * 在beginDate和endDate之间获取一个随机日期作为开始日期
     * @param beginDate  日期开始范围
     * @param endDate   日期结束范围
     * @param randNum  开始日期和结束日期的之间的天数
     * @return 依据 开始日期和randnum 算出结算日期并返回
     */

    public static Date randomDate(String beginDate, String endDate) {
        Date startTime = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date start = format.parse(beginDate);// 构造开始日期
            Date end = format.parse(endDate);// 构造结束日期

            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());

            //System.out.println(dateToString(startTime, "yyyy-MM-dd"));
            //System.out.println(dateToString(endTime, "yyyy-MM-dd"));
            startTime = new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return startTime;
    }

    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }
}
