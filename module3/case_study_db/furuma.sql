create database furuma;
-- drop database furuma; 
create table furuma.TrinhDo(
	IDTrinhDo INT primary key,
    TrinhDo varchar(50)
);
create table furuma.BoPhan(
	IDBoPhan INT primary key,
    BoPhan varchar(50)
);
create table furuma.ViTri(
	IDViTri INT primary key,
    TenViTri varchar(50)
);
create table furuma.nhanvien(
	IDNhanVien INT primary key,
	hoTen varchar(50),
	IDTrinhDo INT ,foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
	IDBoPhan INT,foreign key(IDBoPhan) references BoPhan(IDBoPhan),
    IDViTri INT,foreign key(IDViTri) references ViTri(IDViTri),
	NgaySinh date,
	SoCMND varchar(20),
	Luong varchar(45),
	SDT varchar(15),
	Email varchar(50),
	Address varchar(45)
);
-- drop database furuma; 
create table furuma.DichVuDiKem(
	IDDichVuDiKem INT primary key,
    TenDichVuDiKem varchar(50),
    Gia INT,
    DonVi INT,
    TrangThaiKhaDung varchar(50)
    
);
create  table furuma.kieu_thue(
	id_kieu_thue INT primary key,
    KieuThue varchar(50),
    Gia INT
);
create table furuma.Loai_Dich_Vu(
	id_loai_dich_vu INT primary key,
    LoaiDichVu varchar(50)
);
create table furuma.dich_vu(
	id_dich_vu int primary key,
    ten_dich_vu varchar(50),
    dien_tich int,
    so_tang int,
    so_nguoi_toi_da int,
    chi_phi_thue int, 
    id_kieu_thue int, foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
    id_loai_dich_vu int, foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
    trang_thai varchar(45)
);

create table furuma.LoaiKhach(
	IDLoaiKhach INT primary key,
    LoaiKhach varchar(50)
);

create table furuma.KhachHang(
	IDKhachHang INT primary key,
    IDLoaiKhach INT,foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach),
    HoTen varchar(50),
    NgaySinh date,
    SoCMND varchar(50),
    SoDienThoai varchar(20),
    Email varchar(50),
    DiaChi varchar(100)
);

create table furuma.HopDong(
	IDHopDong int primary key,
    IDNhanVien INT,foreign key(IDNhanVien) references NhanVien(IDNhanVien),
    idkhachhang int, foreign key(idkhachhang) references khachhang(idkhachhang),
	TenDichVu varchar(50),
	DienTich INT,
	SoTang INT,
	SoNguoiToiDa INT,
	ChiPhiThue INT,
	IDKieuThue varchar(50),
	ID_Dich_Vu int,foreign key(id_dich_vu)references dich_vu(id_dich_vu),
	TrangThai varchar(50)
);

create table furuma.HopDongChiTiet(
	IDHopDongChiTiet INT primary key,
    IDHopDong INT,foreign key(idhopdong) references hopdong(idhopdong),
	IDDichVuDiKem INT,foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem),
    SoLuong INT
);





