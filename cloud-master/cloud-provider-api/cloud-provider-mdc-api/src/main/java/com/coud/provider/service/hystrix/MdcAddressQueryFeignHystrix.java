package com.coud.provider.service.hystrix;

import com.coud.provider.service.MdcAddressQueryFeignApi;

/**
 * Created by fangzhijie on 2019/1/1.
 */
public class MdcAddressQueryFeignHystrix implements MdcAddressQueryFeignApi {

    @Override
    public String getById(final Long addressId) {
        return null;
    }

}
