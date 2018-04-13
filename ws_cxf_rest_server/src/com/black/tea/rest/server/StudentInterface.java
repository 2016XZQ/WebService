package com.black.tea.rest.server;

import com.black.tea.rest.pojo.Student;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@WebService
@Path("/student")
public interface StudentInterface {
    //查询单个
    @GET
    @Produces(MediaType.APPLICATION_XML)//设定媒体类型
    @Path("/query/{id}")
    public Student query(@PathParam("id")long id);
    //查询多个
    @POST
    @Produces(MediaType.APPLICATION_JSON)//设定媒体类型
    @Path("/queryList/{name}")
    public List<Student> queryList(@PathParam("name") String name);
}
