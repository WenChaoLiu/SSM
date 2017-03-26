package cym.ssm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenyuming on 2017/3/23.
 */
public class CustomDateConverter implements Converter<String, Date> {

    public Date convert(String resource) {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //转换成功
            return simpleDateFormat.parse(resource);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //转换失败
        return null;
    }
}
