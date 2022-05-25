package com.banner_management.backend.repository;

import com.banner_management.backend.entity.SectionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<SectionEntity, Integer> {

    @Query(value = "select * from sections where id = ?1", nativeQuery = true)
    SectionEntity getSectionById(int sectionId);

    @Query(value = "select * from sections where page_id = ?1", nativeQuery = true)
    List<SectionEntity> getSectionByPageId(int pageId);

    @Query(value = "select * from sections where page_id = ?1", nativeQuery = true)
    Page<SectionEntity> getSectionPageByPageId(int pageId, Pageable pageable);
}
