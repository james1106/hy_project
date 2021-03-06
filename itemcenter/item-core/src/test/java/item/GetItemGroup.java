package item;

import com.mockuai.itemcenter.common.api.BaseRequest;
import com.mockuai.itemcenter.common.api.ItemService;
import com.mockuai.itemcenter.common.api.Request;
import com.mockuai.itemcenter.common.api.Response;
import com.mockuai.itemcenter.common.constant.ActionEnum;
import com.mockuai.itemcenter.common.domain.dto.ItemDTO;
import com.mockuai.itemcenter.core.manager.MarketingManager;
import com.mockuai.itemcenter.core.util.JsonUtil;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import util.AppKeyEnum;
import util.RequestFactory;

import javax.annotation.Resource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class GetItemGroup {


	@Resource
	private ItemService itemService;

	@Test
	/**
	 * 正常GET
	 */
	public void test001() {

		Request request = new BaseRequest();
		request.setParam("groupId",652L);
        request.setParam("sellerId",1841254L);
		request.setParam("appKey",AppKeyEnum.HAIYUN.getAppKey());
		request.setCommand(ActionEnum.GET_ITEM_GROUP.getActionName());
		Response response = itemService.execute(request);
		System.out.println("**************************************");
		System.out.println("Model:" + response.getModule());
		System.out.println("message:" + response.getMessage());
		System.out.println("ResponseCode:" + response.getCode());
		System.out.println("TotalCount:" + response.getTotalCount());
		System.out.println("**************************************");
		ItemDTO item  = (ItemDTO)(response.getModule());
		System.out.println(item.getItemImageDTOList().get(0));

	}

}
