package com.mayank.services.SpringSortAndPage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {
}
