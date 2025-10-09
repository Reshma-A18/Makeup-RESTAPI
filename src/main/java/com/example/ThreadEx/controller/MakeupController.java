package com.example.ThreadEx.controller;

import com.example.ThreadEx.model.Makeup;
import com.example.ThreadEx.service.MakeupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MakeupController
{
    private final MakeupService makeupService;

    public MakeupController(MakeupService makeupService) {
        this.makeupService = makeupService;
    }

    @PostMapping("/create")
    public void createMakeup(@RequestBody Makeup makeups)
    {
        makeupService.createData(makeups);
    }

    @GetMapping("/read")
    public List<Makeup> readMakeup()
    {
        return makeupService.readData();
    }

    @DeleteMapping("del/{id}")
    public void deleteMakeup(@PathVariable long id)
    {
        makeupService.deleteData(id);
    }

    @PutMapping("up/{id}")
    public void updateMakeup(@RequestBody Makeup makeup,@PathVariable long id)
    {
        makeupService.updateData(makeup,id);
    }
}
