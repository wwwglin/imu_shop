package com.tyut.shop.service.impl;

import com.tyut.shop.dao.ChatMapper;
import com.tyut.shop.pojo.Chat;
import com.tyut.shop.pojo.ChatExample;
import com.tyut.shop.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwwglin@163.com on 2017/11/26.
 */
@Service("chatService")
public class ChatServiceImpl implements ChatService {

    @Autowired(required = false)
    ChatMapper chatMapper;

    @Override
    public void insertChatSelective(Chat chat) {
        chatMapper.insertSelective(chat);
    }

    @Override
    public List<Chat> selectChatByExample(ChatExample chatExample) {
        return chatMapper.selectByExample(chatExample);
    }
}