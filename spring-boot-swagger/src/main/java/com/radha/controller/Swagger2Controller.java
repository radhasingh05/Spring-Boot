package com.radha.controller;

import com.radha.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Api(value = "StudentController")
public class Swagger2Controller {

    List<Student> students = new ArrayList<Student>();
    {
        students.add(new Student("Sajal", "IV", "India"));
        students.add(new Student("Lokesh", "V", "India"));
        students.add(new Student("Kajal", "III", "USA"));
        students.add(new Student("Sukesh", "VI", "USA"));
    }

    @ApiOperation(value = "Get Students",notes = "Returns the list of Students")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successful Response Send"),
            @ApiResponse(code = 404, message = "Student not found")
            , @ApiResponse(code = 500, message = "Server Error")})
    @GetMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }

    @ApiOperation(value = "Get Student" , notes = "Returns the student details based on the name provided")
    @ApiResponses(value = {@ApiResponse(code = 200 , message = "Successful response"),
           @ApiResponse(code = 404,message = "No Data found"),
           @ApiResponse(code = 500 , message = "Server Error")
    })
    @GetMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get Student by Country" , notes = "Returns the students list based on the country provided")
    @ApiResponses(value = {@ApiResponse(code = 200 , message = "Successful response"),
            @ApiResponse(code = 404,message = "No Data found"),
            @ApiResponse(code = 500 , message = "Server Error")
    })
    @GetMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {
        System.out.println("Searching Student in country : " + country);
        List<Student> studentsByCountry = students.stream().filter(x -> x.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
        System.out.println(studentsByCountry);
        return studentsByCountry;
    }

    @ApiOperation(value = "Get Student by Class",notes = "Returns students list based on the class provided")
    @ApiResponses(value = {@ApiResponse(code = 200 , message = "Successful response"),
            @ApiResponse(code = 404,message = "No Data found"),
            @ApiResponse(code = 500 , message = "Server Error")
    })
    @GetMapping(value = "/getStudentByClass/{cls}")
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls) {
        return students.stream().filter(x -> x.getCls().equalsIgnoreCase(cls)).collect(Collectors.toList());
    }


    @ApiOperation(value = "Save Student",notes = "Single object to save")
    @ApiResponses(value = {@ApiResponse(code = 200 , message = "Successful response"),
            @ApiResponse(code = 404,message = "No Data found"),
            @ApiResponse(code = 500 , message = "Server Error")
    })
    @PostMapping(value = "/addStudent")
    public Student saveStudent(@RequestBody Student student){
        return student;
    }

}
