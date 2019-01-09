package com.coud.provider.service.hystrix;

import com.coud.provider.service.MdcAddressQueryFeignApi;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhijie on 2019/1/1.
 */
@Component
public class MdcAddressQueryFeignHystrix implements MdcAddressQueryFeignApi {

    @Override
    public String getById(final Long addressId) {
        System.out.println("启动断路保护");
        return addressId + "";
    }

}
