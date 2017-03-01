package itemtemplate;

import javax.annotation.Resource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mockuai.itemcenter.common.api.BaseRequest;
import com.mockuai.itemcenter.common.api.ItemService;
import com.mockuai.itemcenter.common.api.Request;
import com.mockuai.itemcenter.common.api.Response;
import com.mockuai.itemcenter.common.constant.ActionEnum;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DeleteItemTemplateTest {
	@Resource
	private ItemService itemService;
	
	@Test
	public void deleteTest(){
		Request request = new BaseRequest();
		request.setParam("itemTemplateId", 198L);
		request.setParam("supplierId", 100L);
		request.setCommand(ActionEnum.DELETE_ITEM_TEMPLATE.getActionName());
		Response response = itemService.execute(request);
		System.out.println("**************************************");
		System.out.println("Model:" + response.getModule());
		System.out.println("message:" + response.getMessage());
		System.out.println("ErrorCode:" + response.getCode());
		System.out.println("TotalCount:" + response.getTotalCount());
		System.out.println("**************************************");
	}
	
	
}
