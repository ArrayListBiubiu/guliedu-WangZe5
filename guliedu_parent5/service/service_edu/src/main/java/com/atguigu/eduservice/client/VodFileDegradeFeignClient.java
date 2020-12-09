package com.atguigu.eduservice.client;

import com.atguigu.commonutils.R;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 当发生超时时，会调用这个实现类的方法
 * 而且可以跳过阻塞“vodClient.deleteVideoAliyun(videoSourceId)”语句，继续向下执行
 */
@Component
public class VodFileDegradeFeignClient implements VodClient {

    @Override
    public R deleteVideoAliyun(String videoId) {
        return R.error();
    }

    @Override
    public R deleteMoreVideo(List videoIdList) {
        return R.error();
    }
}
