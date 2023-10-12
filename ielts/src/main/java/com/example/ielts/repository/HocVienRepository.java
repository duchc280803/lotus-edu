package com.example.ielts.repository;

import com.example.ielts.entity.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HocVienRepository extends JpaRepository<HocVien, Integer> {

    @Query("SELECT hv FROM HocVien hv JOIN hv.listLop l ORDER BY l.ngayDangKy DESC")
    List<HocVien> findAllHocVienWithNgayDangKyDesc();

    @Query("SELECT hv FROM HocVien hv WHERE FUNCTION('YEAR', hv.ngaySinh) = 2003 AND hv.hoVaTen LIKE %:ten%")
    List<HocVien> findHocVien2002WithName(@Param("ten") String ten);

}
