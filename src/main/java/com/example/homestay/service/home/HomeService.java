package com.example.homestay.service.home;

import com.example.homestay.model.DTO.HomeSearch;
import com.example.homestay.model.DTO.IncomeDTO;
import com.example.homestay.model.Homes;
import com.example.homestay.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeService implements IHomeService {
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public Optional<Homes> findById(Long id) {
        return homeRepository.findById(id);
    }

    @Override
    public Homes save(Homes homes) {
        return homeRepository.save(homes);
    }

    @Override
    public void remove(Long id) {
        homeRepository.deleteById(id);
    }

    @Override
    public List<Homes> findAll() {
        return homeRepository.findAll();
    }

    @Override
    public List<Homes> findByUsers(Long userId) {
        return homeRepository.findByUsers_Id(userId);
    }

    @Override
    public List<HomeSearch> getAllSearchHomes() {
        return homeRepository.getAllSearchHomes();
    }

    @Override
    public Optional<Homes> updateStatusAfterBooking(Long id) {
        return homeRepository.updateStatusAfterBooking(id);
    }

    @Override
    public List<IncomeDTO> getUserIncome(Long userId) {
        return homeRepository.getUserIncome(userId);
    }
    @Override
    public List<Homes> findHomeByHomeTypeId(Long id) {
        return homeRepository.findHomesByHomeTypeId(id);
    }

}
