package com.jessin.practice.dubbo.service;

import com.jessin.practice.dubbo.model.AppInfo;
import com.jessin.practice.dubbo.model.BizType;
import com.jessin.practice.dubbo.model.Result;
import com.jessin.practice.dubbo.model.User;
import com.jessin.practice.dubbo.model.UserParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @Author: jessin
 * @Date: 19-11-24 上午11:23
 */
public interface UserService {
    User getException();

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

    Map<String, User> getReturn(AppInfo<User> appInfo);

    Map<String, Map<String, User>> getReturn2(AppInfo appInfo);

    Map<String, List<User>> getReturn3(AppInfo<User>[] appInfos);

    Result getReturn4(List<List<UserParam>> queryParam);

    Result<User> getReturn5(List<ArrayList<UserParam>> queryParam);

    Result<User> getReturn6(List<AppInfo<User>> queryParam, BizType biz);

    /**
     * test return CompletableFuture
     * @param age
     * @return
     */
    CompletableFuture getReturn7(int age);

    CompletableFuture<User> getReturn8(int age);

    CompletableFuture<Result<User>> getReturn9(int age);

    CompletableFuture<Result<User>> getReturnTimeout(int age);
}
