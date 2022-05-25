package com.banner_management.backend.service;


import com.banner_management.backend.entity.SectionEntity;
import com.banner_management.backend.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    public List<SectionEntity> listSectionByPageId(int webId) {
        return sectionRepository.getSectionByPageId(webId);
    }

    public SectionEntity getById(Integer id){
        return sectionRepository.findById(id).get();
    }


    public Page<SectionEntity> getSectionByPageAndWebsiteId(int pageId, int number){
        PagingAndSortingRepository<SectionEntity, Integer> sectionRepo = sectionRepository;
        Page<SectionEntity> sections = ((SectionRepository) sectionRepo).getSectionPageByPageId(pageId, PageRequest.of(number, 5));
        return sections;
    }

    @Transactional
    public void save(SectionEntity sectionEntity) {
        sectionRepository.save(sectionEntity);
    }

    @Transactional
    public void delete(Integer id){
        try {
            sectionRepository.deleteById(id);
        }catch (NoSuchElementException e){
        }
    }
}

