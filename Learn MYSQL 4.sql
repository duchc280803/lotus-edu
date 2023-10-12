use
sinhvien
SELECT SinhVienID, KhoaID, HoTen, MAX(hocbong) AS MaxHocBong
FROM sinhVien
GROUP BY SinhVienID, KhoaID, HoTen
order by MaxHocBong desc limit 1;-- Lấy thông tin sinh viên có học bổng cao nhất.
select SinhVienID, max(diemthi) AS maxDiemTHi
from ketqua
where lanthi = 1
GROUP BY SinhVienID -- Cho biết những sinh viên điểm thi lần 1 cao nhất môn học 1.
SELECT DISTINCT kq2.SinhVienID
FROM KetQua kq2
WHERE kq2.lanthi = 2
  AND kq2.DiemThi > ALL (
    SELECT kq3.DiemThi
    FROM KetQua kq3
    WHERE kq3.SinhVienID = kq2.SinhVienID
      AND kq3.lanthi = 1
);
-- Cho biết sinh viên có điểm thi lần 2 môn bất kỳ lớn hơn tất cả điểm thi lần 1 của những sinh viên khác.
SELECT *
FROM sinhVien
WHERE noisinh = (
    SELECT noisinh
    FROM sinhVien
    WHERE hoten LIKE '%Minh'
    LIMIT 1
    );
-- Cho biết sinh viên có nơi sinh cùng với Minh.
select MonHocID, Max(DiemThi) as diemMax
from KetQua
group by MonHocID -- Cho biết điểm thi cao nhất mỗi môn học.
SELECT sv.*
FROM sinhvien sv
         JOIN (
    SELECT khoaID, MAX(hocbong) AS hoc_bong_cao_nhat
    FROM sinhvien
    GROUP BY khoaID
) max_hoc_bong ON sv.khoaID = max_hoc_bong.khoaID AND sv.hocbong = max_hoc_bong.hoc_bong_cao_nhat;-- Cho biết sinh viên có học bổng cao nhất mỗi khoa
SELECT MonHocID, COUNT(SinhVienID) AS SoLuongSinhVien
FROM ketqua
GROUP BY MonHocID
ORDER BY SoLuongSinhVien DESC LIMIT 1; -- Môn học nào có nhiều sinh viên học nhất.
select KhoaID, count(SinhVienID) as SinhVienDongNhat
from SinhVien
where GioiTinh = 'nam'
group by khoaID
order by SinhVienDongNhat desc limit 1 -- Khoa nào có đông sinh viên nam nhất.
SELECT kq.*
FROM KetQua kq
         JOIN (
    SELECT monhocid, COUNT(SinhVienID) as sinhVienRot
    FROM ketQua
    WHERE lanthi = 1
      AND diemthi < 5
    GROUP BY monhocid
    ORDER BY COUNT(SinhVienID) DESC LIMIT 1
) AS subquery ON kq.monhocid = subquery.monhocid
WHERE kq.lanthi = 1
  AND kq.diemthi < 5;-- Cho biết môn nào có nhiều sinh viên rớt lần 1 nhiều nhất.
select *
from Ketqua
where lanthi = 1
  and diemThi
  and diemthi is null -- Cho biết sinh viên chưa thi môn học 1
select distinct MonHocID
from Ketqua
where lanthi = 1
  and diemThi
  and diemthi < 5 -- Cho biết những môn không có sinh viên rớt ở lần 1.
    Cho biết những sinh viên không có học bổng hoặc bị rớt môn học trong lần thi 1
Cho biết những sinh viên có học bổng hoặc không trượt môn nào trong lần thi 1
select MonHocID, Max(DiemThi) as diemMax, Min(DiemThi) as diemMin
from KetQua
group by MonHocID -- Điểm cao nhất và thấp nhất mỗi môn học.
SELECT MonHocID, COUNT(DISTINCT SinhVienID) AS SoLuongSinhVien
FROM KetQua
GROUP BY MonHocID
HAVING SoLuongSinhVien = (SELECT COUNT(*) FROM SinhVien); -- Tìm những môn mà tất cả sinh viên trong danh sách sinh viên đều học
SELECT DISTINCT kq.sinhvienid
FROM ketqua kq
WHERE kq.monhocid IN (
    SELECT monhocid
    FROM ketqua
    WHERE sinhvienid = 1
)
  AND kq.sinhvienid <> 1; -- Tìm những sinh viên học những môn giống sinh viên 1 (có thể nhiều hơn)

SELECT DISTINCT kq.sinhvienid
FROM ketqua kq
WHERE kq.monhocid IN (
    SELECT monhocid
    FROM ketqua
    WHERE sinhvienid = 1
);-- Tìm những sinh viên học những môn bằng đúng sinh viên 1 (không hơn không kém môn nào)

select *
from sinhvien
select *
from ketqua
select *
from monhoc