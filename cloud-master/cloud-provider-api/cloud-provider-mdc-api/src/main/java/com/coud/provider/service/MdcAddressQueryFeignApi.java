package com.coud.provider.service;

import com.coud.provider.service.hystrix.MdcAddressQueryFeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by fangzhijie on 2019/1/1.
 */
@FeignClient(value = "paascloud-provider-mdc",fallback = MdcAddressQueryFeignHystrix.class)
public interface MdcAddressQueryFeignApi {

    @PostMapping(value = "/api/address/getById/{addressId}")
    String getById(@PathVariable("addressId") Long addressId);

}
