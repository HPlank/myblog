package nuc.edu.hkj.myblog.common;
 
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
 
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
 
/**
 * @PackagName com.banxia.configcenter.util
 * @Classname RequestDataUtils
 * @Description 获取http 请求数据
 * @Date 2019-03-10 16:43
 * @Created by banxia
 */
public class RequestDataUtils {
 
    /**
     * @Author banxia
     * @Description //获取请求类型
     * @Date 16:46 2019-03-10
     * @Param [http]
     * @return java.lang.String
     **/
    public static String getMethod(HttpServletRequest http) {
        return http.getMethod();
    }
 
    /**
     * @Author banxia
     * @Description //获取url 上的参数
     * @Date 16:42 2019-03-10
     * @Param
     * @return com.alibaba.fastjson.JSONObject
     **/
    public static JSONObject getData(HttpServletRequest http) {
        Map<String, String[]> parameterMap = http.getParameterMap();
        JSON.toJSON(parameterMap);
        JSONObject jsonObject = new JSONObject();
        for (String key : parameterMap.keySet()) {
            String[] values = parameterMap.get(key);
            jsonObject.put(key, values[0]);
        }
        return jsonObject;
    }
 
    /**
     * @Author banxia
     * @Description //获取url+ post 的数据
     * @Date 16:45 2019-03-10
     * @Param [http]
     * @return java.util.HashMap<java.lang.String,com.alibaba.fastjson.JSONObject>
     **/
    public static HashMap<String, JSONObject> request(HttpServletRequest http) {
        HashMap<String, JSONObject> result = new HashMap<>();
        result.put("postData", postData(http));
        result.put("getData", getData(http));
        return result;
    }
 
    /**
     * @Author banxia
     * @Description //获取post 数据
     * @Date 16:47 2019-03-10
     * @Param [http]
     * @return com.alibaba.fastjson.JSONObject
     **/
    public static JSONObject postData(HttpServletRequest http) {
        StringBuffer data = dealInputStream(http);
        return JSON.parseObject(data.toString());
    }
 
    /**
     *
     * @param http
     * @return
     */
    public static StringBuffer dealInputStream(HttpServletRequest http) {
        StringBuffer data = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String s;
            while ((s = reader.readLine()) != null) {
                data.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}