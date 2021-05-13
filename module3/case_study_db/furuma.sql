create database furuma;
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


create table furuma.HopDong(
	IDHopDong int primary key,
    IDNhanVien INT,foreign key(IDNhanVien) references NhanVien(IDNhanVien),
	TenDichVu varchar(50),
	DienTich INT,
	SoTang INT,
	SoNguoiToiDa INT,
	ChiPhiThue INT,
	IDKieuThue varchar(50),
	IDLoaiDichVu varchar(50),
	TrangThai varchar(50)
);
create table furuma.HopDongChiTiet(
	IDHopDongChiTiet INT primary key,
    IDHopDong INT,
    IDDichVuDiKem INT,foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem),
    SoLuong INT
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


create  table furuma.KieuThue(
	IDKieuThue INT,
    KieuThue varchar(50),
    Gia INT
);
create table furuma.LoaiDichVu(
	IDLoaiDichVu INT,
    LoaiDichVu varchar(50)
);

