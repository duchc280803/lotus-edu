package com.example.demokhoahoc.repository;

import com.example.demokhoahoc.entity.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HocVienRepository extends JpaRepository<HocVien, Integer> {

    @Query("Select hv.hocVienId, hv.khoaHoc, hv.hoTen, hv.diaChi, hv.queQuan, hv.ngaySinh, hv.soDienThoai" +
            " FROM HocVien hv JOIN hv.khoaHoc kh " +
            "where kh.tenKhoaHoc =: value or hv.hoTen =: value")
    HocVien findByNameOrKhoa(@Param("value") String value);
}
