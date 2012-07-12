package com.deluxe.newsroom.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.deluxe.newsroom.model.Item;

@Service
public class ListService {
    private final Logger LOG = LoggerFactory.getLogger(ListService.class);

    public List<Item> generateListItems(){
        LOG.debug("Service received request to generate list of items");
        
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(0, "Ukraine Protests Over Move to Russian Language", "http://www.youtube.com/watch?v=WZqqdKwcRq4&feature=g-trend"));
        items.add(new Item(1, "The 2012 Big Bay Boom San Diego Firework Show", "http://www.youtube.com/watch?v=JuJHfkXEI-o&feature=g-trend"));
        items.add(new Item(2, "Riquelme se va de Boca \"No voy a continuar\" 5-7-2012", "http://www.youtube.com/watch?v=J63woprAzJI&feature=g-trend"));
        items.add(new Item(3, "Corinthians vs Boca Juniors (2-0)- Gol Emerson - 04/06/2012", "http://www.youtube.com/watch?v=8aGc2jrgqlE&feature=g-trend"));
        return items;
    }
    
}
