package com.jessin.practice.dubbo.service;

import com.jessin.practice.dubbo.model.User;
import com.jessin.practice.dubbo.model.UserParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jessin
 * @Date: 19-11-24 上午11:23
 */
public interface UserService {
    User getUser();

    User getUser(UserParam userParam);

    User getUser(int age);

    User getUser(UserParam userParam,
            int type,
            String note,
            int[] ages,
            List<Integer> list);

    User getUser(List<UserParam> list,
            ArrayList<UserParam> list2,
            Map<String, UserParam> userParamMap,
            HashMap<String, UserParam> userParamMap2);

    User getUser(List list, Map userParamMap);
}
