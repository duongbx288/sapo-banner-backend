package com.banner_management.backend.service;

import com.banner_management.backend.entity.PageEntity;
import com.banner_management.backend.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PageService {

    @Autowired
    PageRepository pageRepository;

    public PageEntity getPageById (int pageId){
        return pageRepository.getById(pageId);
    }

    @Transactional
    public void save(PageEntity pageEntity){
        pageRepository.save(pageEntity);
    }

    public void delete(int pageId){
        pageRepository.deleteById(pageId);
    }
}
