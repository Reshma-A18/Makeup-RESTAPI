package com.example.ThreadEx.service;

import com.example.ThreadEx.model.Makeup;
import com.example.ThreadEx.repository.MakeupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakeupService
{
    private final MakeupRepository makeupRepository;

    public MakeupService(MakeupRepository makeupRepository) {
        this.makeupRepository = makeupRepository;
    }

    //create
    public void createData(Makeup makeups)
    {
        makeupRepository.save(makeups);
    }

    //read
    public List<Makeup> readData()
    {
        return makeupRepository.findAll();
    }

    //delete
    public void deleteData(long id)
    {
        makeupRepository.deleteById(id);
    }

    //update
    public void updateData(Makeup makeup, long id)
    {
        makeup.setItem_id(id);
        makeupRepository.save(makeup);
    }
}
