package com.imu.shop.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by WangLin on 2017/11/22.
 */
@Controller
public class VerificationCodeImgController {
    @RequestMapping("/verificationcodeimg")
    public ModelAndView verificationcodeimg() {
        ModelAndView verificationcodeimg = new ModelAndView();
        verificationcodeimg.setViewName("verificationcodeimg");
        return verificationcodeimg;
    }
}
