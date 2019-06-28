package com.qdhuafens.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

/**
 * @program: Huafens
 * @description: 日期格式转换类
 * @author: 张清
 * @create: 2019-06-25 06:42
 **/
public class DateConverterUtil implements Converter<String, java.util.Date> {
    // 定义日期格式
    private String datePattern = "MM-dd";
    @Override
    public Date convert(String source) {
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException(
                    "无效的日期格式，请使用这种格式:"+datePattern);
        }
    }

    public static void main(String args[])
    {
        DateConverterUtil dateConverterUtil = new DateConverterUtil();
        System.out.println(dateConverterUtil.convert("04-12"));
    }
}
