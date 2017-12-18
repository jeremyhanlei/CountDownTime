package com.wd.countdowndemo;

import android.os.CountDownTimer;
import android.widget.Button;

/**
 * @describe: 倒计时
 * @author: hanlei
 * @time: 2017/12/18 上午10:07
 */

public class TimeCountUtils extends CountDownTimer{

    private Button mButton;

    public TimeCountUtils(Button button,long millisInFuture,long countDownInterval){
        super(millisInFuture,countDownInterval);
        this.mButton = button;
    }

    /**
     * 计时过程显示
     * @param millisInFuture
     */
    @Override
    public void onTick(long millisInFuture) {
        String time = millisInFuture/1000 + "秒";
        mButton.setText(time);
        mButton.setClickable(false);
    }

    @Override
    public void onFinish() {
        mButton.setText("重新获取");
        mButton.setClickable(true);
    }
}
