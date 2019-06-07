package com.maven.template.sbmaventemplate.controller;

import com.maven.template.sbmaventemplate.model.Employee;
import com.maven.template.sbmaventemplate.repository.EmployeeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="SB Maven Template system")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @ApiOperation(value = "View a list of available employees", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

//    @ApiOperation(value = "Download apple app")
//    @GetMapping(path = "/apple")
//    public void download(HttpServletResponse httpServletResponse) {
//        String redirectUrl = "https://itunes.apple.com/us/app/instagram/id389801252?mt=8";
//        httpServletResponse.setHeader("Location", redirectUrl);
//        httpServletResponse.setStatus(302);
//    }




}
