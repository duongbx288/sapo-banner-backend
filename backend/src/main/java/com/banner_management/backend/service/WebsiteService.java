package com.banner_management.backend.service;

import com.banner_management.backend.entity.WebsiteEntity;
import com.banner_management.backend.repository.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class WebsiteService {

    @Autowired
    private WebsiteRepository websiteRepository;

    public List<WebsiteEntity> getAllWebsite(){
        return websiteRepository.findAll();
    }

    public WebsiteEntity getById(Integer id){
        return websiteRepository.findById(id).get();
    }

    @Transactional
    public void save(WebsiteEntity websiteEntity) {
        websiteRepository.save(websiteEntity);
    }

    @Transactional
    public void delete(Integer id){
        try {
            websiteRepository.deleteById(id);
        }catch (NoSuchElementException e){

        }
    }
}
