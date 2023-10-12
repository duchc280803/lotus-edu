use
nhanvien
select count(NhanVienID)
from nhanVien -- Đếm tổng số nhân viên trong công ty
select count(DuanID)
from duAn -- Đếm tổng số dự án đã được đề ra
select count(NhanVienID)
from phancong
where DuAnID = 1 -- Đếm tổng số nhân viên tham gia dự án số 1
select DuAnID, count(NhanVienID)
from PhanCong
GROUP BY DuAnID; -- Đếm số nhân viên tham gia mỗi dự án
select sum(SoGioLam)
from phancong
where NhanVienID = 1 -- tổng giờ làm của nhân viên 1
select NhanVienID, sum(SoGioLam)
from phancong
group by NhanVienId -- Tính tổng giờ làm của mỗi nhân viên
SELECT NhanVienID, DuAnID, SUM(SoGioLam) AS TongSoGioLam
FROM phancong
WHERE DuAnID = 1
GROUP BY NhanVienID, DuAnID
ORDER BY TongSoGioLam DESC LIMIT 1; -- Tìm nhân viên có tổng số giờ làm cao nhất dự án 1
SELECT DuAnID, COUNT(NhanVienID) AS SoLuongNhanVien
FROM PhanCong
GROUP BY DuAnID
ORDER BY SoLuongNhanVien ASC LIMIT 1; -- Tìm dự án có ít nhân viên tham gia nhất
SELECT NhanVienID, AVG(SoGioLam) AS SoGioLamTrungBinh
FROM PhanCong
GROUP BY NhanVienID LIMIT 1; -- Tìm nhân viên có số giờ làm cao nhất công ty
SELECT DuAnID, SUM(SoGioLam) AS TongSoGioLam
from phancong
group by duanid -- Tính tổng giờ làm của mỗi dự án
SELECT DuAnID, AVG(SoGioLam) AS SoGioLamTrungBinh
FROM PhanCong
GROUP BY DuAnID;-- Tính số giờ làm trung bình trong mỗi dự án
SELECT NhanVienID, DuAnID, AVG(SoGioLam) AS SoGioLamTrungBinh
FROM PhanCong
GROUP BY NhanVienID, DuAnID; -- Tính số giờ làm trung bình mỗi nhân viên (mỗi dự án làm trung bình bao nhiêu giờ)
select NhanVienID, DuANID, sum(SoGioLam) as soGio
from phancong
group by NhanVienID, DuAnID
Order by soGio ASC limit 3 -- Tìm 3 dự án có tổng số giờ làm của nhân viên là cao nhất
select NhanVienID, sum(SoGioLam) as soGio
from phancong
group by NhanVienID
Order by soGio ASC limit 3 -- Tìm 3 nhân viên có số giờ làm cao nhất công ty
select NhanVienID, sum(SoGioLam) as soGio
from phancong
Group by NhanVienID
having soGio > 300 -- Tìm những nhân viên có tổng giờ làm trên 300 giờ
select NhanVienID, sum(SoGioLam) as soGio
from phancong
Group by NhanVienID
having soGio > 150
   and soGio < 200 -- Tìm những nhân viên có tổng giờ làm từ 150 – 200 giờ
select DiaChi, count(NhanVienID)
from nhanvien
Group By DiaChi -- Đếm mỗi thành phố có bao nhiêu nhân viên
SELECT NhanVienID, SUM(SoGioLam) AS soGio
FROM PhanCong
GROUP BY NhanVienID
ORDER BY soGio DESC LIMIT 3;-- Tìm 3 nhân viên có số giờ làm thấp nhất công ty (không tính những nhân viên chưa tham gia dự án nào)
select DiaChi, count(NhanVienID) as nhanVien
from nhanvien
Group By DiaChi
having nhanVien < 3 -- Tìm những thành phố nào có ít hơn 3 nhân viên
SELECT NhanVienID, count(DuAnID) as duAn
FROM PhanCong
GROUP BY NhanVienID
ORDER BY duAn desc LIMIT 1; -- Tìm nhân viên tham gia nhiều dự án nhất