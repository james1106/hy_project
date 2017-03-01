

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mockuai.dts.common.api.DtsService;
import com.mockuai.dts.common.api.action.DtsRequest;
import com.mockuai.dts.common.api.action.Request;
import com.mockuai.dts.common.api.action.Response;
import com.mockuai.dts.common.constant.ActionEnum;
import com.mockuai.dts.common.domain.OrderExportQTO;
import com.mockuai.dts.core.util.JsonUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class OrderExportTest {

	@Resource
	private DtsService dtsService;

	@Test
	public void test(){
		Request request = new DtsRequest();
		request.setCommand(ActionEnum.EXPORT_ORDER.getActionName());
		System.out.println("begin addOrderComment");

		OrderExportQTO qto = new OrderExportQTO();
		qto.setSellerId(1l);
		request.setParam("orderExportQTO", qto);
	
		request.setParam("appKey", "3bc25302234640259fadea047cb7c7d3");
		
		Response response = dtsService.execute(request);
		System.out.println("response>>>>>>>>>>>>>>>>>>>>>"+ JsonUtil.toJson(response));
	}
}