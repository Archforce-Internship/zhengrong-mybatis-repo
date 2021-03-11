package util;

import org.junit.Test;

import java.util.UUID;

/**
 * @author 517
 * @date 2021-03-11 - 10:27
 */
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void out2(){
        System.out.println(IDutils.getId());
    }

}
