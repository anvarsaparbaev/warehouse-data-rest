package com.odegaa.repositories;

import com.odegaa.models.Category;
import com.odegaa.projections.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CategoryProjection.class,path = "category")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}