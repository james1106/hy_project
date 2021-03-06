package com.mockuai.giftscenter.core.manager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mockuai.giftscenter.common.domain.dto.GiftsPacketDTO;
import com.mockuai.giftscenter.core.BaseTest;
import com.mockuai.giftscenter.core.exception.GiftsException;
import com.mockuai.giftscenter.core.manager.GiftsPacketManager;

/**
 * Created by edgar.zr on 12/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppManagerImplTest extends BaseTest {

    @Autowired
    private GiftsPacketManager giftsPacketManager;

    @Test
    public void test() {
        try {
        	GiftsPacketDTO giftsPacketDTO = new GiftsPacketDTO();
        	//giftsPacketManager.addGifts(giftsPacketDTO, "asd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}