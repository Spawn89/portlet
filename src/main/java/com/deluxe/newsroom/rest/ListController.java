package com.deluxe.newsroom.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deluxe.newsroom.model.Item;
import com.deluxe.newsroom.model.items;
import com.deluxe.newsroom.service.ListService;

@Component("listRestController")
@Path("/")
public class ListController {
    private final Logger LOG = LoggerFactory.getLogger(ListController.class);
    
    @Autowired ListService listService;
    
    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getList(@PathParam("id") long id){
        LOG.debug("JSON request for list of items received");
        List<Item> list = listService.generateListItems();
        return Response.status(200).entity(new items(list)).build();
    }
}
