use
hocsinh
select *
from hocsinh
where HOTEN like 'T%' -- Danh sách các học sinh có họ tên bắt đầu bằng chữ T
select *
from hocsinh
where HOTEN like '%I' --  Liệt kê danh sách những học sinh có chữ cái cuối cùng trong tên là I
select *
from hocsinh
where HOTEN like '_N%' -- Danh sách những học sinh có ký tự thứ hai của họ tên là chữ N
SELECT *
FROM hocsinh
WHERE HOTEN LIKE '%Thị%'; -- Liệt kê những học sinh mà họ tên có chứa chữ Thị.
SELECT *
FROM hocsinh
WHERE LEFT (HOTEN, 1) BETWEEN 'a' AND 'm'; -- Cho biết danh sách những học sinh có ký tự đầu tiên của họ tên nằm trong khoảng từ a đến m
SELECT *
FROM hocsinh
WHERE Diachi like 'Hà Nội' -- Liệt kê các học sinh có địa chỉ ở Hà Nội
SELECT *
FROM hocsinh
where GioiTinh like 'nữ'
  and DiaChi like 'Hà nội' -- Danh sách các học sinh nữ có địa chỉ ở Hà Nội
SELECT *
FROM hocsinh
where NgaySinh Between '2005-01-01' and '2005-06-05' -- Cho biết những học sinh có ngày sinh từ ngày 01/01/2005 đến ngày 05/06/2005
Select *
from hocsinh
where DiaChi IN ('Hà Nội', 'Thái Bình', 'Cao Bằng')-- Danh sách những học sinh thuộc 1 trong các tỉnh Hà Nội, Thái Bình, Cao Bằng
Select *
from Lop
where siSo > 30 -- Cho biết những lớp có trên 30 học sinh và có giáo viên chủ nhiệm tên Quỳnh
SELECT *
FROM hocsinh hs
         INNER JOIN lop l ON l.lopID = hs.lopID
WHERE hs.GioiTinh = 'nam'
  AND l.Tinh = 'Hà Giang'
  AND l.LopSo = 5; -- Danh sách học sinh nam ở Hà Giang thuộc lớp số 5
Select *
from hocsinh
where Email is null-- Danh sách học sinh chưa có địa chỉ email
Select *
from hocSinh
where Year (NgaySinh) <> '2005' -- Danh sách những học sinh không sinh năm 2005
SELECT *
FROM hocsinh
ORDER BY HoTen;-- Liệt kê danh sách học sinh, họ tên sắp xếp theo thứ tự trong bảng chữ cái
Select *
from hocsinh
order by HocsinhID desc-- Liệt kê danh sách học sinh, sắp xếp theo thứ tự giảm dần của ID học sinh
SELECT *
FROM hocsinh
ORDER BY NgaySinh ASC, LopID DESC;-- Liệt kê danh sách học sinh, sắp xếp theo thứ tự ngày sinh tăng dần và lớp giảm dần.
Select *
from lop
order by SiSo ASC-- Liệt kê danh sách lớp tăng dần theo sĩ số
Select *
from HocSinh
where GioiTinh = 'nữ'
  and DiaChi = 'Hà Nội'
order by NgaySinh ASC-- Liệt kê danh sách học sinh nữ ở Hà Nội, sắp xếp tăng dần theo ngày sinh
Select *
from HocSinh
where diaChi not in ('Hà Nội', 'Lào Cao', 'Thanh Hóa')
order by LopID asc -- Liệt kê những học sinh mà địa chỉ không thuộc 1 trong các tỉnh Hà Nội, Lào Cai, Thanh Hóa, sắp xếp lớp tăng dần
Select DISTINCT diaChi
from HocSinh -- Liệt kê tất cả địa chỉ quê quán của học sinh (không được liệt kê trùng lặp)