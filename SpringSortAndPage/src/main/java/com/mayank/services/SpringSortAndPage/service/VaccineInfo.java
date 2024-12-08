package com.mayank.services.SpringSortAndPage.service;

import com.mayank.services.SpringSortAndPage.dao.Vaccine;
import com.mayank.services.SpringSortAndPage.dao.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VaccineInfo implements IVaccineInfo {

    @Autowired
    VaccineRepo repo;

    @Override
    public Iterable<Vaccine> getSortedVaccines(boolean status, String... properties) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);   //creating sort object
        return repo.findAll(sort);
    }

    @Override
    public void getPageableVaccines(int pageSize, boolean status, String... properties) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);

        int vaccineCount = 5;

        int pageCount = vaccineCount/pageSize;
        pageCount = (vaccineCount%pageSize)==0? pageCount : ++pageCount;

        for(int i=0; i<pageCount; i++)
        {
            PageRequest pageable = PageRequest.of(i, pageSize, sort);
            repo.findAll(pageable).forEach(System.out::println);
            System.out.println("-----------------------------------------------------------");
        }


    }
}
