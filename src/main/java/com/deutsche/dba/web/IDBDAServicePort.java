/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deutsche.dba.web;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Selvyn
 */
public interface IDBDAServicePort
{
    @GET
    @Path("/sayhello")
    @Produces(MediaType.TEXT_HTML)
    public Response sayHtmlHelloTest();
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response testConnection();
    
    @POST
    @Path("validate/{name}/{pwd}")
    //@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response validate(@PathParam("name")String name,
                                        @PathParam("pwd")String pwd);


    
}
