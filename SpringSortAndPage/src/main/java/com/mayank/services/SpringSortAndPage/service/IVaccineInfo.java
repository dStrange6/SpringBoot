package com.mayank.services.SpringSortAndPage.service;

import com.mayank.services.SpringSortAndPage.dao.Vaccine;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IVaccineInfo
{
    Iterable<Vaccine> getSortedVaccines(boolean status, String... properties);

    void getPageableVaccines(int pageSize, boolean status, String... properties);
}
