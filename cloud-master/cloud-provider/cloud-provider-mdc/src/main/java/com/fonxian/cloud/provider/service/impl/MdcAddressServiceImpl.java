package com.fonxian.cloud.provider.service.impl;

import com.fonxian.cloud.provider.service.MdcAddressService;
import org.springframework.stereotype.Service;

/**
 * Created by fangzhijie on 2019/1/1.
 */
@Service
public class MdcAddressServiceImpl implements MdcAddressService {

    @Override
    public String getById(Long id) {
        int a = 1 / 0;
        return "test" + id;
    }


}
