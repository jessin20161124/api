package com.jessin.practice.dubbo.service;

import com.jessin.practice.dubbo.model.DomainInfo;
import com.jessin.practice.dubbo.model.UserParam;

/**
 * @Author: jessin
 * @Date: 2022/1/1 1:22 下午
 */
public interface DomainService {
    DomainInfo queryAssociatedDomain(UserParam userParam);
}
