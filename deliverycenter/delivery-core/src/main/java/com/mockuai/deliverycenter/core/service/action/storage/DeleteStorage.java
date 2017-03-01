//package com.mockuai.deliverycenter.core.service.action.storage;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//
//import com.mockuai.deliverycenter.common.api.DeliveryResponse;
//import com.mockuai.deliverycenter.common.constant.ActionEnum;
//import com.mockuai.deliverycenter.core.exception.DeliveryException;
//import com.mockuai.deliverycenter.core.manager.storage.StorageManager;
//import com.mockuai.deliverycenter.core.service.RequestContext;
//import com.mockuai.deliverycenter.core.service.action.Action;
//import com.mockuai.deliverycenter.core.util.ResponseUtil;
//
//@Service
//public class DeleteStorage implements Action {
//	@Resource
//	StorageManager storageManager;
//
//	/**
//	 * 删除仓库接口
//	 */
//	@Override
//	public DeliveryResponse execute(RequestContext context)
//			throws DeliveryException {
//		// 获取参数
//		Integer id = (Integer) context.getRequest().getParam("id");
//		// 删除仓库
//		storageManager.deleteStorage(id);
//		// 返回response对象
//		return ResponseUtil.getResponse(true);
//
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return ActionEnum.DELETE_STORAGE.getActionName();
//	}
//}