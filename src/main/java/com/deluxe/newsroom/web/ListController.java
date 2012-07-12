package com.deluxe.newsroom.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deluxe.newsroom.service.ListService;

@Controller("ListWebController")
public class ListController {
    private final Logger LOG = LoggerFactory.getLogger(ListController.class);

    @Autowired
    ListService listService;
    
    @RequestMapping("/list")
    public String helloWorld(Model model){
        LOG.debug("received request for web page rendering of list of items");
        model.addAttribute("list", listService.generateListItems());
        return "list";
    }
}
