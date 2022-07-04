package com.lishijiee.boot;


import com.lishijiee.boot.utils.id.SnowFlakeFactory;
import com.lishijiee.boot.utils.id.SnowFlakeLoader;
import org.junit.Test;

/**
 * @author
 * @version 1.0.0
 * @description
 */
public class SnowFlakeFactoryTest {
    @Test
    public void testCreateDefaultID(){
        for(int i = 0; i < 100; i++){
            System.out.println(SnowFlakeFactory.getSnowFlakeFromCache().nextId());
        }
    }

    @Test
    public void testCreateID(){
        for(int i = 0; i < 100; i++){
            System.out.println(SnowFlakeFactory.getSnowFlakeByDataCenterIdAndMachineIdFromCache(SnowFlakeLoader.getDataCenterId(), SnowFlakeLoader.getDataCenterId()).nextId());
        }
    }
}
