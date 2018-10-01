package p.minn.dubbo.service;

import java.util.HashMap;
import java.util.Map;

import p.minn.common.utils.UtilCommon;
import p.minn.dubbo.api.IDemoService;

/**
 * 
 * @author minn 
 * @QQ:3942986006
 * 
 */
public class DemoServiceImpl implements IDemoService {

	public Object getMsg(String messageBody,String lang) {
		// TODO Auto-generated method stub
		  Map<String,Object> param=(Map<String, Object>) UtilCommon.gson2Map(messageBody);
		  Map<String,Object> rs=new HashMap<String,Object>();
		  rs.put("msg", "hello,"+param.get("name"));
		  return rs;
	}

}
