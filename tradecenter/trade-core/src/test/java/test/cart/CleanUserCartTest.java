package test.cart;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mockuai.tradecenter.common.api.BaseRequest;
import com.mockuai.tradecenter.common.api.Request;
import com.mockuai.tradecenter.common.api.Response;
import com.mockuai.tradecenter.common.api.TradeService;
import com.mockuai.tradecenter.common.constant.ActionEnum;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CleanUserCartTest {
	@Resource
	private TradeService tradeService;
	
	/*@Test  
	public void test() {
		Request request = new BaseRequest();
		request.setCommand(ActionEnum.CLEAN_USER_CART.getActionName());
		
		Long userId = null;
		request.setParam("userId", userId);
		
		Response response = tradeService.execute(request);
		System.out.println(response);
	}
	
	@Test  
	public void test2() {
		Request request = new BaseRequest();
		request.setCommand(ActionEnum.CLEAN_USER_CART.getActionName());
		
		Long userId = 10L;
		request.setParam("userId",userId);
		
		Response response = tradeService.execute(request);
		System.out.println(response);
	}*/
	
	@Test  
	public void test3() {
		Request request = new BaseRequest();
		request.setCommand(ActionEnum.CLEAN_USER_CART.getActionName());
		
		Long userId = 11L;
		request.setParam("userId",userId);
		
		Response response = tradeService.execute(request);
		System.out.println(response);
	}
}
