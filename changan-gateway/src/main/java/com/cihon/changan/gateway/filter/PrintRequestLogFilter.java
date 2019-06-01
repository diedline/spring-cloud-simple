package com.cihon.changan.gateway.filter;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cihon.changan.common.model.vo.TUser;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Component
public class PrintRequestLogFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintRequestLogFilter.class);


    @Override
    public String filterType() {
        //因为要 打印返回信息 所以必须用post
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        try {
            RequestContext ctx = RequestContext.getCurrentContext();
            HttpServletRequest request = ctx.getRequest();

            InputStream in = request.getInputStream();
            String reqBody = StreamUtils.copyToString(in, Charset.forName("UTF-8"));

//                JSONObject obj = new JSONObject();
//                obj.put("vinId","456");
//                Object userId = obj.get("vinId");
//                if (userId != null) {
//                    PrintRequestLogFilter.LOGGER.info("request userId:\t" + userId);
//                }
                //打印请求方法，路径
           //ip地址
            String ipAddr=PreFilter.getIpAddr(request);
            //用户
            TUser user = (TUser) request.getSession().getAttribute("session_user");
            //时间
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String nowTime = dateFormat.format( now );
            //成功-失败
            InputStream out = ctx.getResponseDataStream();
            String outBody = StreamUtils.copyToString(out, Charset.forName("utf-8"));
            JSONObject outJson = JSON.parseObject(outBody);
            String code = outJson.getString("code");
            if(code.equals("200")){
                //将请求对象存入JSON 对象中
                JSONObject object = JSON.parseObject(ipAddr + user.toString() + nowTime + "成功");
                LOGGER.info(object.toJSONString());
            }else {
                JSON.parseObject(ipAddr + user.toString() + nowTime + "失败");
            }
//
//            PrintRequestLogFilter.LOGGER.info("response body:\t" + outBody);
//            ctx.setResponseBody(outBody);
//
//            PrintRequestLogFilter.LOGGER.info("request url:\t" + request.getMethod() + "\t" +
//                        request.getRequestURI().toString());
//                Map<String, String[]> map = request.getParameterMap();
//                if (map != null) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append("request parameters:\t");
//                    for (Map.Entry<String, String[]> entry : map.entrySet()) {
//                        sb.append("[" + entry.getKey() + "=" + printArray(entry.getValue()) + "]");
//                    }
//                    PrintRequestLogFilter.LOGGER.info(sb.toString());
//                }
//                PrintRequestLogFilter.LOGGER.info("request body:\t" + reqBody);



        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    private String printArray(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i < arr.length -1){
                sb.append(",");
            }
        }
        return sb.toString();
    }


}
