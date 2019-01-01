package com.fonxian.cloud.provider.web.rpc;

import com.coud.provider.service.MdcAddressQueryFeignApi;
import com.fonxian.cloud.provider.service.MdcAddressService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by fangzhijie on 2019/1/1.
 */
@RestController
public class MdcAddressQueryFeignClient implements MdcAddressQueryFeignApi {

    @Resource
    private MdcAddressService mdcAddressService;

    @Override
    public String getById(@PathVariable("addressId") Long addressId) {
        return mdcAddressService.getById(addressId);
    }
}
