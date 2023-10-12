use
sinhvien
select SinhVienID, KhoaID, HoTEn, GioiTinh, (YEAR(CURRENT_DATE ()) - YEAR (NgaySinh)) as tuoi, NoiSinh, HocBong
from SinhVien
having tuoi > 21
   and tuoi < 23 -- Danh sách những sinh viên có tuổi từ 21 đến 23
Select *
from SinhVien
where Month (ngaysinh) between 3 and 5 -- Danh sách sinh viên sinh vào mùa xuân
SELECT *,
       CASE
           WHEN HocBong > 150000 THEN 'Học bổng cao'
           ELSE 'Mức trung bình'
           END AS muc_hoc_bong_status
FROM SinhVien; -- Cho biết thông tin về mức học bổng của các sinh viên. Trong đó, mức học bổng sẽ hiển thị là “Học bổng cao” nếu giá trị của học bổng lớn hơn 150,000 và ngược lại hiển thị là “Mức trung bình”
Select *,
       case
           when DiemThi < 5 then 'Trượt'
           else 'Qua Môn'
           end as KetQuaThi
from KetQua -- Cho biết kết quả điểm thi của các sinh viên (Qua môn, trượt).
SELECT KhoaID,
       COUNT(SinhVienID)                                 as TongSinhVien,
       SUM(CASE WHEN GioiTinh = 'Nam' THEN 1 ELSE 0 END) as SinhVienNam,
       SUM(CASE WHEN GioiTinh = 'Nu' THEN 1 ELSE 0 END)  as SinhVienNu
FROM sinhVien
GROUP BY KhoaID;-- Cho biết tổng số sinh viên, số sinh viên nam và số sinh viên nữ của mỗi khoa.
select count(SinhVienID),
       (YEAR(CURRENT_DATE ()) - YEAR (NgaySinh)) as tuoi
from SinhVien
GROUP BY tuoi
having tuoi > 19
   and tuoi < 23 -- Cho biết số lượng sinh viên theo từng tuổi [19-23]
Select count(SinhVienID) as SoLuongSVDau
from KetQua
where diemThi > 5
  and lanTHi = 1 -- Cho biết số lượng sinh viên đậu và số lượng sinh viên rớt của từng môn trong lần thi 1.
Select SinhVienID, count(monhocID) as soMonRot
from KetQua
where diemThi < 5
  and lanTHi = 1
group by SinhVienID
having soMonRot > 2 -- Cho biết danh sách sinh viên rớt 2 môn trở lên ở lần thi 1.
select KhoaID, count(SinhVienID) as sv
from SinhVien
group by KhoaID
Having sv > 2 -- Cho biết khoa nào có 2 sinh viên nam trở lên.
select MonHocID
from ketqua
where diemthi > 5
  and lanthi = 1 -- Cho biết môn không có sinh viên rớt ở lần 1.
select SinhVienID, AVG(diemthi) as dtb
from ketqua
where lanthi = 1
group by SinhVienID
having dtb > 7 -- Cho biết sinh viên có điểm trung bình lần 1 từ 7 trở lên và không rớt môn nào ở lần 1.
select SinhVienID, count(MonHocID) as hoc
from ketqua
where lanthi = 1
group by SinhVienID
having hoc > 3 -- Cho biết sinh viên đăng ký học hơn 3 môn mà thi lần 1 không bị rớt môn nào.
Select SinhVienId, KhoaId, HoTen, GioiTinh, NoiSinh, (YEAR(CURRENT_DATE ()) - YEAR (NgaySinh)) as tuoi
from sinhvien
where hocbong >= 0
  AND NoiSinh NOT IN ('Hà Nội', 'Đà Nẵng', 'Thái Bình', 'Hải Phòng')
group by SinhVienId, KhoaId, HoTen, GioiTinh, NoiSinh
having tuoi > 20 -- Tìm những sinh viên nam 20 tuổi có học bổng mà quê quán không phải 1 trong các tỉnh Hà Nội, Đà Nẵng, Hải Phòng, Thái Bình.
select *
from SinhVien
where gioitinh = 'nữ'
  and KhoaID = 1 -- Tìm những sinh viên nữ thuộc khoa số 1 sinh vào mùa hè và có học bổng
select SinhVienID, AVG(DiemThi) as dtb
FROM ketqua
where lanthi = 1
group by SinhVienID
having dtb > 7 -- Tìm môn học có điểm trung bình trên 7 mà không có sinh viên trượt ở lần thi 1
SELECT COUNT(MonHocID) as SoMonHocTruot, SinhVienID
FROM ketqua
WHERE diemThi < 5
GROUP BY SinhVienID
HAVING SoMonHocTruot >= 3; -- Tìm những sinh viên trượt 3 môn học trở lên
SELECT SinhVienID, COUNT(MonHocID) as hoc, AVG(DiemThi) as dtb
FROM ketqua
WHERE lanthi = 1
GROUP BY SinhVienID
HAVING hoc > 5
   AND dtb > 8; -- Tìm những sinh viên học 5 môn trở lên mà điểm trung bình thi lần 1 trên 8
select Max(diemthi) as diemCaoNhat, MIN(diemthi) diemThapNhat
from ketqua
where lanthi = 1 -- Điểm thi cao nhất và thấp nhất môn học 1
SELECT *
FROM ketqua k1
WHERE diemthi >= (
    SELECT MAX(diemthi)
    FROM ketqua k2
    WHERE k2.SinhVienID = k1.SinhVienID
      AND k2.lanthi = 1
);-- Tìm những sinh viên có điểm thi lần 2 cao hơn hoặc bằng điểm cao nhất trong lần thi 1
