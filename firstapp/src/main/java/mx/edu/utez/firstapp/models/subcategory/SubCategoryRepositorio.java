package mx.edu.utez.firstapp.models.subcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepositorio extends JpaRepository< SubCategory,Long> {

    @Query(value = "UPDATE sub_category SET status = :status WHERE id",nativeQuery = true)
    @Modifying
    int updateStatusById(
            @Param("status") Boolean status,
            @Param("id")Long id);
    boolean existsByName(String name);
}
