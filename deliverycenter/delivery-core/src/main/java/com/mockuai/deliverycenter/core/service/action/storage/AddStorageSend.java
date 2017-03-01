//package com.mockuai.deliverycenter.core.service.action.storage;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//
//import com.mockuai.deliverycenter.common.api.DeliveryResponse;
//import com.mockuai.deliverycenter.common.constant.ActionEnum;
//import com.mockuai.deliverycenter.common.dto.storage.StorageSendDTO;
//import com.mockuai.deliverycenter.core.exception.DeliveryException;
//import com.mockuai.deliverycenter.core.manager.storage.StorageSendManager;
//import com.mockuai.deliverycenter.core.service.RequestContext;
//import com.mockuai.deliverycenter.core.service.action.Action;
//import com.mockuai.deliverycenter.core.util.ResponseUtil;
//
//@Service
//public class AddStorageSend implements Action {
//	@Resource
//	StorageSendManager storageSendManager;
//
//	/**
//	 * 新增发货仓库接口
//	 */
//	@Override
//	public DeliveryResponse execute(RequestContext context)
//			throws DeliveryException {
//
//		// 获取参数
//		StorageSendDTO storageSendDTO = (StorageSendDTO) context.getRequest()
//				.getParam("storageSendDTO");
//		// 新增发货仓库
//		storageSendManager.addStorageSend(storageSendDTO);
//		// 返回response对象
//		return ResponseUtil.getResponse(storageSendDTO);
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return ActionEnum.ADD_STORAGE_SEND.getActionName();
//	}
//}
