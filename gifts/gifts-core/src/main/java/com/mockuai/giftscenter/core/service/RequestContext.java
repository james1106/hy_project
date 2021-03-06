package com.mockuai.giftscenter.core.service;

import com.mockuai.giftscenter.common.api.GiftsResponse;

/**
 * 当前请求的上下文容器
 *
 * @author wujin.zzq
 */
public class RequestContext<T> extends Context {
    private static final long serialVersionUID = -1054539809433963262L;

    /**
     * 系统级别的上下文容器
     */
    private AppContext appContext;

    /**
     * 当前请求的请求对象
     */
    private SeckillRequest request;

    /**
     * 返回的response对象
     */
    @SuppressWarnings("rawtypes")
    private GiftsResponse response;

    /**
     * @param appContext
     * @param request
     */
    public RequestContext(AppContext appContext, SeckillRequest request) {
        this.appContext = appContext;
        this.request = request;
    }

    /**
     * @return the appContext
     */
    public AppContext getAppContext() {
        return appContext;
    }

    /**
     * @return the request
     */
    public SeckillRequest getRequest() {
        return request;
    }

    /**
     * @return the response
     */
    @SuppressWarnings("rawtypes")
    public GiftsResponse getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    @SuppressWarnings("rawtypes")
    public void setResponse(GiftsResponse response) {
        this.response = response;
    }
}